package com.example.simplonapi.service;

import com.example.simplonapi.entity.Commande;

import java.util.Optional;

public interface ICommandeService {

    Commande save(Commande commande);

    Optional<Commande> findById(int id);

    Iterable<Commande> findAll();

    String deleteByID(int id);

    String delete(Commande commande);

    Commande update( Commande commande);
}
