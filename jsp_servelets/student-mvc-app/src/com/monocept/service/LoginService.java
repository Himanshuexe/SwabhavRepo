package com.monocept.service;

import java.util.HashMap;
import java.util.Map;

import com.monocept.dto.UserDTO;
import com.monocept.model.User;

public class LoginService {
	private static LoginService instance;
	private Map<Integer, User> users = new HashMap<>();

	private LoginService() {
		users.put(101, new User(101, "himanshu", "Himanshu", "himanshu@gmail.com", true));
		users.put(102, new User(102, "rohan", "Rohan", "rohan@gmail.com", true));
		users.put(103, new User(103, "abhishek", "Abhishek", "abhishek@gmail.com", true));
	}

	public static LoginService getInstance() {
		LoginService result = instance;
		if (result == null) {
			result = instance;
			instance = result = new LoginService();
		}
		return instance;
	}

	public UserDTO getUser(int loginid, String password) {
		UserDTO userDto = null;
		User user;
		if (users.containsKey(loginid)) {
			user = users.get(loginid);
			if (user.getPassword().contentEquals(password)) {
				userDto = new UserDTO(user.getName(), user.getEmail());
			}
		}
		return userDto;
	}
}
