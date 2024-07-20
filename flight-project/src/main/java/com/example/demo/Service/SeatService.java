package com.example.demo.Service;

import com.example.demo.Entities.Flight;
import com.example.demo.Entities.Seat;
import com.example.demo.Repository.FlightRepository;
import com.example.demo.Repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor //doesn't work
public class SeatService {

    private SeatRepository seatRepository;


    public Seat getByFlightIdAndSeatId(Long flightId, Long id) {
        return seatRepository.findByFlightIdAndId(flightId, id);
    }

    public Seat saveByFlightIdAndSeatId(Seat seat) {
        return seatRepository.save(seat);
    }

    // remove unnecessary methods, use specification
    public Page<Seat> seatsByFlightId(Long flightId, Pageable pageable) {return seatRepository.findByFlightId(flightId, pageable);}

    public Page<Seat> getAllSeats(Pageable pageable) {return seatRepository.findAll(pageable);}

}
