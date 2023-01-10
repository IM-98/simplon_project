package com.example.simplonapi.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_reservation")
	private int id;
	
	private Date horaire;
	
	private int nbrPersonne;
	
	@ManyToOne
	@JsonBackReference
	private Client client;
	
	@OneToMany(mappedBy="reservation")
	@JsonManagedReference(value="commande")
	List<Menu> commande= new ArrayList<>();
	
}
