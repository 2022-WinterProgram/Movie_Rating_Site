package com.winter.ott.repository;

import com.winter.ott.entity.Actor;
import com.winter.ott.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, String> {
    //search
    List<Movie> findMovieByTitle(String title);
    //main
    List<Movie> findMovieByActor1(String name);
//    List<Movie> findMovieByImdb(double score);
//    List<Movie> findMovieByDisney(int is_diseny);
//    List<Movie> findMovieByNetflix(int is_netflix);
//    List<Movie> findMovieByGenre2(String genre);

}
