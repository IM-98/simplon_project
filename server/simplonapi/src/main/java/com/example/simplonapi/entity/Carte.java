package com.example.simplonapi.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Carte {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_carte")
	private int id;
	
	private String image;
	
	private String nom;
	
	private String resume;
	
	@OneToMany(mappedBy="carte",cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JsonManagedReference(value="carte")
	private List<Menu> menu;
}
