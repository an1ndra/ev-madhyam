package com.codeavenge.evmadhyam.Service;

import com.codeavenge.evmadhyam.Model.Location;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocationService {
    List<Location> getLocation();
}
