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
    @Column()
    private String memberReview;

    @Column()
    private String movieName;

    @Column()
    private int memberRate;

    @ManyToOne()
    @JoinColumn(name="MEMBER_ID")
    private Member member;

    public Review(String memberReview, String movieName, int memberRate) {
        this.memberReview = memberReview;
        this.movieName = movieName;
        this.memberRate = memberRate;
    }
}
