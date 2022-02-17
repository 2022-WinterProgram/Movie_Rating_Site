package com.winter.ott.repository;

import com.winter.ott.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, String> {
    List<Movie> findMovieByActor1(String actor);
    List<Movie> findMovieByActor2(String actor);
    List<Movie> findMovieByActor3(String actor);
    List<Movie> findMovieByActor4(String actor);

    List<Movie> findMovieByTitle(String title);

    //search에 필요함
    List<Movie> findAllByTitle(String title);
    List<Movie> findAllByActor(String actor);
    List<Movie> findAllByDirector(String director);

}