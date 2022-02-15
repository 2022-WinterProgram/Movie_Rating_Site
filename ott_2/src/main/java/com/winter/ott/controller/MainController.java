package com.winter.ott.controller;


import com.winter.ott.dto.MainDto;
import com.winter.ott.dto.SearchMovieResponseDto;
import com.winter.ott.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/diflixpedia")
@Log4j2
@RequiredArgsConstructor

public class MainController {

    public final MainService mainService;

    @GetMapping("")
    public String index() {
        return "redirect:/diflixpedia/main";
    }

    @GetMapping("/main")
    public List<MainDto> main(){
        log.info("main...........");
        List<MainDto> movieList_actor = mainService.showListByActor("Chris Evans");
        return movieList_actor;
    }

}
//    @GetMapping("/join")
//    public void join(){
//        log.info("join...........");
//    }
//
//    @GetMapping("/login")
//    public void login(){
//        log.info("login...........");
//    }
//
//    @GetMapping("/users")
//    public void user(){
//        log.info("users...........");
//    }
//
//    @GetMapping("/movies")
//    public String movies(RedirectAttributes redirectAttributes){
//        log.info("movies...........");
//
//        return "redirect:/diflixpedia/movies/movie-id";
//    }
//
//    @PostMapping("/search")
//    public String search(RedirectAttributes redirectAttributes){
//        log.info("search...........");
//
//        return "redirect:/diflixpedia/search";
//    }

