package com.winter.ott.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies/movie-id/")        //여기를 tips으로 안한거는 tip보는 페이지가 따로없어서
@Log4j2

public class tipController {

    @PostMapping("/tips")
    public String postTip(){

        log.info("팁 post");
        //
        // 코드작성
        //
        String text="";
        return text;

    }

    @PutMapping("/tips/modify")
    public String modifyTip(){

        log.info("팁 modify");
        //
        // 코드작성
        //
        String text="";
        return text;

    }

//    @DeleteMapping("/tips/remove")
//    public
}
