package com.winter.ott.service;


import com.winter.ott.dto.MainDto;
import com.winter.ott.dto.MovieDto;
import com.winter.ott.dto.SearchMovieResponseDto;
import com.winter.ott.entity.Movie;
import com.winter.ott.repository.ActorRepository;
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
/*
    private final ActorRepository actorRepository;
    private final MovieRepository movieRepository;

    public List<MovieDto> showMovieInfo(String name){
        List<Movie> movieByActor1List = movieRepository.findMovieByActor1(name);
        List<MovieDto> resultList = new ArrayList<>();

        for (Movie m : movieByActor1List){
            Movie movie = new Movie(m.getTitle(),m.getYear(),m.getCountry(),m.getPoster());
            resultList.add(new MovieDto(movie));
        }

        return resultList;
    }
*/
//

}
