package com.winter.ott.dto;


import com.winter.ott.entity.Movie;
import lombok.Data;

import javax.persistence.Column;

@Data
public class MovieDto {

    //영화 테이블에 있는거 다가져옴...
    private int id;
    private String title;
    private int year;
    private String age;
    private double imdb;
    private String rottenTomatoes;
    private int netflix;
    private int disney;
    private String directors;
    private String genres1;
    private String genres2;
    private String genres3;
    private String genres4;
    private String genres5;
    private String genres6;
    private String country;
    private String language;
    private int runtime;
    private String actor1;
    private String actor2;
    private String actor3;
    private String actor4;
    private String description;
    private String poster;



    public MovieDto(Movie movie) {
        this.title = movie.getTitle();
        this.year = movie.getYear();
        this.age = movie.getAge();
        this.imdb = movie.getImdb();
        this.rottenTomatoes=  movie.getRottenTomatoes();
        this.disney = movie.getDisney();
        this.directors = movie.getDirectors();
        this.genres1 = movie.getGenres1();
        this.genres2 = movie.getGenres2();
        this.genres3 = movie.getGenres3();
        this.genres4 = movie.getGenres4();
        this.genres5 = movie.getGenres5();
        this.genres6 = movie.getGenres6();
        this.country = movie.getCountry();
        this.language = movie.getLanguage();
        this.runtime = movie.getRuntime();
        this.actor1 = movie.getActor1();
        this.actor2 = movie.getActor2();
        this.actor3 = movie.getActor3();
        this.actor4 = movie.getActor4();
        this.description = movie.getDescription();
        this.poster= movie.getPoster();
        
    }
}
