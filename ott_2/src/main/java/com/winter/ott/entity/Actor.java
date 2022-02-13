package com.winter.ott.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "actor")

public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_code", unique = true, nullable = false)
    private String a_code;

    @Column(length = 45, nullable = false)
    private String a_name;



    @Builder
    public Actor(String name){
        this.a_name = name;
    }

}
