package com.winter.ott.controller;

import com.winter.ott.dto.SearchMovieResponseDto;
import com.winter.ott.service.SearchMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchMovieController {

    private final SearchMovieService movieSearchService;

    @GetMapping("/{keyword}")
    public List<SearchMovieResponseDto> getMovieDataList(@PathVariable String keyword) {
        List<SearchMovieResponseDto> movieList = movieSearchService.searchMovies(keyword);
        System.out.println(keyword);
        return movieList;
    }
}
