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
    //��ȭ ����
    private String title;
    private String image_url;
    private int year;
    private String country;
    private double imdb;
    private String actor;

    //���� ����




    public MainDto(Movie movie){
        this.title = movie.getTitle();
        this.image_url = movie.getPoster();
        this.year = movie.getYear();
        this.country = movie.getCountry();
        this.imdb = movie.getImdb();
        this.actor = movie.getActor1();
    }
}


