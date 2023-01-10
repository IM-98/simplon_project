package com.example.simplonapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplonapi.entity.Avis;
import com.example.simplonapi.service.IAvisService;

@RestController
@RequestMapping("/avis")
public class AvisController {
	@Autowired
	IAvisService avisService;
	
	@GetMapping(path="")
	@ResponseBody
	Iterable<Avis> getAllAvis(){
		System.out.println("avis");
//		ArrayList<Avis> retour= new ArrayList<>();
//		retour=	(ArrayList<Avis>) avisService.findAll();
//		for(Avis form:retour) {
//			System.out.println(form.getClient().getNom());
//		}
		return avisService.findAll();
	}
}
