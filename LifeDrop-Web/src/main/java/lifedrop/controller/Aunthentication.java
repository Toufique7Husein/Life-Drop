package lifedrop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import lifedrop.dummydata.User;

@Controller
public class Aunthentication {

	@RequestMapping("/login")
	public String login() {

		return "login";
	}

	@RequestMapping("/register")
	public String registration() {
		return "registration";
	}

	
	@RequestMapping(path = "/registrationData", method = RequestMethod.POST)
	public String registrationHandle(@ModelAttribute User user, Model model) {
		System.out.println(user);
		return "home";
	}
	 

}