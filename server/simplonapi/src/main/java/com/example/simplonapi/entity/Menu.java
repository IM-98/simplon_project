package com.example.simplonapi.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
	@ManyToMany
	List<Commande> commande;
}
