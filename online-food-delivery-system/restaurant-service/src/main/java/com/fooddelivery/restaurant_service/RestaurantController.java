package com.fooddelivery.restaurant_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @GetMapping("/restaurant")
    public String getRestaurant() {
        return "Restaurant Service is Running!";
    }
}