package com.codeavenge.evmadhyam.Service;

import com.codeavenge.evmadhyam.Model.Location;
import com.codeavenge.evmadhyam.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImp implements LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public void setLocationRepository(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> getLocation() {
        return locationRepository.findAll();
    }
}
