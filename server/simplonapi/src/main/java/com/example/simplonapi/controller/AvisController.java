package com.example.simplonapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplonapi.dto.AvisDto;
import com.example.simplonapi.entity.Avis;
import com.example.simplonapi.entity.Client;
import com.example.simplonapi.service.IAvisService;

@CrossOrigin
@RestController
@RequestMapping("/avis")
public class AvisController {
	@Autowired
	IAvisService avisService;
	
	@GetMapping(path="")
	@ResponseBody
	List<AvisDto> getAllAvis(){
		Iterable<Avis> listAvis=avisService.findAll();
		return AvisDto.toListAvisDto((List<Avis>)listAvis);
		}
	
	@PostMapping(path="/new")
	public Avis addAvis(@RequestBody Avis avis) {
		return avisService.save(avis);
	}
	
	@GetMapping(path="/{id}")
	public Client getClientParAvis(int idAvis) {
		return avisService.findById(idAvis).get().getClient() ; 
	}
}
