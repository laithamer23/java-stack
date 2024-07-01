package com.example.dojo_ninja.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dojo_ninja.models.Dojo;
import com.example.dojo_ninja.models.NinjaModels;
import com.example.dojo_ninja.services.DojoServ;
import com.example.dojo_ninja.services.NinjaServ;


@Controller
public class NinjaController {
@Autowired
NinjaServ ninjaserv ;
@Autowired
DojoServ dojoserv ;

@GetMapping("/ninja/new")
public String createninja(@ModelAttribute("ninja")NinjaModels ninja,Model model  ){
	List<Dojo> alldojos = dojoserv.alldojos();
	model.addAttribute("alldojos",alldojos);
	return "ninja.jsp";
	
}

@PostMapping("/createninja")
public String createninja(@ModelAttribute("ninja") NinjaModels ninja){
	ninjaserv.createNinja(ninja);
	return "ninja.jsp";
	
}








}

