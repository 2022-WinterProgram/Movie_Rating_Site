package com.winter.ott.service;


import com.winter.ott.dto.MainDto;
import com.winter.ott.dto.SearchMovieResponseDto;
import com.winter.ott.entity.Actor;
import com.winter.ott.entity.Movie;
import com.winter.ott.repository.ActorRepository;
import com.winter.ott.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MainService {
    private final ActorRepository actorRepository;
    private final MovieRepository movieRepository;

    public List<MainDto> showListByActor(String name){
        List<Movie> movieByActor1List = movieRepository.findMovieByActor1(name);
        List<MainDto> resultList = new ArrayList<>();

        for (Movie m : movieByActor1List){
            Movie movie = new Movie(m.getTitle(),m.getYear(),m.getCountry(),m.getPoster());
            resultList.add(new MainDto(movie));
        }

        return resultList;
    }

}
