package com.fooddelivery.order_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final RestaurantClient restaurantClient;

    public OrderController(RestaurantClient restaurantClient) {
        this.restaurantClient = restaurantClient;
    }

    @GetMapping("/order")
    public String getOrder() {

        String restaurantResponse =
                restaurantClient.checkRestaurantService();

        return "Order created successfully! -> "
                + restaurantResponse;
    }
    @GetMapping("/order/status")
    public String status() {
        return "Order Service is running inside Docker!";
    }
}
