package com.sh.restaurant.domain;

public class MenuItemDto {

    private final String name;

    public MenuItemDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
