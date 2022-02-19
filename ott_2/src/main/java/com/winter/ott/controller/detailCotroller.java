package com.winter.ott.controller;

import com.winter.ott.dto.MovieDto;
import com.winter.ott.dto.MovieReviewDto;
import com.winter.ott.dto.SearchPickResponseDto;
import com.winter.ott.dto.TipDto;
import com.winter.ott.entity.PickMemberMovie;
import com.winter.ott.entity.Review;
import com.winter.ott.entity.Tip;
import com.winter.ott.service.MovieDetailService;
import com.winter.ott.service.MovieReviewService;
import com.winter.ott.service.MyPagePickService;
import com.winter.ott.service.TipService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        log.info("reviews~~~ list");
        return reviews;
    }

    // get review modal (write review)
    @GetMapping("/reviews/write")
    public void review(){

        log.info("review post.........................................");
    }

    // post

    @PostMapping("/reviews/write")
    public String postReview(@PathVariable String movie_id, @RequestBody Map<String, String> param){

        log.info("review post.........................................");

        Review review = new Review(param.get("memberReview"),movie_id, param.get("memberRate"));
        movieReviewService.reviewPost(review);
        return "redirect:/movies/reviews";
    }


    ///
    // tip modal list?
    private final TipService tipService;
    @GetMapping("/tips")
    public List<TipDto> Tip(@PathVariable String movie_id){

        List<TipDto> tips = tipService.showTip(movie_id);

        log.info("tip list~");
        return tips;
    }

    // get tip modal (write tip)
    @GetMapping("/tips/write")
    public void Tip(){log.info("tip modal.........................................");}

    //post tip
    @PostMapping("/tips/write")

    public String postTip(@PathVariable String movie_id, @RequestBody Map<String, String> param){


        Tip tip = new Tip(param.get("memberTip"), movie_id);
        tipService.tipPost(tip);
        log.info("tip post");

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
    private final MyPagePickService pickService;
    @GetMapping("/pick/save")
    public void savePick(@PathVariable String movie_id){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = ((UserDetails) principal).getUsername();

        PickMemberMovie pickMovie = new PickMemberMovie(username, movie_id);
        pickService.savePick(pickMovie);

        System.out.println(username);


    }

    @GetMapping("/pick/delete")
    public void deletePick(@PathVariable String movie_id){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = ((UserDetails) principal).getUsername();

        PickMemberMovie pickMovie = new PickMemberMovie(username, movie_id);
        pickService.deletePick(pickMovie);

        System.out.println(username);
    }



}
