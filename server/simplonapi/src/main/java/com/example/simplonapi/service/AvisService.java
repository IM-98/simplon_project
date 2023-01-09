package com.example.simplonapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simplonapi.entity.Avis;
import com.example.simplonapi.repository.AvisRepository;

@Service
public class AvisService implements IAvisService{
	@Autowired
    private AvisRepository avisRepository;

	
	@Override
	public Avis save(Avis avis) {
		avisRepository.save(avis);
		return avis;
	}

	@Override
	public Iterable<Avis> findAll() {
		return avisRepository.findAll();
	}
}
