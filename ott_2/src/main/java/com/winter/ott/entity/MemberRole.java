package com.winter.ott.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "member_roles")
@ToString
public class MemberRole {
    public static final String USER = "USER";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String roleName;

    public MemberRole() {
    }

    public MemberRole(String roleName) {
        this.roleName = roleName;
    }
}