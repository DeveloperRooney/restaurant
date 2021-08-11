package com.sh.restaurant.application;


import com.sh.restaurant.domain.MenuItemDto;
import com.sh.restaurant.domain.MenuItemRepository;
import com.sh.restaurant.domain.RestaurantDto;
import com.sh.restaurant.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 레스토랑 정보를 종합적으로 가져오기 위한 어플리케이션 레이어
@Service
public class RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    MenuItemRepository menuItemRepository;

    public RestaurantService(RestaurantRepository restaurantRepository, MenuItemRepository menuItemRepository) {
        this.restaurantRepository = restaurantRepository;
        this.menuItemRepository = menuItemRepository;
    }

    public List<RestaurantDto> getRestaurants() {
        List<RestaurantDto> restaurants = restaurantRepository.findAll();

        return restaurants;
    }


    public RestaurantDto getRestaurant(Long id) {
        RestaurantDto restaurant = restaurantRepository.findById(id);

        List<MenuItemDto> menuItems = menuItemRepository.findAllByRestaurantId(id);
        restaurant.setMenuItem(menuItems);

        return restaurant;
    }

    public RestaurantDto addRestaurant(RestaurantDto restaurant) {

        return restaurantRepository.save(restaurant);
    }
}
