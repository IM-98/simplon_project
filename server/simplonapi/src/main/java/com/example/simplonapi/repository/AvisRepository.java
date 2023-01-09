package com.example.simplonapi.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.simplonapi.entity.Avis;

@Repository
public interface AvisRepository extends CrudRepository<Avis, Integer>{
	
}
