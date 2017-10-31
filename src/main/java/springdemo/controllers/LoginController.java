package springdemo.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springdemo.models.request.login.LoginRequest;
import springdemo.utils.MyLogger;

@Controller
public class LoginController {

	@ResponseBody
	@RequestMapping(value = "/login", 
					method = RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					name="Login API")
	public String loginUser(@RequestHeader(name = "source") String source,
			@ModelAttribute LoginRequest loginRequest) {
		MyLogger.info("Login " + loginRequest.getUserName());
		return "Login success!! ";
	}
}
