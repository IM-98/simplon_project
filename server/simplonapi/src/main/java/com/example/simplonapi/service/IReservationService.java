package com.example.simplonapi.service;

import com.example.simplonapi.entity.Reservation;

import java.util.Optional;


public interface IReservationService {

    Reservation save(Reservation resa);

    Optional<Reservation> findById(int id);

    Iterable<Reservation> findAll();

    String deleteByID(int id);

    String delete(Reservation resa);

    Optional<Reservation> updateById(int id, Optional<Reservation> resa);



}
