package com.example.BurgerTracker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.BurgerTracker.Serv.BurgerTrackerServ;
import com.example.BurgerTracker.models.BurgerTraker;

import jakarta.validation.Valid;

@Controller
public class BurgerTrakerCont {
	@Autowired
	BurgerTrackerServ burgertrackerServ;

	@GetMapping("/")
	public String index(@ModelAttribute("burgertraker") BurgerTraker burgertracker, Model model) {
		model.addAttribute("allburgertraker", burgertrackerServ.allBurgers());
		return "index.jsp";
	}

	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("burgertraker") BurgerTraker burgertracker, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}
		burgertrackerServ.createBurgerTraker(burgertracker);
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		BurgerTraker burgertraker = burgertrackerServ.findBurgerTraker(id);
		model.addAttribute("burgertraker", burgertraker);
		return "edit.jsp";
	}

	@PutMapping("/update/{id}")
	public String update(@Valid @ModelAttribute("burgertraker") BurgerTraker burgertracker, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("burgertraker", burgertracker);
			return "edit.jsp";
		} else {
			burgertrackerServ.updateBurgerTraker(burgertracker);
			return "redirect:/";
		}
	}



}
