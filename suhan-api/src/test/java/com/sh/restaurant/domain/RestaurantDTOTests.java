package com.sh.restaurant.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RestaurantDTOTests {


    @Test
    public void creation() {
        RestaurantDTO restaurantDTO = new RestaurantDTO(1004L,"KIM SUHAN", "");
        assertThat(restaurantDTO.getName(), is("KIM SUHAN"));
    }

    @Test
    public void information() {
        RestaurantDTO restaurantDTO = new RestaurantDTO(1004L,"Misoya", "Osaka");
        assertThat(restaurantDTO.getAddress(), is("Osaka"));
    }
}