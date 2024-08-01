package com.lucas.kissmann.spring_security_jwt.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lucas.kissmann.spring_security_jwt.repository.UserRepository;
import com.lucas.kissmann.spring_security_jwt.security.UserAuthenticated;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private final UserRepository repository;

	public UserDetailsServiceImpl(UserRepository repository) {
		this.repository = repository;
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repository.findByUsername(username)
			.map(UserAuthenticated::new)
			.orElseThrow(() -> new UsernameNotFoundException("User not found"));
	}
	
}
