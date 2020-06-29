package com.example.FPL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.FPL.entities.Sujet;

import com.example.FPL.repository.SujetRepository;

import com.example.FPL.services.SujetService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/sujet")
public class SujetController {
	@Autowired
	SujetRepository sujetrepository;

	@Autowired
	SujetService sujetservice;
	
	
	@RequestMapping(path = "/addSujet", method = RequestMethod.POST)
	public void  AjoutSujet(@RequestBody Sujet sujet) {
		sujetrepository.save(sujet);
	}
	
}
