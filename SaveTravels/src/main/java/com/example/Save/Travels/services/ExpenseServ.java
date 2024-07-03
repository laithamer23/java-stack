package com.example.Save.Travels.services;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.Save.Travels.models.Expense;
import com.example.Save.Travels.repos.ExpenseRepo;

import jakarta.validation.Valid;

@Service
public class ExpenseServ {
	   private final ExpenseRepo expenseRepo;
	private Optional<Expense> optionalExpense;
	    
	    public ExpenseServ(ExpenseRepo expenseRepo) {
	        this.expenseRepo = expenseRepo;
	    }
	    // returns all the books
	    public List<Expense> allExpense() {
	        return expenseRepo.findAll();
	    }
	    // creates a book
	    public Expense createexpense(Expense b) {
	        return expenseRepo.save(b);
	    }
	    // retrieves a book
	    public Expense findExpense(Long id) {
	        Optional<Expense> optionalExpense = expenseRepo.findById(id);
	        if(optionalExpense.isPresent()) {
	            return optionalExpense.get();
	        } else {
	            return null;
	        }
	    }
		public Expense updateExpense(@Valid Expense expense) {
			// TODO Auto-generated method stub
			  return expenseRepo.save(expense);
			
		}
		public void destroyExp(Expense expense) {
			expenseRepo.delete(expense);
		}
}
