package com.winter.ott.repository;

import com.winter.ott.entity.Actor;
import com.winter.ott.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, String> {

    List<Movie> findMovieByTitle(String title);

    List<Movie> showMovieList(String name);
    List<Movie> showMovieListSortedByIMDB();
    List<Movie> ShowMovieListByGenre();
    List<Movie> showMovieListInNetflix();
    List<Movie> showMovieListInDiseny();

}
