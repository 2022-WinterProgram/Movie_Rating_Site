package com.winter.ott;

import com.winter.ott.entity.Member;
import com.winter.ott.entity.MemberRole;
import com.winter.ott.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void insertTest() {
        for(int i=0; i<100; i++) {
            Member member = new Member();
            member.setUid("user" + i);
            member.setUpw("pw" + i);
            member.setUemail("cbnuwinterproject" + i + "@chungbuk.ac.kr");
            MemberRole role = new MemberRole();
            if(i <= 80) {
                role.setRoleName("BASIC");
            }else if(i <= 90) {
                role.setRoleName("MANAGER");
            }else {
                role.setRoleName("ADMIN");
            }
            member.setRoles(Arrays.asList(role));
            memberRepository.save(member);
        }
    }

    @Test
    public void testMember() {
        Optional<Member> result = memberRepository.findById(85L);
     //   result.ifPresent(member ->log.info("member " + member));
    }
}