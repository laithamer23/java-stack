package com.example.Omikuji.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class Omikuji {

	@RequestMapping ("/")
		public String index() {
		return "index.jsp";
	}
	
	@PostMapping ("/omikuji")
		public String registro(
			    @RequestParam(value="number") Integer number,
			    @RequestParam(value="city") String city, 
			    @RequestParam(value="personName") String person,
			    @RequestParam(value="hobby") String hobbie,
			    @RequestParam(value="thing") String thing,
			    @RequestParam(value="say") String say,
			    HttpSession session) {
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobbie);
		session.setAttribute("thing", thing);
		session.setAttribute("say", say);
		
		
		return "redirect:/show";
	}
	
	@GetMapping ("/show")
		public String show(Model model, HttpSession session) {
		Integer number = (Integer) session.getAttribute("number");
		String city = (String) session.getAttribute("city");
		String person = (String) session.getAttribute("person");
		String hobbie = (String) session.getAttribute("hobbie");
		String thing = (String) session.getAttribute("thing");
		String say = (String) session.getAttribute("say");
		
		model.addAttribute("number", number);
		model.addAttribute("city", city);
		model.addAttribute("person", person);
		model.addAttribute("hobbie", hobbie);
		model.addAttribute("thing", thing);
		model.addAttribute("say", say);
		
		return "show.jsp";
	}
	

}
