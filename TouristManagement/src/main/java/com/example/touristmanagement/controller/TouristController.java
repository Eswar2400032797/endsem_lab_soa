
package com.example.touristmanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.touristmanagement.entity.Tourist;
import com.example.touristmanagement.service.TouristService;

@RestController
@RequestMapping("/api")
public class TouristController {

    @Autowired
    private TouristService service;

    @PostMapping("/tourists")
    public String createTourist(
            @RequestBody Tourist t,
            @RequestHeader(value = "Token", required = false)
            String token) {

        return service.createTourist(t, token);
    }
}
