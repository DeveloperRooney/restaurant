package com.sh.restaurant.application;

import com.sh.restaurant.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.BDDMockito.given;


class RestaurantServiceTests {

    private RestaurantService restaurantService;

    @Mock
    private RestaurantRepository restaurantRepository;

    @Mock
    private MenuItemRepository menuItemRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        mockRestaurantRepository();
        mockMenuItemRepository();

        restaurantService = new RestaurantService(
                restaurantRepository, menuItemRepository);
    }

    private void mockRestaurantRepository() {
        List<RestaurantDto> restaurants = new ArrayList<>();
        RestaurantDto restaurant = new RestaurantDto(1L, "yonan", "Daejeon");
        restaurants.add(restaurant);
        given(restaurantRepository.findAll()).willReturn(restaurants);

        given(restaurantRepository.findById(1L)).willReturn(restaurant);
    }

    private void mockMenuItemRepository() {

        List<MenuItemDto> menuItems = new ArrayList<>();
        menuItems.add(new MenuItemDto("kimchi"));
        given(menuItemRepository.findAllByRestaurantId(1L)).willReturn(menuItems);
    }

    @Test
    public void getRestaurant() {
        RestaurantDto restaurant = restaurantService.getRestaurant(1L);
        assertThat(restaurant.getId(), is(1L));


        MenuItemDto menuItem = restaurant.getMenuItems().get(0);
        assertThat(menuItem.getName(), is("kimchi"));
    }
}