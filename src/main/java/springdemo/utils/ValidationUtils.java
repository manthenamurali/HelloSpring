package springdemo.utils;

import org.springframework.stereotype.Component;

@Component
public class ValidationUtils {

	public boolean validateEmail(String email) {
		
		if(email == null || email.length() == 0) {
			return false;
		}
		
		return (email.contains("@"));
	}
}
