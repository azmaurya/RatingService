package com.ratingservice.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratingservice.entities.Ratings;
import com.ratingservice.repository.RatingRepository;
import com.ratingservice.service.RatingService;

@Service
public class RatingsServiceImpl implements RatingService

{
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Ratings giveRating(Ratings rating) {
		
		String randomId = UUID.randomUUID().toString();
		
		rating.setRatingId(randomId);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Ratings> getAll() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public List<Ratings> getRatingByUserId(String UserId) {
		
		return ratingRepository.findByUserId(UserId);
	}

	@Override
	public List<Ratings> getRatingsByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

}
