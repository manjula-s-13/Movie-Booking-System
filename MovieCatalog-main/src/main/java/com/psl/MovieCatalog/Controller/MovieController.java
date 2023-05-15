package com.psl.MovieCatalog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.MovieCatalog.Entity.Movie;
import com.psl.MovieCatalog.Service.MovieService;

@RestController
@RequestMapping("MOVIE")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/List")
	public List<Movie> List_Movies(){
		return movieService.List_Movies();
		
	}
	
	@PostMapping("/insert")
	public Movie addMovie(@RequestBody Movie movie){
		return movieService.addMovie(movie);
		
	}
	
	@GetMapping("/getbyid/{id}")
	public Movie getbyid(@PathVariable("id") int id) {
		return movieService.getbyid(id);
	}

}
