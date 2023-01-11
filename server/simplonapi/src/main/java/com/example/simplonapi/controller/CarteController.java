package com.example.simplonapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplonapi.entity.Carte;
import com.example.simplonapi.service.ICarteService;

@CrossOrigin
@RestController
@RequestMapping(path="/cartes")
public class CarteController {
	@Autowired
	ICarteService carteService;
	
	@GetMapping(path="")
	public Iterable<Carte> getAllCartes(){
		return carteService.findAll();
	}
	
	@PostMapping(path="/new")
	public Carte addCarte(@RequestBody Carte carte) {
		return carteService.save(carte);
	}		
}
