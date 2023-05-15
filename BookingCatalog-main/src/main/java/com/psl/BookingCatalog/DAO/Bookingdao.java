package com.psl.BookingCatalog.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.psl.BookingCatalog.APICalls.MovieAPICalls;
import com.psl.BookingCatalog.APICalls.ShowtimeAPICalls;
import com.psl.BookingCatalog.Entity.Booking;
import com.psl.BookingCatalog.Entity.Movie;
import com.psl.BookingCatalog.Entity.ResponseOrder;
import com.psl.BookingCatalog.Entity.Showtime;
import com.psl.BookingCatalog.Repository.BookingRepo;

@Repository
public class Bookingdao {

	@Autowired
	BookingRepo bookingrepo;
	@Autowired
	MovieAPICalls movieApiCalls;
	@Autowired
	ShowtimeAPICalls showtimeApiCalls;
	

	public List<Booking> List_Booking() {

		return bookingrepo.findAll();
	}

	public Booking addShowtime(Booking booking) {

		return bookingrepo.save(booking);
	}

	public ResponseOrder getbyid(int id) {
		return bookingrepo.findById(id).map(data -> {
			Movie movie = movieApiCalls.getmoviedata(data);
			Showtime showtime = showtimeApiCalls.getShowtimedata(data);
			return new ResponseOrder(data.getBookingid(), movie.getName(), showtime.getStarttime(),
					showtime.getTheatre(), data.getUserName(), data.getPhoneNumber(), data.getNoOfSeats(),
					data.getPrice());
		}).orElse(null);
	}
}
