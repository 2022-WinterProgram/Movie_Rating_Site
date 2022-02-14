package com.winter.ott.service;


import com.winter.ott.dto.MainDto;
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

    public List<MainDto> showMovieList(String name){
        List<Movie> ChrisEvansList = movieRepository.showMovieList("Chris Evans");
        List<MainDto> resultList = new ArrayList<>();



    }
}
