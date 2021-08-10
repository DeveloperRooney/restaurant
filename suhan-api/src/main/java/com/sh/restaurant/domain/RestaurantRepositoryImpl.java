package com.sh.restaurant.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    private List<RestaurantDTO> restaurantList = new ArrayList<>();

    public RestaurantRepositoryImpl() {
        restaurantList.add(new RestaurantDTO(1L, "yonan", "Daejeon"));
        restaurantList.add(new RestaurantDTO(2L, "misoya", "Tokyo"));
        restaurantList.add(new RestaurantDTO(3L, "fujiyama", "shizuoka"));
    }

    @Override
    public List<RestaurantDTO> findAll() {
        return restaurantList;
    }

    @Override
    public RestaurantDTO findById(Long id) {

        return restaurantList.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
