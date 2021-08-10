package com.sh.restaurant.application;

import com.sh.restaurant.domain.RestaurantDto;
import com.sh.restaurant.domain.RestaurantRepository;
import com.sh.restaurant.domain.RestaurantRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

class RestaurantServiceTests {

    private RestaurantService restaurantService;

    @BeforeEach
    public void serUp() {
        RestaurantRepositoryImpl restaurantRepository = new RestaurantRepositoryImpl();

        restaurantService = new RestaurantService(restaurantRepository);
    }

    @Test
    public void getRestaurant() {
        RestaurantDto restaurant = restaurantService.getRestaurant(1L);
        assertThat(restaurant.getId(), is(1L));
    }
}