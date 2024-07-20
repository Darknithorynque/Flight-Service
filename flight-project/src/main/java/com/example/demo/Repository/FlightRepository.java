package com.example.demo.Repository;

import com.example.demo.Entities.Flight;
import com.example.demo.Entities.Seat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

     Page<Flight> findAllByIsFull(boolean full, Pageable pageable);



}
