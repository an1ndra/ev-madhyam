package com.codeavenge.evmadhyam.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "location")
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "address")
    private String address;


    @Column(name = "city")
    private String city;

    @Column(name = "availability")
    private boolean availability;

    @Column(name = "isvalidbygov")
    private boolean isValidByGov;


    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "name")
    private String name;

    @Column(name = "zipcode")
    private long zipcode;

    @Column(name = "pricing")
    private String price;

    @Column(name = "state")
    private String state;
}
