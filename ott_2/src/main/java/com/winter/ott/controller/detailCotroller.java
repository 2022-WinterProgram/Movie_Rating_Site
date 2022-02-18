package com.winter.ott.controller;

import com.winter.ott.dto.MovieDto;
import com.winter.ott.dto.MovieReviewDto;
import com.winter.ott.dto.TipDto;
import com.winter.ott.entity.Tip;
import com.winter.ott.service.MovieDetailService;
import com.winter.ott.service.MovieReviewService;
import com.winter.ott.service.TipService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//import com.winter.ott.dto

@RestController
@RequestMapping("/movies/{movie_id}")
@Log4j2
@RequiredArgsConstructor
public class detailCotroller {

    private final MovieDetailService movieDetailService;
    // movie info page
    @GetMapping("")
    public List<MovieDto> movieInfo(@PathVariable String movie_id) {
        List<MovieDto> movieInfo = movieDetailService.showMovieInfo(movie_id);


        //System.out.println(movie_id);
        return movieInfo;
    }
    @GetMapping("/")
    public String index() {return "/movies/{movie-id}";}

    // movie detail
    @GetMapping("/details")
    public void details(){log.info("details get...");}

    ///
    // get reviews
    private final MovieReviewService movieReviewService;
    @GetMapping("/reviews")
    public List<MovieReviewDto> review(@PathVariable String movie_id){

        List<MovieReviewDto> reviews = movieReviewService.showReview(movie_id);
        log.info("reviews~~~");
        return reviews;
    }

    // get review modal
    @GetMapping("/reviews/{review-id}/post")
    public void review(){log.info("review post.........................................");}

    // post
    @PostMapping("/reviews/{review-id}/post")
    public String postReview(){
        log.info("review post.........................................");
        return "redirect:/movies/{movie-id}/reviews";
    }


    ///
    // tip modal
    private final TipService tipService;
    @GetMapping("/tips")
    public List<TipDto> Tip(@PathVariable String movie_id){

        List<TipDto> tips = tipService.showTip(movie_id);

        log.info("tip post");
        return tips;
    }
    //post tip
    @PostMapping("/tips")
    public String postTip(){

        log.info("tip post");
        //
        //
        //
        String text="";
        return "/movies/{movie-id}";
    }

/* modify tip

    @PutMapping("/tips/modify")
    public String modifyTip(){

        log.info("tip modify");
        //
        //
        //
        String text="";
        return text;

    }

*/



}
