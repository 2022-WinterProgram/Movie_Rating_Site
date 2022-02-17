package com.winter.ott.service;

import com.winter.ott.dto.SearchMovieResponseDto;
import com.winter.ott.entity.Movie;
import com.winter.ott.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchMovieService {

    private final MovieRepository movieRepository;

    public List<SearchMovieResponseDto> searchMovies(String keyword) {
        List<Movie> movieByTitleList = movieRepository.findAllByTitle(keyword);
        List<Movie> movieByActorList = movieRepository.findAllByActor(keyword);
        List<Movie> movieByDirectorList = movieRepository.findAllByDirectors(keyword);
        List<SearchMovieResponseDto> resultList = new ArrayList<>();

        for (Movie m : movieByTitleList) {
            Movie movie = new Movie(m.getTitle(), m.getYear(), m.getCountry(), m.getPoster());
            resultList.add(new SearchMovieResponseDto(movie));
        }
        for (Movie m : movieByActorList) {
            Movie movie = new Movie(m.getTitle(), m.getYear(), m.getCountry(), m.getPoster());
            resultList.add(new SearchMovieResponseDto(movie));
        }
        for (Movie m : movieByDirectorList) {
            Movie movie = new Movie(m.getTitle(), m.getYear(), m.getCountry(), m.getPoster());
            resultList.add(new SearchMovieResponseDto(movie));
        }

        return resultList;
    }


}