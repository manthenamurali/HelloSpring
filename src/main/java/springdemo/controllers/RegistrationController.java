package springdemo.controllers;

import java.lang.reflect.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.reflect.TypeToken;

import springdemo.database.dao.RegisterUserDAO;
import springdemo.database.entities.RegisterUserEntity;
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
		
		registerUser(registrationRequest);
		return "Registration status";
	}
	
	private void registerUser(RegistrationRequest request) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

		RegisterUserEntity registerUserEntity = new RegisterUserEntity();
		registerUserEntity.setFirstName(request.getFirstName());
		registerUserEntity.setLastName(request.getLastName());
		registerUserEntity.setUserName(request.getUserName());
		registerUserEntity.setPassword(request.getPassword());

		RegisterUserDAO registerUserDAO = context.getBean(RegisterUserDAO.class);
		registerUserDAO.registerUser(registerUserEntity);
		
		context.close();
		
	}
}
