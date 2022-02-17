package com.winter.ott.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "movie")
public class Movie {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "m_title")
    private String title;

    @Column(name = "m_Year")
    private int year;

    @Column(name = "Age", columnDefinition = "TEXT")
    private String age;

    @Column(name = "IMDb")
    private double imdb;

    @Column(name = "`RottenTomatoes`")
    private String rottenTomatoes;

    @Column(name = "Netflix")
    private int netflix;

    @Column(name = "`Disney+`")
    private int disney;

    @Column(name = "Directors", columnDefinition = "TEXT")
    private String directors;

    @Column(name = "Genres1", columnDefinition = "TEXT")
    private String genres1;

    @Column(name = "Genres2", columnDefinition = "TEXT")
    private String genres2;

    @Column(name = "Genres3", columnDefinition = "TEXT")
    private String genres3;

    @Column(name = "Genres4", columnDefinition = "TEXT")
    private String genres4;

    @Column(name = "Genres5", columnDefinition = "TEXT")
    private String genres5;

    @Column(name = "Genres6", columnDefinition = "TEXT")
    private String genres6;

    @Column(name = "Country", columnDefinition = "TEXT")
    private String country;

    @Column(name = "Language", columnDefinition = "TEXT")
    private String language;

    @Column(name = "Runtime")
    private int runtime;

    @Column(name = "`Actor 1`", columnDefinition = "TEXT")
    private String actor1;

    @Column(name = "`Actor 2`", columnDefinition = "TEXT")
    private String actor2;

    @Column(name = "`Actor 3`", columnDefinition = "TEXT")
    private String actor3;

    @Column(name = "`Actor 4`", columnDefinition = "TEXT")
    private String actor4;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "Poster", columnDefinition = "TEXT")
    private String poster;

    @ManyToOne
    @JoinColumn(name = "actor_a_code")
    private Actor actor;

    public Movie(String title, int year, String country, String poster) {
        this.title = title;
        this.year = year;
        this.country = country;
        this.poster = poster;
    }

    public Movie(String mTitle, int year, String country, String poster, double imdb) {

        this.title = mTitle;
        this.year = year;
        this.country = country;
        this.poster = poster;
        this.imdb = imdb;

    }

    public Movie(String title, int year, String age, double imdb, String rottenTomatoes, int netflix, int disney,
                 String directors, String genres1, String genres2, String genres3, String genres4, String genres5, String genres6,
                 String country, String language, int runtime, String actor1, String actor2, String actor3, String actor4,
                 String description, String poster) {
        this.title = title;
        this.year = year;
        this.age = age;
        this.imdb = imdb;
        this.rottenTomatoes = rottenTomatoes;
        this.netflix = netflix;
        this.disney = disney;
        this.directors = directors;
        this.genres1 = genres1;
        this.genres2 = genres2;
        this.genres3 = genres3;
        this.genres4 = genres4;
        this.genres5 = genres5;
        this.genres6 = genres6;
        this.country = country;
        this.language = language;
        this.runtime = runtime;
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
        this.actor4 = actor4;
        this.description = description;
        this.poster = poster;
    }






}