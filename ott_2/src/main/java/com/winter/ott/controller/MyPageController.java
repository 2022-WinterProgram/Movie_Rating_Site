package com.winter.ott.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/users")
@Log4j2
@RequiredArgsConstructor
public class MyPageController {

//    private final MyPageService service;

    @GetMapping("/register")
    public void register() {
        log.info("register get...");
    }

    @PostMapping("/register")
    public String registerPost() {
        return "redirect:/diflixpedia";
    }

    @GetMapping("/{user-id}")
    public void userInfo() {
        log.info("user_info get...");
    }

    @PutMapping("/{user-id}/modify")
    public String modifyUserInfo() {
        return "redirect:/users/setting/{user-id}";
    }

    @DeleteMapping("/{user-id}/remove")
    public String removeUserInfo() {
        return "redirect:/diflixpedia";
    }

}


