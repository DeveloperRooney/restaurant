package com.sh.restaurant.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    private List<RestaurantDto> restaurantList = new ArrayList<>();

    public RestaurantRepositoryImpl() {
        restaurantList.add(new RestaurantDto(1L, "yonan", "Daejeon"));
        restaurantList.add(new RestaurantDto(2L, "misoya", "Tokyo"));
        restaurantList.add(new RestaurantDto(3L, "fujiyama", "shizuoka"));
    }

    @Override
    public List<RestaurantDto> findAll() {
        return restaurantList;
    }

    @Override
    public RestaurantDto findById(Long id) {

        return restaurantList.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
