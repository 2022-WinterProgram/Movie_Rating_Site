package com.winter.ott.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Entity
@EqualsAndHashCode(of = "uid")
@ToString
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private long id;

    @Size(min = 3, max = 20)
    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    @JsonIgnore
    private String password;

    @Email // check (hibernation <-> java)
    @Size(min = 6, max = 50)
    @Column(unique = true, nullable = false, length = 50)
    private String email;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="member")
    private List<MemberRole> roles = new ArrayList<>();




    @OneToMany(mappedBy = "member")
    private List<Review> reviewList = new ArrayList<>();



}