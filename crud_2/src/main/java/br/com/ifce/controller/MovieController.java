package br.com.ifce.controller;

import br.com.ifce.model.Movie;
import br.com.ifce.service.MovieService;

public class MovieController {
	
	private MovieService  movieService;
	
	public void movieController(Movie movie) {
		
		movieService.registerService(movie);
		
	}
	

}
