package com.example.demo.Controller;

import com.example.demo.Entities.Flight;
import com.example.demo.Entities.Seat;
import com.example.demo.Repository.SeatRepository;
import com.example.demo.Service.FlightService;
import com.example.demo.Service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/seat")
public class SeatController {

    private SeatService seatService;


    //Seats of specific flight
    @GetMapping("/{flightId}/seats")
    public Page<Seat> getSeatsOfSpecificFlight(@PathVariable(required = true) Long flightId, Pageable pageable) {
        return seatService.seatsByFlightId(flightId, pageable);
    }

    @GetMapping("/all")
    public Page<Seat> getAllSeats(Pageable pageable) {
        return seatService.getAllSeats(pageable);
    }

    //Seat of specific flight
    @GetMapping("/{flightId}/seat/{id}")
    public Seat getSeatOfSpecificFlight(@PathVariable Long flightId, @PathVariable Long id){
        return seatService.getByFlightIdAndSeatId(flightId, id);
    }


    @PostMapping("/{flightId}/seat/{id}")
    public Seat saveSeatOfSpecificFlight(@RequestBody Seat seat){
        return seatService.saveByFlightIdAndSeatId(seat);
    }

    @GetMapping("/honda")
    public String soichiroHonda() {
        return "Honda is definitely great but Mazda is the god.";    }
}
