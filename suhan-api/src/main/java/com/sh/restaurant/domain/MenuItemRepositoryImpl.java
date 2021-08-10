package com.sh.restaurant.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MenuItemRepositoryImpl implements MenuItemRepository{

    private List<MenuItemDto> menuItems = new ArrayList<>();

    public MenuItemRepositoryImpl() {
        menuItems.add(new MenuItemDto("kimchi"));
    }

    @Override
    public List<MenuItemDto> findAllByRestaurantId(Long restaurantId) {
        return menuItems;
    }
}
