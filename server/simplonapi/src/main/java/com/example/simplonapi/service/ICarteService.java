package com.example.simplonapi.service;


import com.example.simplonapi.entity.Carte;

public interface ICarteService {
	
	Carte save(Carte carte);
	Iterable<Carte> findAll();
}	
