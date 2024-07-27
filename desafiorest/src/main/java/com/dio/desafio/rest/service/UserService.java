package com.dio.desafio.rest.service;

import com.dio.desafio.rest.domain.model.User;

public interface UserService {

	User findById(Long id);
	
	User create(User userToCreate);
}
