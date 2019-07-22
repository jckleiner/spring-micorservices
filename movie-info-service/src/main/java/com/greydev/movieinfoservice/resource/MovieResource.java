package com.greydev.movieinfoservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greydev.movieinfoservice.model.Movie;

@RestController
public class MovieResource {

	@GetMapping("/movies/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		System.out.println("movieId is: " + movieId);
		Movie item1 = new Movie("MOVIE", "descr");
		return item1;
	}

}
