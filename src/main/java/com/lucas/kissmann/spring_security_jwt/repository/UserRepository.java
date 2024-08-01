package com.lucas.kissmann.spring_security_jwt.repository;

import org.springframework.data.repository.CrudRepository;

import com.lucas.kissmann.spring_security_jwt.models.User;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String>{
	
	Optional<User> findByUsername(String username);
}
