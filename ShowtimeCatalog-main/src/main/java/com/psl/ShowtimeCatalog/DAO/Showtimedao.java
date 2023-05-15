package com.psl.ShowtimeCatalog.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.psl.ShowtimeCatalog.Entity.Showtime;
import com.psl.ShowtimeCatalog.Repository.ShowtimeRepo;
@Repository
public class Showtimedao {

	@Autowired
	ShowtimeRepo showtimerepo;
	
	public List<Showtime> List_Showtime() {
		return showtimerepo.findAll();
	}

	public Showtime addShowtime(Showtime showtime) {
		return showtimerepo.save(showtime);
	}

	public Showtime getbyid(int id) {
		return showtimerepo.findById(id).get();
	}

}
