package com.sh.restaurant.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    private List<RestaurantDTO> restaurantList = new ArrayList<>();

    public RestaurantRepository() {
        restaurantList.add(new RestaurantDTO(1L, "yonan", "Daejeon"));
        restaurantList.add(new RestaurantDTO(2L, "misoya", "Tokyo"));
        restaurantList.add(new RestaurantDTO(3L, "fujiyama", "shizuoka"));
    }

    public List<RestaurantDTO> findAll() {
        return restaurantList;
    }

    public RestaurantDTO findById(Long id) {

        return restaurantList.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
