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
    @Column(length = 1000)
    private String memberReview;

    @Column()
    private String movieName;

    @Column()
    private String memberRate;

    @ManyToOne()
    @JoinColumn(name="MEMBER_ID")
    private Member member;

    public Review(String memberReview, String movieName, String memberRate) {
        this.memberReview = memberReview;
        this.movieName = movieName;
        this.memberRate = memberRate;
    }
}
