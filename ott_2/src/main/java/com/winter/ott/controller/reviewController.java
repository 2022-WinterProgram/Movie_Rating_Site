package com.winter.ott.controller;


import lombok.extern.log4j.Log4j2;          // console print
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies/movie-id/reviews")
@Log4j2
public class reviewController {

    @GetMapping("/")
    public String index() {
        return "/movies/movie-id/reviews";
    }

    // 수정을 하고 리뷰페이지로
    @PatchMapping("/review-id/modify")
    public String modifyReview(){
        log.info("리뷰 modify.........................................");
        return "redirect:/movies/movie-id/reviews";
    }

    // 삭제를 하고 리뷰 페이지로
    @DeleteMapping("/tips/remove")
    public String deleteReview(){
        log.info("리뷰 delete........................................");
        return "redirect:/movies/movie-id/reviews";
    }

    // 포스팅을 하고 리뷰 페이지로
    @PostMapping("/review-id/post")
    public String postReview(){
        log.info("리뷰 post.........................................");
        return "redirect:/movies/movie-id/reviews";
    }

}
