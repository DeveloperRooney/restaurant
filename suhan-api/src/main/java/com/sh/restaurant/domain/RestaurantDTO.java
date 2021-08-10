package com.sh.restaurant.domain;

public class RestaurantDTO {

    private final String name;
    private final String address;

    public RestaurantDTO(String name, String address) {
        this.name = name;

        this.address = address;
    }

    public String getName() {

        return name;
    }

    public String getInformation() {

        return name + " in " + address;
    }
}
