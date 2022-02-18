package com.winter.ott.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

    @Getter
    @Setter
    @Entity
    @NoArgsConstructor
    @Table(name = "pick")
    public class PickMemberMovie {



        @Column(name = "user_id")
        private String username;

        @Id
        @Column(name = "m_name")
        private String title;


        public PickMemberMovie(String username, String title) {
            this.username = username;
            this.title = title;
        }


    }
