package com.winter.ott.service;


import com.winter.ott.dto.MovieDto;
import com.winter.ott.entity.Movie;
import com.winter.ott.repository.MovieRepository;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class MovieDetailService {

    private final MovieRepository movieRepository;
    //영화를 전부넣는다?
    public List<MovieDto> showMovieInfo(String title) {
        List<Movie> movieInfo = movieRepository.findMovieByTitle(title);
        //List<Movie> movieInfo = movieRepository.findAll();
        List<MovieDto> resultList = new ArrayList<>();

        for (Movie m : movieInfo) {
            Movie movie = new Movie(m.getTitle(),m.getYear(),m.getAge(),m.getImdb(),m.getRottenTomatoes(),m.getNetflix(),m.getDisney(),
                    m.getDirectors(),m.getGenres1(),m.getGenres2(),m.getGenres3(),m.getGenres4(),m.getGenres5(),m.getGenres6(),m.getCountry(),
                    m.getLanguage(),m.getRuntime(),m.getActor1(),m.getActor2(),m.getActor3(),m.getActor4(),m.getDescription(),m.getPoster());
            resultList.add(new MovieDto(movie));
        }

        return resultList;
    }


}
