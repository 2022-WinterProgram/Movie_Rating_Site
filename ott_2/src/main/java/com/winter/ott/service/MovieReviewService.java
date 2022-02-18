package com.winter.ott.service;


import com.winter.ott.dto.MovieReviewDto;
import com.winter.ott.dto.TipDto;
import com.winter.ott.entity.Review;
import com.winter.ott.entity.Tip;
import com.winter.ott.repository.ReviewRepository;
import com.winter.ott.repository.TipRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class MovieReviewService {

    private final ReviewRepository reviewRepository;
    public List<MovieReviewDto> showReview(String movieName) {

        List<Review> reviews = reviewRepository.findReviewByMovieName(movieName);
        List<MovieReviewDto> resultList = new ArrayList<>();

        for (Review r : reviews) {
            Review review = new Review(r.getMemberReview(),r.getMovieName(),r.getMemberRate());
            resultList.add(new MovieReviewDto(review));
        }
        return resultList;
    }

}
