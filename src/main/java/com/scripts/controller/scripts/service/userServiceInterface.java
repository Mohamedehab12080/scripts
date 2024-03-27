package com.scripts.controller.scripts.service;
import java.util.List;

import java.util.Optional;

import com.scripts.controller.scripts.DTO.userDto;
import com.scripts.controller.scripts.model.User;

public interface userServiceInterface {

	
	User findByName(String name);
	User findById(Long id);
	User findByEmail(String email);
	String insertUser(User user);
	String enableUserById(Long id);
	String enableUserByEmail(String email);
	String deleteUserById(Long id);
	List<User> findAllUsers();
	String disableUserById(Long id);
	String updateUser(userDto user);
	
}
