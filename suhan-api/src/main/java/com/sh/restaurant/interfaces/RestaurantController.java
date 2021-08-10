package com.sh.restaurant.interfaces;

import com.sh.restaurant.domain.MenuItemDto;
import com.sh.restaurant.domain.MenuItemRepository;
import com.sh.restaurant.domain.RestaurantDto;
import com.sh.restaurant.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private MenuItemRepository menuItemRepository;

    @GetMapping("/restaurant")
    public List<RestaurantDto> list() {
//        List<RestaurantDTO> restaurantDTOList = new ArrayList<>();
//        restaurantDTOList.add(new RestaurantDTO(1004L, "Misoya", "Tokyo"));

        List<RestaurantDto> restaurantList = restaurantRepository.findAll();

        return restaurantList;
    }

    @GetMapping("/restaurant/{id}")
    public RestaurantDto detail(@PathVariable("id") Long id) {

//        RestaurantDto restaurantDto = restaurantService.getRestaurantById(id);

//        List<RestaurantDTO> restaurantDTOList = repository.findAll();
//
//        RestaurantDTO result = restaurantDTOList
//                .stream()
//                .filter(r -> r.getId()
//                        .equals(id))
//                        .findFirst()
//                        .orElse(null);

        RestaurantDto restaurant = restaurantRepository.findById(id);
        List<MenuItemDto> menuItems = menuItemRepository.findAllByRestaurantId(id);
        restaurant.setMenuItem(menuItems);

        return restaurant;
    }
}
