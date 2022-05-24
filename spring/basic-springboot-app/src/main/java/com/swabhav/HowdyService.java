package com.swabhav;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HowdyService {
	@Value("${message.howdy}")
	private String message;

	public String getMessage() {
		return message;
	}
}
