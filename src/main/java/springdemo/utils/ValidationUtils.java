package springdemo.utils;

import org.springframework.stereotype.Component;

@Component
public class ValidationUtils {

	public boolean validateEmail(String email) {
		
		if(email == null || email.length() == 0) {
			return false;
		}
		
		System.out.println("final = " + email.contains("@"));
		return (email.contains("@"));
	}
}
