package com.winter.ott.controller;


import com.winter.ott.dto.SearchPickResponseDto;
import com.winter.ott.service.MovieDetailService;
import com.winter.ott.service.MyPagePickService;
import com.winter.ott.service.SearchMovieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;





@RestController
@RequestMapping("/mypage")
@Log4j2
@RequiredArgsConstructor
public class MyPageController {

    private final MyPagePickService PickService;
    private final SearchMovieService movieSearchService;
    private final MovieDetailService movieDetailService;


    @GetMapping("/pick")
    public List<SearchPickResponseDto> pickInfo() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails userDetails = (UserDetails)principal;
        String username = ((UserDetails) principal).getUsername();
        List<SearchPickResponseDto> moviePickList = PickService.searchPick(username);

        log.info("found lists are these : " + moviePickList);

        System.out.println(username);
        return moviePickList;
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


