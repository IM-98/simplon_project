package com.example.simplonapi.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.example.simplonapi.entity.Avis;

import lombok.Data;

@Data
public class AvisDto {
	private String text;
	
	private String titre;
	
	private Date date;
	
	private String  nomClient;
	
	public AvisDto(Avis avis) {
		this.date=avis.getDate();
		this.nomClient=avis.getClient().getNom();
		this.titre=avis.getTitre();
		this.text=avis.getText();
	}
	
	public static AvisDto toAvisDto(Avis avis) {		
		return new AvisDto(avis);
	}
	
	public static List<AvisDto> toListAvisDto(List<Avis> listAvis){
		List<AvisDto> retour=new ArrayList<>();
		listAvis.forEach(avis->{
			AvisDto avisDto=AvisDto.toAvisDto(avis);
			retour.add(avisDto);
		});
		return retour;
	}

}
