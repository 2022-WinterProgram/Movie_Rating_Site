package com.winter.ott.service;

import com.winter.ott.dto.SearchMovieResponseDto;
import com.winter.ott.dto.SearchPickResponseDto;
import com.winter.ott.entity.Movie;
import com.winter.ott.entity.PickMemberMovie;
import com.winter.ott.repository.MemberMovieRepository;
import com.winter.ott.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequiredArgsConstructor
@Service
@Log4j2
public class MyPagePickService {

    private final MemberMovieRepository membermovieRepository;

    public List<SearchPickResponseDto> searchPick(String username) {
        List<PickMemberMovie> movieByUsername = membermovieRepository.findPickMemberMovieByUsername(username);

        List<SearchPickResponseDto> resultList = new ArrayList<>();

        for (PickMemberMovie p : movieByUsername) {
            PickMemberMovie pick = new PickMemberMovie(p.getUsername(), p.getTitle());
            resultList.add(new SearchPickResponseDto(pick));
        }

        return resultList;
    }

}
