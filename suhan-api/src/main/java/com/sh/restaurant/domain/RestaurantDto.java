package com.sh.restaurant.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RestaurantDto {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    @Transient
    private List<MenuItemDto> menuItems = new ArrayList<>();

    public RestaurantDto() {

    }

    public RestaurantDto(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public RestaurantDto(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public String getAddress() {

        return address;
    }

    public List<MenuItemDto> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItemDto menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItem(List<MenuItemDto> menuItems) {

        for(MenuItemDto menu : menuItems) {
            addMenuItem(menu);
        }

    }
}
