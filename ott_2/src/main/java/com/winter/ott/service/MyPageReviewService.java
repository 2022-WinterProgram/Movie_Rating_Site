package com.winter.ott.service;


import com.winter.ott.dto.SearchPickResponseDto;
import com.winter.ott.dto.SearchReviewResponseDto;
import com.winter.ott.entity.Member;
import com.winter.ott.entity.PickMemberMovie;
import com.winter.ott.entity.Review;
import com.winter.ott.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Service
@Log4j2
public class MyPageReviewService {

    private final ReviewRepository reviewRepository;


    public List<SearchReviewResponseDto> searchReview(String username) {
        List<Review> movieByUsername = reviewRepository.findReviewByUsername(username);

        List<SearchReviewResponseDto> resultList = new ArrayList<>();

        for (Review r : movieByUsername) {
            Review review = new Review( r.getMemberReview(),r.getMovieName(),r.getMemberRate(), r.getUsername());
            resultList.add(new SearchReviewResponseDto(review));
        }

        return resultList;
    }

}
