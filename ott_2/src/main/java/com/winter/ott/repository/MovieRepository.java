package com.winter.ott.repository;

import com.winter.ott.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, String> {

    List<Movie> findMovieByTitle(String title);

    List<Movie> findMovieByActor(String actor);

    List<Movie> findMovieByDirector(String director);

}
