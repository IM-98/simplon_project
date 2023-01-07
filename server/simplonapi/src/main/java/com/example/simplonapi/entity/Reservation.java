package com.example.simplonapi.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	@JoinColumn(name="id_client")
	private Client client;
	@OneToOne
	@JoinColumn(name="id_commande")
	private Commande commande;
	
}
