package com.psl.MovieCatalog.Service;

import java.util.List;

import com.psl.MovieCatalog.Entity.Movie;

public interface MovieService {

	public List<Movie> List_Movies();

	public Movie addMovie(Movie movie);

	public Movie getbyid(int id);

}
