package com.example.FPL.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Sujet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSujet;

	private String Titre;
	private String description;
	private int nombreVotes;
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "idUser")
//	private User user;

	
	
	
	
	public Sujet() {
		super();

	}

	public int getIdSujet() {
		return idSujet;
	}

	public void setIdSujet(int idSujet) {
		this.idSujet = idSujet;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNombreVotes() {
		return nombreVotes;
	}

	public void setNombreVotes(int nombreVotes) {
		this.nombreVotes = nombreVotes;
	}

	@Override
	public String toString() {
		return "Sujet [idSujet=" + idSujet + ", Titre=" + Titre + ", description=" + description + ", nombreVotes="
				+ nombreVotes + "]";
	}

}
