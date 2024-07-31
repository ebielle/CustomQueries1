package com.example.custom_queries1.services;

import com.example.custom_queries1.entities.Flight;
import com.example.custom_queries1.entities.StatusEnum;
import com.example.custom_queries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public void createRandomFlights(){
        Random random = new Random();

        for(int i = 0; i <= 50; i++){
            Flight flight = new Flight(i, random.toString(), random.toString(), random.toString(), StatusEnum.ONTIME);
            flightRepository.save(flight);
        }
    }

    public List<Flight> flightsList(){
        return flightRepository.findAll();
    }
}
