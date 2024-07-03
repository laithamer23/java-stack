package com.example.FruityLoops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FruityLoops.models.Fruity;


@Controller

public class Fruits {
	 @RequestMapping("/")
	    public String index(Model model) {
	        
	        ArrayList<Fruity> fruits = new ArrayList<Fruity>();
	        fruits.add(new Fruity("Kiwi", 1.5));
	        fruits.add(new Fruity("Mango", 2.0));
	        fruits.add(new Fruity("Goji Berries", 4.0));
	        fruits.add(new Fruity("Guava", .75));
	        
	        model.addAttribute("allfruits", fruits);
	        
	        return "index.jsp";
	    }

}
