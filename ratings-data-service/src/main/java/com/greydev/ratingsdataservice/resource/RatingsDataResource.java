package com.greydev.ratingsdataservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greydev.ratingsdataservice.model.Rating;

@RestController
public class RatingsDataResource {

	@GetMapping("/ratingsdata/{movieId}")
	public Rating getMovieInfo(@PathVariable String movieId) {
		Rating item1 = new Rating("RATING", 4);
		return item1;
	}

}
