package com.example.simplonapi.controller;

import com.example.simplonapi.entity.Reservation;
import com.example.simplonapi.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "/reservations")
public class ReservationController {
    @Autowired
    private IReservationService iReservationService;

    @GetMapping(path = "/{id}")
    public Optional<Reservation> getReservationById (@PathVariable("id") int Id){
        return iReservationService.findById(Id);
    }

    @GetMapping(path = "")
    public Iterable<Reservation> getAllReservation(){
        return iReservationService.findAll();
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteReservationById(@PathVariable("id") int Id){

        return iReservationService.deleteByID(Id);
    }

    @PostMapping(path = "/new")
    public Reservation addReservation(@RequestBody Reservation resa){
        return iReservationService.save(resa);
    }

    @PutMapping(path = "/update")
    public Reservation updateById(Reservation resa){
        return  iReservationService.update(resa);
    }



}
