package com.example.simplonapi.controller;

import com.example.simplonapi.entity.Reservation;
import com.example.simplonapi.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/reservation")
public class ReservationController {
    @Autowired
    private IReservationService iReservationService;

    @GetMapping(path = "/get")
    public Optional<Reservation> getReservationById (@RequestParam int Id){
        return iReservationService.findById(Id);
    }

    @GetMapping(path = "/getAll")
    public Iterable<Reservation> getAllReservation(){
        return iReservationService.findAll();
    }

    @DeleteMapping(path = "/delete")
    public String deleteReservationById(@RequestParam int Id){

        return iReservationService.deleteByID(Id);
    }

    @PostMapping(path = "/new")
    public Reservation addReservation(Reservation resa){
        return iReservationService.save(resa);
    }

    @PutMapping(path = "/update")
    public Optional<Reservation> updateById(int id, Optional<Reservation> resa){
        return  iReservationService.updateById(id, resa);
    }



}
