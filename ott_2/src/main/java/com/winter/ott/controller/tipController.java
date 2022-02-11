package com.winter.ott.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies/movie-id/")        //���⸦ tips���� ���ѰŴ� tip���� �������� ���ξ��
@Log4j2

public class tipController {

    @PostMapping("/tips")
    public String postTip(){

        log.info("�� post");
        //
        // �ڵ��ۼ�
        //
        String text="";
        return text;

    }

    @PutMapping("/tips/modify")
    public String modifyTip(){

        log.info("�� modify");
        //
        // �ڵ��ۼ�
        //
        String text="";
        return text;

    }

//    @DeleteMapping("/tips/remove")
//    public
}
