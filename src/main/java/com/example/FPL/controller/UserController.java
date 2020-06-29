package com.example.FPL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.FPL.configuration.BCryptManagerUtil;
import com.example.FPL.configuration.JwtTokenUtil;
import com.example.FPL.entities.JwtResponse;
import com.example.FPL.entities.User;
import com.example.FPL.repository.UserRepository;
import com.example.FPL.services.UserService;

import antlr.collections.List;
import spring.session.EvalCand.entities.Evaluation;





@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userrepository;

	@Autowired
	UserService Userservice;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public void  AjoutUser(@RequestBody User user) {
		user.setPassword(BCryptManagerUtil.passwordEncoder().encode(user.getPassword()));
		Userservice.AjoutUser(user);
	}
	@RequestMapping(path = "/all", method = RequestMethod.GET)
	public   List getAll() {
		return (List) Userservice.getAll();
	}
	
	public boolean comparePassword(String requestPass, String currentPassword) {
		PasswordEncoder passencoder = new BCryptPasswordEncoder();
		if (passencoder.matches(requestPass,currentPassword)) {
			return true;
		} else {
			return false;
		}
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody User authenticationRequest) throws Exception {

		User user = Userservice.loadByUsername(authenticationRequest.getUsername());
		String reqPassword = authenticationRequest.getPassword();
		String currentPass = user.getPassword();
		if (comparePassword(reqPassword, currentPass)) {
			System.out.println("valid" + "/" + user.getPassword());
			final String token = jwtTokenUtil.generateToken(user);
			return ResponseEntity.ok(new JwtResponse(token));
		} else {
			System.out.println("invalid" + "/" + reqPassword + "/" + currentPass);
			return ResponseEntity.ok(null);
		}
	}
}
