package com.ratingservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ratingservice.entities.Ratings;

@Service
public interface RatingService {
	
	
	//create rating
	
	Ratings giveRating(Ratings rating); 
	
	
	//getAll ratings
	
	List<Ratings>getAll();
	
	
	//get All by userId
	
	List<Ratings> getRatingByUserId(String UserId);
	
	
	//get all by hotel
	
	List<Ratings> getRatingsByHotelId(String hotelId);
	

}
