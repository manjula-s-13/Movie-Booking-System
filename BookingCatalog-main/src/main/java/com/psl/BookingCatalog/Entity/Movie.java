package com.psl.BookingCatalog.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieid;
	private String name;
	private String description;
	private String duration;
	private String genre;

	public Movie(String name, String description, String duration, String genre) {
		super();
		this.name = name;
		this.description = description;
		this.duration = duration;
		this.genre = genre;
	}

}
