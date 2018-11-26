package com.start.springOne.dto;

public class PersonDto {
    private int id;
    private String name;

    public PersonDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
