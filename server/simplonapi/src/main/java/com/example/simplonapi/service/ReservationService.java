package com.example.simplonapi.service;

import com.example.simplonapi.entity.Reservation;
import com.example.simplonapi.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationService implements IReservationService{

    @Autowired
    private ReservationRepository reservationRepository;


    @Override
    public Reservation save(Reservation resa) {
        reservationRepository.save(resa);
        return resa;
    }

    @Override
    public Optional<Reservation> findById(int id) {
        return reservationRepository.findById(id);
    }

    @Override
    public Iterable<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public String deleteByID(int id) {
        reservationRepository.deleteById(id);
        return "votre réservation a bien été annulé";
    }

    @Override
    public String delete(Reservation resa) {
        reservationRepository.delete(resa);
        return "votre réservation a bien été annulé";
    }

    @Override
    public Optional<Reservation> updateById(int id, Optional<Reservation> resa){

        Optional<Reservation> reservationToUpdate =  reservationRepository.findById(id);
        reservationToUpdate = resa;

        return reservationToUpdate;
    }
}
