package com.example.simplonapi.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Menu {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_menu")
	private int id;
	
	private String entree;
	
	private String plat;
	
	private String dessert;
	
	private String urlImage;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name="id_carte",referencedColumnName="id_carte",nullable=true)
	private Carte carte;
	
	@ManyToOne
	@JsonBackReference
	private Reservation reservation;
	
	
}
