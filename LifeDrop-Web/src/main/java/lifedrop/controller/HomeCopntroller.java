package lifedrop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCopntroller {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "About";
	}
	
	@RequestMapping("/home")
	public String home2() {
		return "home";
	}
}
