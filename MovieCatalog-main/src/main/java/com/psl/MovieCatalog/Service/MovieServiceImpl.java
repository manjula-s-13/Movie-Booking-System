package com.psl.MovieCatalog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.MovieCatalog.DAO.Moviedao;
import com.psl.MovieCatalog.Entity.Movie;
@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	Moviedao moviedao;

	@Override
	public List<Movie> List_Movies() {
	
		return moviedao.List_Movies();
	}

	@Override
	public Movie addMovie(Movie movie) {
		return moviedao.addMovie(movie);
	}

	@Override
	public Movie getbyid(int id) {
		return moviedao.getbyid(id);
	}

}
