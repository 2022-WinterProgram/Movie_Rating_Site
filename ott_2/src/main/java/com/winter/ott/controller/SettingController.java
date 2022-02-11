package com.winter.ott.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/setting")
@Log4j2
@RequiredArgsConstructor
public class SettingController {
    @GetMapping("/{user-id}")
    public void userInfo() {
        log.info("setting get...");
    }

}