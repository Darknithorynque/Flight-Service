package com.example.demo.Service;

import com.example.demo.Entities.Flight;
import com.example.demo.Entities.Seat;
import com.example.demo.Repository.FlightRepository;
import com.example.demo.Repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FlightService {

    private FlightRepository flightRepository;

    // add create/update/delete developments to flight logic.
    // use specifications here too

    public Page<Flight> allFlight(@RequestParam(required = false) boolean isFull, Pageable pageable) {
        if( !isFull) {
            return flightRepository.findAllByIsFull(isFull, pageable);
        }
        return flightRepository.findAll(pageable);
    }


    public Optional<Flight> findFlightById(Long id) {
        return flightRepository.findById(id);
    }


}
