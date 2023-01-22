package com.codeavenge.evmadhyam.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Vehical {
    private Long id;
    private String company;
    private String model;
    private String battery;
    private Long range;
    private Long price;
    private Long launchDate;
    private Long warranty;
    private String origin;
}
