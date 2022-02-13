package com.winter.ott.controller;


import lombok.extern.log4j.Log4j2;          //�ܼ����
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies/movie-id/reviews")
@Log4j2
public class reviewController {

    @GetMapping("/")
    public String index() {
        return "/movies/movie-id/reviews";
    }

    // ������ �ϰ� ������������
    @PatchMapping("/review-id/modify")
    public String modifyReview(){
        log.info("���� modify.........................................");
        return "redirect:/movies/movie-id/reviews";
    }

    // ������ �ϰ� ���� ��������
    @DeleteMapping("/tips/remove")
    public String deleteReview(){
        log.info("���� delete........................................");
        return "redirect:/movies/movie-id/reviews";
    }

    // �������� �ϰ� ���� ��������
    @PostMapping("/review-id/post")
    public String postReview(){
        log.info("���� post.........................................");
        return "redirect:/movies/movie-id/reviews";
    }

}
