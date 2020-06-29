package com.example.FPL.services;

import java.util.List;

import com.example.FPL.entities.Sujet;


public interface SujetService {
	
	List<Sujet> getAll();
	public void AjoutSujet (Sujet sujet);
}