package com.example.simplonapi.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="client")
@Getter @Setter
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int id;
	
	private String nom;
	
	private String prenom;
	
	private String mail;
	
	@OneToMany(mappedBy="client")
	@JsonManagedReference
	private List<Avis> avis = new ArrayList<>();
	
	@OneToMany(mappedBy="client" )
	@JsonManagedReference
	private List<Reservation> reservation = new ArrayList<>();
	

}
