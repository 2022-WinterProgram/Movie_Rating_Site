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
    // ��ȭ �⺻ ���� ��ȯ
    @GetMapping("/")
    public String index() {return "/movies/{movie-id}";}

    // ��ȭ �� ����
    @GetMapping("/details")
    public void details(){log.info("details get...");}

    /// ���ϱ� ��������
    // ����Ʈ ��� ����
    @GetMapping("/reviews/{review-id}/post")
    public void review(){log.info("review post.........................................");}

    // �������� �ϰ� ���� ��������
    @PostMapping("/reviews/{review-id}/post")
    public String postReview(){
        log.info("review post.........................................");
        return "redirect:/movies/{movie-id}/reviews";
    }


    /// �� ������ ��������
    // ���â ����
    @GetMapping("/tips")
    public void Tip(){ log.info("�� post");
    }
    //�� �ۼ�
    @PostMapping("/tips")
    public String postTip(){

        log.info("�� post");
        //
        // �ڵ��ۼ�
        //
        String text="";
        return "/movies/{movie-id}";
    }

/* �� �����ϱ�

    @PutMapping("/tips/modify")
    public String modifyTip(){

        log.info("�� modify");
        //
        // �ڵ��ۼ�
        //
        String text="";
        return text;

    }

*/



}
