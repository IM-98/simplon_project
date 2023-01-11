package com.example.simplonapi.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="avis")
@Data
public class Avis{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_avis")
	private int id;
	
	private String text;
	
	private String titre;
	
	private Date date;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	private Client client;
	
}
