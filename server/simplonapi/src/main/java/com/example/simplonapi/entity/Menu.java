package com.example.simplonapi.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
    @JoinTable( name = "commande_menu_asociations",
                joinColumns = @JoinColumn( name = "id_menu" ),
                inverseJoinColumns = @JoinColumn( name = "id_commande" ) )
    private List<Commande> commandes = new ArrayList<>();
}
