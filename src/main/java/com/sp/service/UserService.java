package com.sp.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sp.entity.User;

import com.sp.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository UserRepository;
	private final CardService CardService;

	public UserService(UserRepository UserRepository, CardService CardService) {
		this.CardService = CardService;
		this.UserRepository = UserRepository;
	}

	public User getUser(int id) {
		Optional<User> user = UserRepository.findById(id);
		return user.get();
	}

	public User connexion (String name, String mdp ) {
		for (User user: UserRepository.findByName(name)) {
			if (user.getName() == name && user.getPassword() == mdp){
				return user;
			}
		}
		return null;
	}

	public Collection<User> getUsers() {
		List<User> users = new ArrayList<User>();
		for (User u : UserRepository.findAll()) {
			users.add(u);
		}

		return users;
	}

	public User addUser(User user) {
		UserRepository.save(user);
		CardService.generateCard(user.getId());
		return user;
	}
	
	public User updateUser(User user) {
		return UserRepository.save(user);
	}

}
