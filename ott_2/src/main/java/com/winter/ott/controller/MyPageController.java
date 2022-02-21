package com.winter.ott.controller;


import com.winter.ott.dto.SearchMovieResponseDto;
import com.winter.ott.dto.SearchPickResponseDto;
import com.winter.ott.dto.SearchReviewResponseDto;
import com.winter.ott.dto.SearchReviewResponseDto;
import com.winter.ott.service.MovieDetailService;
import com.winter.ott.service.MyPagePickService;
import com.winter.ott.service.MyPageReviewService;
import com.winter.ott.service.SearchMovieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;





@RestController
@RequestMapping("/mypage")
@Log4j2
@RequiredArgsConstructor
public class MyPageController {

    private final MyPagePickService PickService;
    private final MyPageReviewService ReviewService;
    private final SearchMovieService movieSearchService;
    private final MovieDetailService movieDetailService;


    @GetMapping("/pick")
    public List<SearchMovieResponseDto> pickInfo() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails userDetails = (UserDetails)principal;
        String username = ((UserDetails) principal).getUsername();
        List<SearchPickResponseDto> moviePickList = PickService.searchPick(username);
        List<String> movieTitlePickList = PickService.searchPickTitle(username);


        log.info("found lists are these : " + movieTitlePickList);

        List<SearchMovieResponseDto> movieList = new ArrayList<>();


        for(String s : movieTitlePickList)
        {
            movieList.addAll(movieSearchService.searchMovies(s));
        }


        System.out.println(username);
        return movieList;
    }

    @GetMapping("/review")
    public List<SearchReviewResponseDto> reviewInfo() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails userDetails = (UserDetails)principal;
        String username = ((UserDetails) principal).getUsername();
        List<SearchReviewResponseDto> movieReviewList = ReviewService.searchReview(username);

        log.info("found review lists are these : " + movieReviewList);

        System.out.println(username);
        return movieReviewList;
    }



    @GetMapping("/{user-id}")
    public void userInfo() {
        log.info("user_info get...");
    }

    @PutMapping("/{user-id}/modify")
    public String modifyUserInfo() {
        return "redirect:/users/setting/{user-id}";
    }

    @DeleteMapping("/{user-id}/remove")
    public String removeUserInfo() {
        return "redirect:/diflixpedia";
    }

}


