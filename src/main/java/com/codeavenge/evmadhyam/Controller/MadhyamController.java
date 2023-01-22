package com.codeavenge.evmadhyam.Controller;

import com.codeavenge.evmadhyam.Model.Location;
import com.codeavenge.evmadhyam.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MadhyamController {
    @GetMapping("/vehical")
    public String getCars() {
        return "Cars";
    }

    private LocationService locationService;

    @Autowired
    public void setLocationService(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/location")
    public List<Location> getLocation() {
        return locationService.getLocation();
    }

}
