package com.psl.ShowtimeCatalog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psl.ShowtimeCatalog.Entity.Showtime;
@Repository
public interface ShowtimeRepo extends JpaRepository<Showtime, Integer>{

}
