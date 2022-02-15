package com.winter.ott.service;

import com.winter.ott.entity.Member;
import com.winter.ott.entity.SecurityMember;
import com.winter.ott.repository.MemberRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Optional;

import javax.annotation.Resource;

@Service("securityMemberService")
public class SecurityMemberService implements UserDetailsService {

    @Resource(name="memberRepository")
    private MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepository.findByEmail(username);
                //.orElseThrow(() -> new UsernameNotFoundException("Wrong account info."));
        return new SecurityMember(member);
    }
}