package com.sh.restaurant.interfaces;

import com.sh.restaurant.domain.RestaurantDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {


    @GetMapping("/restaurant")
    public List<RestaurantDTO> list() {

        List<RestaurantDTO> restaurantDTOList = new ArrayList<>();
        restaurantDTOList.add(new RestaurantDTO(1004L, "Misoya", "Tokyo"));
        return restaurantDTOList;
    }

    @GetMapping("/restaurant/{id}")
    public RestaurantDTO detail(@PathVariable("id") Long id) {

        List<RestaurantDTO> restaurantDTOList = new ArrayList<>();

        restaurantDTOList.add(new RestaurantDTO(1L, "yonan", "Daejeon"));
        restaurantDTOList.add(new RestaurantDTO(2L, "misoya", "Tokyo"));
        restaurantDTOList.add(new RestaurantDTO(3L, "fujiyama", "shizuoka"));

        RestaurantDTO result = restaurantDTOList
                .stream()
                .filter(r -> r.getId()
                        .equals(id))
                        .findFirst()
                        .get();

        return result;
    }
}
