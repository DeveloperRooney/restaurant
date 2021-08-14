package com.sh.restaurant.domain;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class MenuItemDto {

    @Id
    @GeneratedValue
    private Long id;

    private Long restaurantId;

    private String name;

    public MenuItemDto(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
