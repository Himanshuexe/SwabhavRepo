package com.monocept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GoodByeService {
	@Value("${message.goodbye}")
	private String message;
	
	public String getMessage() {
		return message;
	}
}
