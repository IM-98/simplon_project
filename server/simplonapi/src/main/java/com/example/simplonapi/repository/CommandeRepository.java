package com.example.simplonapi.repository;

import com.example.simplonapi.entity.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends CrudRepository<Commande,Integer> {
}
