package com.wonsang.boardstudy.data.entity;

import com.wonsang.boardstudy.enums.Grade;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Board {
    @Id
    private Long id;

    private String boardName;

    private Grade viewableGrade;

    private Boolean isDeleted;

    @CreatedDate
    private LocalDate createdDate;

    @LastModifiedDate
    private LocalDate lastModifiedDate;
}
