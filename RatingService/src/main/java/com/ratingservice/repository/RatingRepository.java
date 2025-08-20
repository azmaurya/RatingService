package com.ratingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratingservice.entities.Ratings;

public interface RatingRepository extends JpaRepository<Ratings,String>{
	
	
	//Custome finder Method
	
	List<Ratings>findByUserId(String userId);
	
	List<Ratings>findByHotelId(String hotelId);

}
