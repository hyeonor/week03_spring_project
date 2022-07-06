package com.sparta.week03_spring_project.domain;

import lombok.Getter;

@Getter
public class MemoRequestDto {
    private String title;
    private String username;
    private String password;
    private String contents;
}
