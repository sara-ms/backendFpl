package com.example.FPL.services;

import java.util.List;

import com.example.FPL.entities.User;





public interface UserService {
	public void AjoutUser(User user);
   
	List<User> getAll();
	
	public User loadByUsername(String username) ;
//	public User loadbyPassword(String password);
//
//	public User getConnectedUser(String username);
}