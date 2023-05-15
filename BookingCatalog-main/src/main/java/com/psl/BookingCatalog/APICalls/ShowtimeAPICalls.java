package com.psl.BookingCatalog.APICalls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.psl.BookingCatalog.Entity.Booking;
import com.psl.BookingCatalog.Entity.Showtime;
@Component
public class ShowtimeAPICalls {

	@Autowired
	RestTemplate restTemplate;

	public Showtime getShowtimedata(Booking data) {
		Showtime showtime = restTemplate.getForObject("http://localhost:8082/SHOWTIME/getbyid/" + data.getShowtimeid(),
				Showtime.class);
		return showtime;
	}
}