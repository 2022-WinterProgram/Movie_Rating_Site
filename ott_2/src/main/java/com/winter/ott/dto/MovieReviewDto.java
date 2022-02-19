package com.winter.ott.dto;

import com.winter.ott.entity.Member;
import com.winter.ott.entity.Review;
import lombok.Data;


@Data
public class MovieReviewDto {

    private String member_review;
    private String m_name;
    private String member_rate;
    private Member member;

    public MovieReviewDto(Review review) {
        this.member_review = review.getMemberReview();
        this.m_name = review.getMovieName();
        this.member_rate = review.getMemberRate();
        this.member = review.getMember();
    }
}
