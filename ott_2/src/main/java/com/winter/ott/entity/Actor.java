package com.winter.ott.entity;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "actor")

public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_code", unique = true, nullable = false)
    private String code;

    @Column(name = "a_name", length = 45, nullable = false)
    private String name;

    @OneToMany(mappedBy = "actor", cascade = CascadeType.MERGE)
    private List<Movie> movie = new ArrayList<>();

    //빌더
    @Builder
    public Actor(String name){
        this.name = name;
    }

}
