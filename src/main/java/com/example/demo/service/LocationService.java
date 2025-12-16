package com.example.demo.service;

import org.springframework.stereotype.Service;



import java.util.List;

import com.example.demo.entity.Location;

public interface LocationService {
        
    Location createLocation(Location location);
    List<Location> getAllLocations();
}
