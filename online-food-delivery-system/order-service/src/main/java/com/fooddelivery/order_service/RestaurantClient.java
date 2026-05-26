package com.fooddelivery.order_service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestaurantClient {

    public String checkRestaurantService() {

        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.getForObject(
                "http://localhost:8081/restaurant",
                String.class
        );

        return response;
    }
}