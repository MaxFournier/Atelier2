package com.sp.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sp.service.UserService;
import com.sp.entity.User;

@RestController
public class UserController {
	
	private final UserService UserService;
	
	public UserController(UserService userService) {
		this.UserService=userService;
	}
	
	@GetMapping("/Users")
	public Collection<User> getUsers(){
		return UserService.getUsers();
		
	}
	
	@GetMapping("/User/{id}")
	public User getUser(@PathVariable String id){
		int current_id=Integer.valueOf(id);
		return UserService.getUser(current_id);
	}

	@GetMapping("/User/connexion/{name}/{mdp}")
	public User connexion (@PathVariable String name, @PathVariable String mdp){
		return UserService.connexion(name, mdp);
	}
	
	@PostMapping("/User")
	public User addUser(@RequestBody User u){
		return UserService.addUser(u);
		
	}
	
}
