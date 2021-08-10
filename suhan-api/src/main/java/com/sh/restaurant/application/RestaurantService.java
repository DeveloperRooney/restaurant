package com.sh.restaurant.application;


import com.sh.restaurant.domain.RestaurantDto;
import com.sh.restaurant.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 레스토랑 정보를 종합적으로 가져오기 위한 어플리케이션 레이어
@Service
public class RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }


    public RestaurantDto getRestaurant(Long id) {

        RestaurantDto restaurant = restaurantRepository.findById(id);

        return restaurant;
    }
}
