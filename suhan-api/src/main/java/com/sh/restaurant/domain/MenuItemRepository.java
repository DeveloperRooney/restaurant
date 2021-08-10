package com.sh.restaurant.domain;

import java.util.List;

public interface MenuItemRepository {

    List<MenuItemDto> findAllByRestaurantId(Long restaurantId);
}
