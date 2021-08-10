package com.sh.restaurant.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RestaurantDtoTests {


    @Test
    public void creation() {
        RestaurantDto restaurantDTO = new RestaurantDto(1004L,"KIM SUHAN", "");
        assertThat(restaurantDTO.getName(), is("KIM SUHAN"));
    }

    @Test
    public void information() {
        RestaurantDto restaurantDTO = new RestaurantDto(1004L,"Misoya", "Osaka");
        assertThat(restaurantDTO.getAddress(), is("Osaka"));
    }
}