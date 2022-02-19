package com.winter.ott.repository;

import com.winter.ott.entity.Member;
import com.winter.ott.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, String> {

    List<Review> findReviewByMovieName(String movieName);
    List<Review> findReviewByUsername(String Username);
    List<Review> findReviewByMember(Member member);
}
