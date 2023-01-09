package com.example.simplonapi.service;



import java.util.ArrayList;
import java.util.List;

import com.example.simplonapi.entity.Avis;

public interface IAvisService {
	Avis save(Avis avis);

    Iterable<Avis> findAll();
}
