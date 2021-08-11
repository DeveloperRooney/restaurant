package com.sh.restaurant.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<RestaurantDto, Long> {

    List<RestaurantDto> findAll();

    Optional<RestaurantDto> findById(Long id);

    RestaurantDto save(RestaurantDto restaurant);
}
