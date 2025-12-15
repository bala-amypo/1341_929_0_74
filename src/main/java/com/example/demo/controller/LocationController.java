package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
    @PostMapping("/locations")

    public Location addLocation(@RequestBody Location loc){
        return 
    }
    
}
