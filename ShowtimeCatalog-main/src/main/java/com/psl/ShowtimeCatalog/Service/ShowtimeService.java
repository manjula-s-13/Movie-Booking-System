package com.psl.ShowtimeCatalog.Service;

import java.util.List;

import com.psl.ShowtimeCatalog.Entity.Showtime;

public interface ShowtimeService {

	public List<Showtime> List_Showtime();

	public Showtime addShowtime(Showtime showtime);

	public Showtime getbyid(int id);

}
