package com.winter.ott.repository;

import com.winter.ott.entity.Movie;
import com.winter.ott.entity.Tip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipRepository extends JpaRepository<Tip, String> {


     List<Tip> findTipByMovieName(String movieName);


}
