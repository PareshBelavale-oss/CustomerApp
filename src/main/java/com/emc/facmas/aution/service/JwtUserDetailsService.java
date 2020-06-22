package com.emc.facmas.aution.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User("Paresh","$2a$04$UM4HLmoPNzwLcgrwX3drvuGQ7WKRNPeYYB6uV/qbK1r.Az51xISZS",new ArrayList());
	}

}
