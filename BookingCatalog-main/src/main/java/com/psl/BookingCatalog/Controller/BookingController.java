package com.psl.BookingCatalog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.psl.BookingCatalog.Entity.Booking;
import com.psl.BookingCatalog.Entity.ResponseOrder;
import com.psl.BookingCatalog.Service.BookingService;

@RestController

@RequestMapping("/BOOKING")
public class BookingController {
	@Autowired
	BookingService bookingService;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/List")
	public List<Booking> List_Booking() {
		return bookingService.List_Booking();
	}

	@PostMapping("/insert")
	public Booking addBooking(@RequestBody Booking booking) {
		return bookingService.addShowtime(booking);

	}

	@GetMapping("/Getbyid/{id}")
	public ResponseOrder getbyid(@PathVariable("id") int id) {

		return bookingService.getbyid(id);
	}
}
