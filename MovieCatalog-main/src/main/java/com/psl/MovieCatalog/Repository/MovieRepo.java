package com.psl.MovieCatalog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psl.MovieCatalog.Entity.Movie;
@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer>{

}
