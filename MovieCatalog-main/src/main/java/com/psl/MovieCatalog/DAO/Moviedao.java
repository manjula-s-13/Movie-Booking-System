package com.psl.MovieCatalog.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.psl.MovieCatalog.Entity.Movie;
import com.psl.MovieCatalog.Repository.MovieRepo;
@Repository
public class Moviedao {
	
	@Autowired
	MovieRepo movieRepository;

	public List<Movie> List_Movies() {

		return movieRepository.findAll();
	}

	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	public Movie getbyid(int id) {
		 return movieRepository.findById(id).get();
	}

}
