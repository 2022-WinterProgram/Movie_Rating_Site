package com.winter.ott.dto;


import com.winter.ott.entity.Movie;
import com.winter.ott.entity.Actor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MainDto {
    //영화 정보
    private String title;
    private String image_url;
    private int year;
    private String country;
    private double imdb;
    private String actor;

    //유저 정보




    public MainDto(Movie movie){
        this.title = movie.getTitle();
        this.image_url = movie.getPoster();
        this.year = movie.getYear();
        this.country = movie.getCountry();
        this.imdb = movie.getImdb();
        this.actor = movie.getActor1();
    }
}


