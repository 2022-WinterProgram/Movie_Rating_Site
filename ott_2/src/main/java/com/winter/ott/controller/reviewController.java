package com.winter.ott.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies/{movie-id}/reviews")
@Log4j2
@RequiredArgsConstructor
public class reviewController {




    //��ȭ ���� ���
    @GetMapping("/")
    public String index() {
        return "/movies/{movie-id}/reviews";
    }
/*

    /// ��ȭ ���� ��Ͽ��� �� ���並 Ŭ��������
    // ����Ʈ ��� ����
    @GetMapping("/{review-id}/post")
    public void post(){log.info("review post.........................................");}

    // �������� �ϰ� ���� ��������
    @PostMapping("/{review-id}/post")
    public String postReview(){
        log.info("review post.........................................");
        return "redirect:/movies/{movie-id}/reviews";
    }
*/

/*
���� ��� ����

    // ������ �ϰ� ������������
    @PatchMapping("/{review-id}/modify")
    public String modifyReview(){
        log.info("review modify.........................................");
        return "redirect:/movies/{movie-id}/reviews";
    }
*/

    // ������ �ϰ� ���� ��������
    @DeleteMapping("/remove")
    public String deleteReview(){
        log.info("review delete........................................");
        return "redirect:/movies/{movie-id}/reviews";
    }



}
