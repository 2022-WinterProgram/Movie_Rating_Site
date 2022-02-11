package com.winter.ott.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/login")
@Log4j2
@RequiredArgsConstructor
public class LoginController {


    @GetMapping("/")
    public void login() {
        log.info("login get...");
    }

    @PostMapping("/")
    public String loginPost() {
        return "redirect:/diflixpedia";
    }
}
