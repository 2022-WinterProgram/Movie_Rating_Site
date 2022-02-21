package com.winter.ott.controller;

import com.winter.ott.entity.Member;
import com.winter.ott.entity.MemberRole;
import com.winter.ott.repository.MemberRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.annotation.Resource;
import java.util.Arrays;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Resource(name = "memberRepository")
    private MemberRepository memberRepository;

    @PostMapping("")
    public RedirectView create(Member member) {
        MemberRole role = new MemberRole();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        member.setPassword(passwordEncoder.encode(member.getPassword()));
        role.setRoleName("USER");
        member.setRoles(Arrays.asList(role));
        memberRepository.save(member);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:3000");
        return redirectView;
    }
}