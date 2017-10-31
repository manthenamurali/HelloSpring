package springdemo.controllers;

import java.lang.reflect.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.reflect.TypeToken;

import springdemo.models.request.registration.RegistrationRequest;
import springdemo.utils.JSONUtils;
import springdemo.utils.ValidationUtils;

@Controller
public class RegistrationController {

	@Autowired
	ValidationUtils validationUtils;
	
	@ResponseBody
	@RequestMapping(name = "Registration API",
					value = "/register",
					method = RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public String register(@RequestBody String request) {

		Type responseType = new TypeToken<RegistrationRequest>() {}.getType();
		RegistrationRequest registrationRequest = JSONUtils.convertToModel(request, responseType);
		
		boolean isValidEmail = validationUtils.validateEmail(registrationRequest.getUserName());
		return "Registration status = " + isValidEmail;
		
	}
}
