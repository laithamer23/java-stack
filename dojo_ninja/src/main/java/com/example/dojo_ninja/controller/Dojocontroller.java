package com.example.dojo_ninja.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dojo_ninja.models.Dojo;
import com.example.dojo_ninja.services.DojoServ;

@Controller
public class Dojocontroller {
@Autowired
DojoServ dojoserv ;

@GetMapping("/dojos/new")
public String createdojo(@ModelAttribute("dojo")Dojo dojo){
	return "dojo.jsp";
}


@PostMapping("/createdojo")
public String createdojo1(@ModelAttribute("dojo")Dojo dojo) {
	dojoserv.createDojo(dojo);
	return "dojo.jsp";
}
@GetMapping("/dojos/{id}")
public String showdojo(Model model,@PathVariable("id") Long id ){
	Dojo dojo= dojoserv.findDojo(id);
	model.addAttribute("dojo",dojo);
	return "dojo_page.jsp";
}


}
