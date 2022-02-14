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

    public Movie(String mTitle, int year, String country, String poster) {
        this.title = mTitle;
        this.year = year;
        this.country = country;
        this.poster = poster;
    }

}
