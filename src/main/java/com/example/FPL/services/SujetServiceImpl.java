package com.example.FPL.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FPL.entities.Sujet;
import com.example.FPL.repository.UserRepository;
import com.example.FPL.repository.SujetRepository;

@Service("SujetService")
public class SujetServiceImpl  implements SujetService{
	
	@Autowired
	SujetRepository sujetrepository;

	@Autowired
	UserRepository userrepository;

	
	
	@Override
	public   List<Sujet> getAll() {

		return sujetrepository.findAll();
	}



	@Override
	public void AjoutSujet(Sujet sujet) {
	 sujetrepository.save( sujet);
		
	}
	

}
