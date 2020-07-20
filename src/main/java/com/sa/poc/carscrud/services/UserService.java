package com.sa.poc.carscrud.services;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.sa.poc.carscrud.dao.UserRepository;
import com.sa.poc.carscrud.entities.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public boolean isValidToken(String token) {

		String decoded = new String(Base64.getDecoder().decode(token));
		String userName = null;
		String password = null;
		if (!StringUtils.isEmpty(decoded) && decoded.contains(":")) {
			String[] arr = decoded.split(":");
			userName = arr[0];
			password = arr[1];
			User user = userRepo.findByName(userName);
			if (user.getPassword().equals(password)) {
				return true;
			}
		}

		return false;
	}
}
