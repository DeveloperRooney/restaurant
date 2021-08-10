package com.sh.restaurant.interfaces;

import com.sh.restaurant.domain.RestaurantDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {


    @GetMapping("/restaurant")
    public List<RestaurantDTO> list() {

        List<RestaurantDTO> restaurantDTOList = new ArrayList<>();
        restaurantDTOList.add(new RestaurantDTO("Misoya", "Tokyo"));
        return restaurantDTOList;
    }
}
