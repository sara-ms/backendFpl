package com.example.FPL.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FPL.entities.User;
import com.example.FPL.repository.UserRepository;



@Service("UserService")
	public class UserServiceImpl implements UserService {
		@Autowired
		UserRepository userrepository;
		@PersistenceContext
		EntityManager em;
	
	
	@Override
	public void AjoutUser (User user) {
		userrepository.save(user);

	}
	public User loadByUsername(String username) {

		TypedQuery<User> query = (TypedQuery<User>) em
				.createQuery("SELECT u FROM User u WHERE u.username = :username", User.class);
		User user = query.setParameter("username", username).getSingleResult();
		return user;

	}
	@Override
	public List<User> getAll() {

		return userrepository.findAll();
	}

}
