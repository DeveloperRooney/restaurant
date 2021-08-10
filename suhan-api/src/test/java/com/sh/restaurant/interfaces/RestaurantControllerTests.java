package com.sh.restaurant.interfaces;

import com.sh.restaurant.domain.RestaurantRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(RestaurantController.class)
class RestaurantControllerTests {

    @Autowired
    private MockMvc mvc;

    @SpyBean
    private RestaurantRepository repository;

    @Test
    public void list() throws Exception {

        mvc.perform(get("/restaurant"))
            .andExpect(status().isOk())
            .andExpect(content().string(
                containsString("\"id\":1")
            ))
            .andExpect(content().string(
                    containsString("\"name\":\"yonan\"")
            ));
    }

    @Test
    public void detail() throws Exception {
        mvc.perform(get("/restaurant/1"))
            .andExpect(status().isOk())
            .andExpect(content().string(
                    containsString("\"id\":1")
            ))
            .andExpect(content().string(
                    containsString("\"name\":\"yonan\"")
            ));

        mvc.perform(get("/restaurant/2"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("\"id\":2")
                ))
                .andExpect(content().string(
                        containsString("\"name\":\"misoya\"")
                ));
    }

}