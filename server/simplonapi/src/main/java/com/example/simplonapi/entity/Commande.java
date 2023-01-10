package com.example.simplonapi.entity;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="commande")
public class Commande {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_commande")
	private int id;
	private int prix;
	@OneToOne
	@JoinColumn(name="id-reservation")
	private Reservation reservation;
	@ManyToMany
    @JoinTable( name = "commande_menu_asociations",
                joinColumns = @JoinColumn( name = "id_commande" ),
                inverseJoinColumns = @JoinColumn( name = "id_menu" ) )
	private List<Menu> menu;
}
