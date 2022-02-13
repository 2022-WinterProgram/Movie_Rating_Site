package com.winter.ott.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies/movie-id")
@Log4j2
public class detailCotroller {
    @GetMapping("/")
    public String index() {
        return "/movies/movie-id";
    }

    @GetMapping("/details")
    public void details(){
        log.info("상세정보 get...");
    }


}
