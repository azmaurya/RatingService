package com.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratingservice.entities.Ratings;
import com.ratingservice.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingsController {
	
	@Autowired
	private RatingService ratingservice;
	//create
	
	@PostMapping
	public Ratings creat(@RequestBody Ratings ratin)
	{
		return ratingservice.giveRating(ratin);
	}
	
	
	//getAll
	
	@GetMapping
	List<Ratings> getAll()
	{
		return ratingservice.getAll();
				
	}
	
	
	//get rating by user id
	
	@GetMapping("/users/{userId}")
	List<Ratings> getByuserId(@PathVariable String userId)
	{
		return ratingservice.getRatingByUserId(userId);
	}
	
	//get rating by hotel id
	
	@GetMapping("/hotels/{id}")
	List<Ratings> getByHotelId(@PathVariable String id)
	{
		return ratingservice.getRatingsByHotelId(id);
	}
	
	
	
	
	
	

}
