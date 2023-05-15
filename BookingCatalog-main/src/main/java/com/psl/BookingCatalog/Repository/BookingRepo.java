package com.psl.BookingCatalog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psl.BookingCatalog.Entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

}
