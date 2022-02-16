package com.winter.ott.controller;

import com.winter.ott.dto.MovieDto;
import com.winter.ott.service.MovieDetailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import com.winter.ott.dto

@RestController
@RequestMapping("/movies/{movie_id}")
@Log4j2
@RequiredArgsConstructor
public class detailCotroller {

    private final MovieDetailService movieDetailService;
    // ��ȭ �⺻ ���� ��ȯ
    @GetMapping("")
    public List<MovieDto> movieInfo(@PathVariable String movie_id) {
        List<MovieDto> movieInfo = movieDetailService.showMovieInfo(movie_id);
        //System.out.println(movie_id);
        return movieInfo;
    }
    // 영화 기본 정보 반환
    @GetMapping("/")
    public String index() {return "/movies/{movie-id}";}

    // 영화 상세 정보
    @GetMapping("/details")
    public void details(){log.info("details get...");}

    /// 평가하기 눌렀을때
    // 포스트 모달 띄우기
    @GetMapping("/reviews/{review-id}/post")
    public void review(){log.info("review post.........................................");}

    // 포스팅을 하고 리뷰 페이지로
    @PostMapping("/reviews/{review-id}/post")
    public String postReview(){
        log.info("review post.........................................");
        return "redirect:/movies/{movie-id}/reviews";
    }


    /// 팁 더보기 눌렀을때
    // 모달창 띄우기
    @GetMapping("/tips")
    public void Tip(){ log.info("팁 post");
    }
    //팁 작성
    @PostMapping("/tips")
    public String postTip(){

        log.info("팁 post");
        //
        // 코드작성
        //
        String text="";
        return "/movies/{movie-id}";
    }

/* 팁 수정하기

    @PutMapping("/tips/modify")
    public String modifyTip(){

        log.info("팁 modify");
        //
        // 코드작성
        //
        String text="";
        return text;

    }

*/



}
