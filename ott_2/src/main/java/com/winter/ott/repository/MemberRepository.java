package com.winter.ott.repository;

import com.winter.ott.entity.Actor;
import com.winter.ott.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, String> {

    Member findByEmail(String username);
}
