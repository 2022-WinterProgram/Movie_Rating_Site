package com.winter.ott.entity;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@Table(name = "review")
public class Review {

    @Id
    @Column(name = "user_review", length = 1000)
    private String memberReview;

    @Column(name = "m_name")
    private String movieName;

    @Column(name="user_rate")
    private String memberRate;

    @ManyToOne()
    @JoinColumn(name="MEMBER_ID")
    private Member member;

    @Column(name = "user_id")
    private String username;

    public Review(String memberReview, String movieName, String memberRate) {
        this.memberReview = memberReview;
        this.movieName = movieName;
        this.memberRate = memberRate;
    }


    public Review(String memberReview, String movieName, String memberRate, String username) {
        this.memberReview = memberReview;
        this.movieName = movieName;
        this.memberRate = memberRate;
        this.username = username;
    }
}
