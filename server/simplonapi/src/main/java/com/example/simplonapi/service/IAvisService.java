package com.example.simplonapi.service;



import java.util.Optional;

import com.example.simplonapi.entity.Avis;

public interface IAvisService {
	Avis save(Avis avis);
	Optional<Avis> findById(int id);
    Iterable<Avis> findAll();
}
