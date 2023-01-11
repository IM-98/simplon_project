package com.example.simplonapi.entity;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
	@JsonBackReference(value="carte")
	@JoinColumn(name="id_carte",referencedColumnName="id_carte",nullable=true)
	private Carte carte;
	
	@ManyToMany(mappedBy="menus")
	@JsonIgnore	      
	private List<Reservation> reservations=new ArrayList<>();
	
	
}
