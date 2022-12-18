package com.wonsang.boardstudy.data.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Post {
    @Id
    private Long id;

    private String postTitle;

    private String postContents;

    @ManyToOne
    private Board writtendBoard;

    @OneToOne
    private Member writtenMember;

    @CreatedDate
    private LocalDate createdDate;

    @LastModifiedDate
    private LocalDate lastModifiedDate;

    private Boolean isDeleted;
}
