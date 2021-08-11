package com.sh.restaurant.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuItemRepository extends CrudRepository<MenuItemDto, Long> {

    List<MenuItemDto> findAllByRestaurantId(Long restaurantId);
}
