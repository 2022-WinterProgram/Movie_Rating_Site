package com.winter.ott.controller;


import com.winter.ott.dto.MainDto;
import com.winter.ott.dto.SearchMovieResponseDto;
import com.winter.ott.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/login")
@Log4j2
@RequiredArgsConstructor
public class LoginController {

    @GetMapping("")
    public String login() {
        return "login";
    }


    @GetMapping("/success")
    @ResponseBody
    public String loginSuccess()
    {


        String resultmsg = "<script>alert('Login Successful. Welcome!');location.href='http://localhost:3000'</script>";
        return resultmsg;
    }

    @GetMapping("/fail")
    @ResponseBody
    public String loginFail()
    {
        String resultmsg = "<script>alert('Logout / Wrong ID or password. Login again!');location.href='http://localhost:3000'</script>";
                return resultmsg;
    }
}


