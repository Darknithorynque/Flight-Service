package com.example.demo.Controller;

import com.example.demo.Entities.Flight;
import com.example.demo.Service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flight")
@RequiredArgsConstructor
public class FlightController {

    private FlightService flightProccessService;


    //All Flights
    @GetMapping("/all")
    public Page<Flight> getAllFlight(@RequestParam(required = false) Boolean isFull, Pageable pageable) {
        return flightProccessService.allFlight(isFull, pageable);
    }

    //Specific Flight
    @GetMapping("/{id}")
    public Optional<Flight> getFlightById(@PathVariable Long id) {
        return Optional.ofNullable(flightProccessService.findFlightById(id).orElse(null));
    }


    @GetMapping("/honda")
    public String soichiroHonda() {
        return "Honda is definitely better";    }
}
