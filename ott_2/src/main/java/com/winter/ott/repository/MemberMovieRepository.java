package com.winter.ott.repository;

import com.winter.ott.entity.Movie;
import com.winter.ott.entity.PickMemberMovie;
import com.winter.ott.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberMovieRepository extends JpaRepository<PickMemberMovie, String> {

    List<PickMemberMovie> findPickMemberMovieByUsername(String Username);

    List<PickMemberMovie> findAllByUsername(String Username);

}
