package com.winter.ott.service;


import com.winter.ott.dto.MainDto;
import com.winter.ott.dto.SearchMovieResponseDto;
import com.winter.ott.entity.Actor;
import com.winter.ott.entity.Movie;
import com.winter.ott.repository.ActorRepository;
import com.winter.ott.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MainService {
    private final ActorRepository actorRepository;
    private final MovieRepository movieRepository;

    public List<MainDto> listByActor(String name){
        List<Movie> movieByActor1List = movieRepository.findMovieByActor1(name);
        List<Movie> movieByActor2List = movieRepository.findMovieByActor2(name);
        List<Movie> movieByActor3List = movieRepository.findMovieByActor3(name);
        List<Movie> movieByActor4List = movieRepository.findMovieByActor4(name);

        List<MainDto> resultList = new ArrayList<>();

        if(movieByActor1List != null){
            for (Movie m : movieByActor1List){
                Movie movie = new Movie(m.getTitle(),m.getYear(),m.getCountry(),m.getPoster(),m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }
        if(movieByActor2List != null){
            for (Movie m : movieByActor2List){
                Movie movie = new Movie(m.getTitle(),m.getYear(),m.getCountry(),m.getPoster(),m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }

        if(movieByActor3List != null){
            for (Movie m : movieByActor3List){
                Movie movie = new Movie(m.getTitle(),m.getYear(),m.getCountry(),m.getPoster(),m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }

        if(movieByActor4List != null){
            for (Movie m : movieByActor4List){
                Movie movie = new Movie(m.getTitle(),m.getYear(),m.getCountry(),m.getPoster(),m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }



        return resultList;
    }

    public List<MainDto> listByGenre(String genre) {
        List<Movie> movieByGenres1List = movieRepository.findMovieByGenres1(genre);
        List<Movie> movieByGenres2List = movieRepository.findMovieByGenres2(genre);
        List<Movie> movieByGenres3List = movieRepository.findMovieByGenres3(genre);
        List<Movie> movieByGenres4List = movieRepository.findMovieByGenres4(genre);
        List<Movie> movieByGenres5List = movieRepository.findMovieByGenres5(genre);
        List<Movie> movieByGenres6List = movieRepository.findMovieByGenres6(genre);
        List<MainDto> resultList = new ArrayList<>();

        if (movieByGenres1List != null) {
            for (Movie m : movieByGenres1List) {
                Movie movie = new Movie(m.getTitle(), m.getYear(), m.getCountry(), m.getPoster(), m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }
        if (movieByGenres2List != null) {
            for (Movie m : movieByGenres2List) {
                Movie movie = new Movie(m.getTitle(), m.getYear(), m.getCountry(), m.getPoster(), m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }
        if (movieByGenres3List != null) {
            for (Movie m : movieByGenres3List) {
                Movie movie = new Movie(m.getTitle(), m.getYear(), m.getCountry(), m.getPoster(), m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }
        if (movieByGenres4List != null) {
            for (Movie m : movieByGenres4List) {
                Movie movie = new Movie(m.getTitle(), m.getYear(), m.getCountry(), m.getPoster(), m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }

        if (movieByGenres5List != null) {
            for (Movie m : movieByGenres5List) {
                Movie movie = new Movie(m.getTitle(), m.getYear(), m.getCountry(), m.getPoster(), m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }
        if (movieByGenres6List != null) {
            for (Movie m : movieByGenres6List) {
                Movie movie = new Movie(m.getTitle(), m.getYear(), m.getCountry(), m.getPoster(), m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }

        return resultList;
    }

    public List<MainDto> listByImdb(){
        Pageable paging = (Pageable) PageRequest.of(0,10, Sort.Direction.DESC,"imdb");
        List<Movie> movieOrderByImdbDescList = movieRepository.findIMDbTop10(paging);
        List<MainDto> resultList = new ArrayList<>();

        if(movieOrderByImdbDescList != null){
            for (Movie m : movieOrderByImdbDescList){
                Movie movie = new Movie(m.getTitle(),m.getYear(),m.getCountry(),m.getPoster(),m.getImdb());
                resultList.add(new MainDto(movie));
            }
        }
        return resultList;
    }



}
