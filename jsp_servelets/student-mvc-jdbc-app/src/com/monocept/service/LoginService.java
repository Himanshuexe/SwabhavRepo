package com.monocept.service;

import com.monocept.dto.UserDTO;
import com.monocept.model.User;
import com.monocept.repository.UserRepository;

public class LoginService {
	private static LoginService instance;
	private static Object mutex = new Object();
	private UserRepository userRepository;

	private LoginService() {
		System.out.println("Login Service Started");
		userRepository = new UserRepository();
	}

	public static LoginService getInstance() {
		LoginService result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new LoginService();
			}
		}
		return instance;
	}

	public UserDTO getUser(int loginid, String password) {
		User user = null;
		UserDTO userDto = null;
		user = userRepository.getUser(loginid, password);
		userDto = new UserDTO(user.getName(), user.getEmail());
		return userDto;
	}
}
