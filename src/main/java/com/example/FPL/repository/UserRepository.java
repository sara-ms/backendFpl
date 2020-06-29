package com.example.FPL.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FPL.entities.User;




	@Repository("UserRepository")
	public interface UserRepository extends JpaRepository<User, Integer> {
		
	}


