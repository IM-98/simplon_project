package com.example.simplonapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int id;
	private String nom;
	private String prenom;
	private String mail;
}
