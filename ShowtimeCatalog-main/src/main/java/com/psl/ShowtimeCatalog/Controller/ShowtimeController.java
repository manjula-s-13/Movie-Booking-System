package com.psl.ShowtimeCatalog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psl.ShowtimeCatalog.Entity.Showtime;
import com.psl.ShowtimeCatalog.Service.ShowtimeService;



@RestController
@RequestMapping("/SHOWTIME")
public class ShowtimeController {
	@Autowired
	ShowtimeService showtimeService;
	
	@GetMapping("/List")
	public List<Showtime> List_Showtime(){
		return showtimeService.List_Showtime();
		
	}
	
	@PostMapping("/insert")
	public Showtime addMovie(@RequestBody Showtime showtime){
		return showtimeService.addShowtime(showtime);
		
	}
	
	@GetMapping("/getbyid/{id}")
	public Showtime getbyid(@PathVariable("id") int id) {
		return showtimeService.getbyid(id);
	}
	
}
