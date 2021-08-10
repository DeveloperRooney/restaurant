package com.sh.restaurant.domain;

import java.util.List;

public interface RestaurantRepository {

    List<RestaurantDTO> findAll();

    RestaurantDTO findById(Long id);
}
