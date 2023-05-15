package com.psl.BookingCatalog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.BookingCatalog.DAO.Bookingdao;
import com.psl.BookingCatalog.Entity.Booking;
import com.psl.BookingCatalog.Entity.ResponseOrder;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	Bookingdao bookingdao;

	@Override
	public List<Booking> List_Booking() {
		return bookingdao.List_Booking();
	}

	@Override
	public Booking addShowtime(Booking booking) {
		return bookingdao.addShowtime(booking);
	}

	@Override
	public ResponseOrder getbyid(int id) {

		return bookingdao.getbyid(id);
	}

}
