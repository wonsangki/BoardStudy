package com.wonsang.boardstudy.enums;

public enum Grade {

    OWNER("OWNER", 0), MANAGER("MANAGER", 3), USER("USER", 9), BANNED_USER("BANNED_USER",999);

    private String name;
    private int level;

    Grade(String name, int level){
        this.name = name;
        this.level = level;
    }
}
