package com.example.simplonapi.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simplonapi.entity.Carte;
import com.example.simplonapi.repository.CarteRepository;

@Service
public class CarteService implements ICarteService{
	@Autowired
	CarteRepository carteRepository;
	
	@Override
	public Carte save(Carte carte) {
		return carteRepository.save(carte);
	}

	@Override
	public Iterable<Carte> findAll() {
		return carteRepository.findAll();
	}

}
