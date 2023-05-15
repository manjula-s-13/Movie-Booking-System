package com.psl.ShowtimeCatalog.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Showtime {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int showtimeid;
		
		private int movieid;
		
		private String starttime;
		
		private String endtime;
		
		private String theatre;
		
		private int availableseats;
	}



