package com.winter.ott.repository;

import com.winter.ott.entity.Movie;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, String> {
    List<Movie> findMovieByActor1(String actor);
    List<Movie> findMovieByActor2(String actor);
    List<Movie> findMovieByActor3(String actor);
    List<Movie> findMovieByActor4(String actor);

    List<Movie> findMovieByTitle(String title);

    List<Movie> findMovieByGenres1(String genre);
    List<Movie> findMovieByGenres2(String genre);
    List<Movie> findMovieByGenres3(String genre);
    List<Movie> findMovieByGenres4(String genre);
    List<Movie> findMovieByGenres5(String genre);
    List<Movie> findMovieByGenres6(String genre);


    @Query("select m from Movie m")
    List<Movie> findIMDbTop10(Pageable paging);



    //search
    @Query( value = "SELECT p FROM Movie p WHERE p.title LIKE %:title% ")
    List<Movie> findAllByTitle(String title);


}