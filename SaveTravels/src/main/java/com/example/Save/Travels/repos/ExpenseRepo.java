package com.example.Save.Travels.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.yaml.snakeyaml.events.Event.ID;

import com.example.Save.Travels.models.Expense;

@Repository
public interface ExpenseRepo extends CrudRepository<Expense, Long> {
	 List<Expense> findAll();

}
