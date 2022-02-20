package com.winter.ott.dto;


import com.winter.ott.entity.Member;
import com.winter.ott.entity.Review;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SearchReviewResponseDto {
    private String memberreview;
    private String moviename;
    private String memberrate;
    private String username;

    public SearchReviewResponseDto(Review review) {
        this.moviename = review.getMovieName();
        this.memberreview = review.getMemberReview();
        this.memberrate = review.getMemberRate();
        this.username = review.getUsername();

    }
}
