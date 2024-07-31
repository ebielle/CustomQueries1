package com.example.custom_queries1.controllers;

import com.example.custom_queries1.entities.Flight;
import com.example.custom_queries1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/popolate")
    public void popolateFlights(){
        flightService.createRandomFlights();
    }

    @GetMapping("/list")
    public List<Flight> listOfFlights(){
        return flightService.flightsList();
    }
}
