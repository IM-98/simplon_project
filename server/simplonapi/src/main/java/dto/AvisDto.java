package dto;

import java.sql.Date;

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

}
