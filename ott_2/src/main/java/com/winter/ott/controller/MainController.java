package com.winter.ott.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/diflixpedia")
@Log4j2
@RequiredArgsConstructor

public class MainController {
    @GetMapping("/")
    public String index() {
        return "redirect:/diflixpedia/main";
    }

    @GetMapping("/main")
    public String main(){
        log.info("main...........");
        return "index";
    }

    @GetMapping("/join")
    public void join(){
        log.info("join...........");
    }

    @GetMapping("/login")
    public void login(){
        log.info("login...........");
    }

    @GetMapping("/users")
    public void user(){
        log.info("users...........");
    }

    @GetMapping("/movies")
    public String movies(RedirectAttributes redirectAttributes){
        log.info("movies...........");

        return "redirect:/diflixpedia/movies";
    }

    @PostMapping("/search")
    public String search(RedirectAttributes redirectAttributes){
        log.info("search...........");

        return "redirect:/diflixpedia/search";
    }
}
