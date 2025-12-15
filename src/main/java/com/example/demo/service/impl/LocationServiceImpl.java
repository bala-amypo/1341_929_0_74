package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.LocationService;
@Service
public class LocationServiceImpl implements LocationService{
   
    @Autowired LocationRepository location;


 public Location createLocation(Location location){
    if(location)
    return location.save(location);
    

 }
 public List<Location> getAllLocations(){

 }



}
