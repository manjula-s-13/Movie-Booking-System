package com.psl.ShowtimeCatalog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.ShowtimeCatalog.DAO.Showtimedao;
import com.psl.ShowtimeCatalog.Entity.Showtime;
@Service
public class ShowtimeServiceImpl implements ShowtimeService{
	
	@Autowired
	Showtimedao showtimedao;

	@Override
	public List<Showtime> List_Showtime() {
		
		return showtimedao.List_Showtime();
	}

	@Override
	public Showtime addShowtime(Showtime showtime) {
		return showtimedao.addShowtime(showtime);
	}

	@Override
	public Showtime getbyid(int id) {
		return showtimedao.getbyid(id);
	}

}
