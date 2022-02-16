package com.winter.ott.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies/{movie-id}/reviews")
@Log4j2
@RequiredArgsConstructor
public class reviewController {




    //영화 리뷰 목록
    @GetMapping("/")
    public String index() {
        return "/movies/{movie-id}/reviews";
    }
/*

    /// 영화 리뷰 목록에서 내 리뷰를 클릭했을때
    // 포스트 모달 띄우기
    @GetMapping("/{review-id}/post")
    public void post(){log.info("review post.........................................");}

    // 포스팅을 하고 리뷰 페이지로
    @PostMapping("/{review-id}/post")
    public String postReview(){
        log.info("review post.........................................");
        return "redirect:/movies/{movie-id}/reviews";
    }
*/

/*
수정 기능 보류

    // 수정을 하고 리뷰페이지로
    @PatchMapping("/{review-id}/modify")
    public String modifyReview(){
        log.info("review modify.........................................");
        return "redirect:/movies/{movie-id}/reviews";
    }
*/

    // 삭제를 하고 리뷰 페이지로
    @DeleteMapping("/remove")
    public String deleteReview(){
        log.info("review delete........................................");
        return "redirect:/movies/{movie-id}/reviews";
    }



}
