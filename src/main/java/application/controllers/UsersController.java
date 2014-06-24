package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import application.models.User;

@Controller
@RequestMapping("/users")
public class UsersController {
	@RequestMapping("")
	public String index(Model model){
		model.addAttribute("user", new User());
		return "index";
	}
	
	@RequestMapping(value="/info", method=RequestMethod.POST)
	public String info(@ModelAttribute User user, Model model){
		model.addAttribute("user", user);

		return "info";
	}
}