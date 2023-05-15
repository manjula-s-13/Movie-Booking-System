package com.psl.BookingCatalog.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseOrder {
	private int bookingid;

	private String moviename;

	private String starttime;

	private String theatre;

	private String userName;

	private String phoneNumber;

	private int NoOfSeats;

	private int price;
}
