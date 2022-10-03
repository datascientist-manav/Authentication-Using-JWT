package com.authenticationservice.service;

import java.util.Map;

import com.authenticationservice.model.UserDao;

public interface SecurityTokenGenerator {
	
	public Map<String, String> generateToken(UserDao userDao);

}
