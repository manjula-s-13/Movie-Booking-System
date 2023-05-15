package com.psl.BookingCatalog.APICalls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.psl.BookingCatalog.Entity.Booking;
import com.psl.BookingCatalog.Entity.Movie;
@Component
public class MovieAPICalls {

	@Autowired
	RestTemplate restTemplate;

	public Movie getmoviedata(Booking data) {
		Movie movie = restTemplate.getForObject("http://localhost:8084/MOVIE/getbyid/" + data.getMovieid(), Movie.class);
		return movie;
	}
}
