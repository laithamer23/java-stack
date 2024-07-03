package com.example.Save.Travels.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.example.Save.Travels.models.Expense;
import com.example.Save.Travels.services.ExpenseServ;

import jakarta.validation.Valid;

@Controller
public class ExpenseConroller {
@Autowired
ExpenseServ expenseServ;


@GetMapping("/expenses")
public String index(@ModelAttribute("expense") Expense  expense,Model model) {
	model.addAttribute("expenses",expenseServ.allExpense());
	return "index.jsp";
}
@PostMapping("/create")
public String create(@Valid@ModelAttribute("expense") Expense  expense,BindingResult result) {
	if (result.hasErrors()) {
		return "index.jsp";
	}
	expenseServ.createexpense(expense);
	return "redirect:/expenses";
}

@RequestMapping("/edit/{id}")
public String edit(@PathVariable("id") Long id, Model model) {
	Expense expense = expenseServ.findExpense(id);
    model.addAttribute("expense", expense);
    return "edit.jsp";
}
@PutMapping("/expense/edit/{id}")
public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
    if (result.hasErrors()) {
        model.addAttribute("expense", expense);
        return "edit.jsp";
    } else {
    	expenseServ.updateExpense(expense);
        return "redirect:/expenses";
    }
}
@DeleteMapping("/expense/{id}")
public String destroy(@PathVariable("id") Long id) {
	Expense expense = expenseServ.findExpense(id);
	expenseServ.destroyExp(expense);
    return "redirect:/expenses";
}



}
