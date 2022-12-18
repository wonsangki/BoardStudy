package com.wonsang.boardstudy.data.entity;

import com.wonsang.boardstudy.enums.Grade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
    @Id
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;

    private String userName;

    private String phoneNumber;

    private Boolean isDeleted;

    private Boolean isActivated;

    private Grade memberGrade;



}
