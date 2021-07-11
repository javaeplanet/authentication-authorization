package com.javaeplanet.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javaeplanet.auth.entity.Student;
import com.javaeplanet.auth.repos.StudentRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private StudentRepository repos;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Student std = repos.findByEmail(username);
		if (std == null) {
			throw new UsernameNotFoundException("User Not found for the email " + username);
		}

		return new org.springframework.security.core.userdetails.User(std.getEmail(), std.getPassword(), std.getRoles());
	}

}
