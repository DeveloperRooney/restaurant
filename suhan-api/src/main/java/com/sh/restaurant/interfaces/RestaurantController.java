package com.sh.restaurant.interfaces;

import com.sh.restaurant.application.RestaurantService;
import com.sh.restaurant.domain.MenuItemDto;
import com.sh.restaurant.domain.MenuItemRepository;
import com.sh.restaurant.domain.RestaurantDto;
import com.sh.restaurant.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;


    @GetMapping("/restaurant")
    public List<RestaurantDto> list() {

        List<RestaurantDto> restaurants = restaurantService.getRestaurants();

        return restaurants;
    }

    @GetMapping("/restaurant/{id}")
    public RestaurantDto detail(@PathVariable("id") Long id) {

        RestaurantDto restaurant = restaurantService.getRestaurant(id);

        return restaurant;
    }

    @PostMapping("/restaurant")
    public ResponseEntity<?> create(@RequestBody RestaurantDto resource)
            throws URISyntaxException {

        String name = resource.getName();
        String address = resource.getAddress();

        RestaurantDto restaurant = new RestaurantDto(name, address);
        restaurantService.addRestaurant(restaurant);

        URI location = new URI("/restaurant/" + restaurant.getId());

        return ResponseEntity.created(location).body("{}");
    }

}
