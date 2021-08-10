package com.sh.restaurant.domain;

import java.util.List;

public interface RestaurantRepository {

    List<RestaurantDto> findAll();

    RestaurantDto findById(Long id);
}
