package com.authenticationservice.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


import com.authenticationservice.model.UserDao;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@Service
public class SecurityTokenGeneratorIMPL implements SecurityTokenGenerator {

	@Override
	public Map<String, String> generateToken(UserDao userDao) {
		
		String jwstToken = Jwts.builder().setSubject(userDao.getUsername()).setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256,"secretekeyid").compact();
	    Map<String,String> mapData = new HashMap<>();
	    mapData.put("token",jwstToken);
	    mapData.put("message","Authentication Successful.");
	    return mapData;
	
	}

}
