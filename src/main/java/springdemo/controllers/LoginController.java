package springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(path = "/login", 
					method = RequestMethod.POST, 
					consumes = "application/json")
	public void loginUser() {
		
	}
}
