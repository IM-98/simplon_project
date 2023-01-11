package com.example.simplonapi.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplonapi.entity.Avis;
import com.example.simplonapi.entity.Client;
import com.example.simplonapi.service.IAvisService;

import dto.AvisDto;

@CrossOrigin
@RestController
@RequestMapping("/avis")
public class AvisController {
	@Autowired
	IAvisService avisService;
	
	@GetMapping(path="")
	@ResponseBody
	List<AvisDto> getAllAvis(){
		Iterable<Avis> result=avisService.findAll();
		List<AvisDto> retour=new ArrayList<>();
		result.forEach(avis->{
			AvisDto avisDto=new AvisDto(avis);
			retour.add(avisDto);
		});
		return retour;
	}
	
	@PostMapping(path="/new")
	public Avis addAvis(@RequestBody Avis avis) {
		System.out.println("fait2");
		return avisService.save(avis);
	}
	
	@GetMapping(path="/{id}")
	public Client getClientParAvis(int idAvis) {
		return avisService.findById(idAvis).get().getClient() ; 
	}
}
