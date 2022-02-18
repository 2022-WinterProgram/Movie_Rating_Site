package com.winter.ott.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@Table(name = "tip")
public class Tip {

    @Id
    @Column()
    private String memberTip;

    @Column()
    private String movieName;

    @ManyToOne()
    @JoinColumn(name="MEMBER_ID")
    private Member member;


    public Tip(String memberTip, String movieName) {
            this.memberTip = memberTip;
            this.movieName = movieName;
        }


}
