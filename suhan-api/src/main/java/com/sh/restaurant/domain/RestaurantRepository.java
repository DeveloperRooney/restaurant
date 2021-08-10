package com.sh.restaurant.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    public List<RestaurantDTO> findAll() {
        List<RestaurantDTO> restaurantList = new ArrayList<>();

        restaurantList.add(new RestaurantDTO(1L, "yonan", "Daejeon"));
        restaurantList.add(new RestaurantDTO(2L, "misoya", "Tokyo"));
        restaurantList.add(new RestaurantDTO(3L, "fujiyama", "shizuoka"));

        return restaurantList;
    }
}
