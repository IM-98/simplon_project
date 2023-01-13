package com.example.simplonapi.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.simplonapi.entity.Avis;
import com.example.simplonapi.entity.Client;
import com.example.simplonapi.service.IClientService;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AvisDto {
	
	
	private String text;
	
	private String titre;
	
	//private Date date;
	
	private String  nomClient;
	
	private String email;
	
	public AvisDto(Avis avis) {
		//this.date=avis.getDate();
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
	
	public  static Avis toAvis(AvisDto avisDto, IClientService clientService) {
		Client client= clientService.findByMail(avisDto.email).get();
		Avis avis=Avis.builder().client(client).text(avisDto.text).titre(avisDto.titre).build();
		return avis;
	}

}
