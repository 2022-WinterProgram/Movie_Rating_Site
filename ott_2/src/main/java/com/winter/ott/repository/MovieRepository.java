package com.winter.ott.repository;

import com.winter.ott.entity.Actor;
import com.winter.ott.entity.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, String> {
    //search
    List<Movie> findMovieByTitle(String title);
    //main
    List<Movie> findMovieByActor1(String name);
    List<Movie> findMovieByActor2(String name);
    List<Movie> findMovieByActor3(String name);
    List<Movie> findMovieByActor4(String name);

    List<Movie> findMovieByGenres1(String genre);
    List<Movie> findMovieByGenres2(String genre);
    List<Movie> findMovieByGenres3(String genre);
    List<Movie> findMovieByGenres4(String genre);
    List<Movie> findMovieByGenres5(String genre);
    List<Movie> findMovieByGenres6(String genre);

    @Query("select m from Movie m")
    List<Movie> findIMDbTop10(Pageable paging);

//    List<Movie> findMovieByImdb(double score);
//    List<Movie> findMovieByDisney(int is_diseny);
//    List<Movie> findMovieByNetflix(int is_netflix);
//    List<Movie> findMovieByGenre2(String genre);

}
