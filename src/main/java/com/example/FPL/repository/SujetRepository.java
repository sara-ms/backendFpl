package com.example.FPL.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FPL.entities.Sujet;

@Repository("SujetRepository")
public interface SujetRepository extends JpaRepository<Sujet, Integer>  {

	

}
