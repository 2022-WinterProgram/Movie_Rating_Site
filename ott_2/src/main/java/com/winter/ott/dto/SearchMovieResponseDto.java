package com.winter.ott.dto;

import com.winter.ott.entity.Movie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SearchMovieResponseDto {
    private String title;
    private String image_url;
    private int year;
    private String country;

    public SearchMovieResponseDto(Movie movie) {
        this.title = movie.getTitle();
        this.image_url = movie.getPoster();
        this.year = movie.getYear();
        this.country = movie.getCountry();
    }
}
