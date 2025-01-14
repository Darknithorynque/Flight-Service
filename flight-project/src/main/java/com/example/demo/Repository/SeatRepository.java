package com.example.demo.Repository;

import com.example.demo.Entities.Seat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long > {
    Page<Seat> findByFlightId(Long flightId, Pageable pageable);
    Seat findByFlightIdAndId(Long flightId, Long id);

}
