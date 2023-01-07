package com.example.simplonapi.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="avis")
public class Avis {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_avis")
	private int id;
	private String text;
	private Date date;
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;
	
}