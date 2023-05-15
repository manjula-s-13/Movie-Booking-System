package com.psl.BookingCatalog.Service;

import java.util.List;

import com.psl.BookingCatalog.Entity.Booking;
import com.psl.BookingCatalog.Entity.ResponseOrder;

public interface BookingService {

	public List<Booking> List_Booking();

	public Booking addShowtime(Booking booking);

	public ResponseOrder getbyid(int id);

}
