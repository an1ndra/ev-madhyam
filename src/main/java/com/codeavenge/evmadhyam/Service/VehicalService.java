package com.codeavenge.evmadhyam.Service;

import com.codeavenge.evmadhyam.Model.Vehical;

import java.util.List;

public interface VehicalService {
    List<Vehical> getVehical();

    Vehical saveVehical(Vehical vehical);
}
