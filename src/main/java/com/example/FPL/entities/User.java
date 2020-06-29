package com.example.FPL.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUser;
	private String nom;
	private String prenom;
	
	@NotNull
	private String username;
	private String password;
	
	
//@OneToMany(mappedBy = "sujet", cascade = { CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.REFRESH,
//			CascadeType.MERGE, CascadeType.DETACH })
//	private List<Sujet> sujet;
	
	
	
	public User() {
		super();
		
	}






	public User(int idUser, String nom, String prenom, String email, @NotNull String username, String password) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
	
		this.username = username;
		this.password = password;
	}






	public int getIdUser() {
		return idUser;
	}






	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}






	public String getNom() {
		return nom;
	}






	public void setNom(String nom) {
		this.nom = nom;
	}






	public String getPrenom() {
		return prenom;
	}






	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}





	public String getUsername() {
		return username;
	}






	public void setUsername(String username) {
		this.username = username;
	}






	public String getPassword() {
		return password;
	}






	public void setPassword(String password) {
		this.password = password;
	}






	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", username=" + username
				+ ", password=" + password + "]";
	}






	






	
	
	
	
}
