package com.example.BurgerTracker.Serv;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BurgerTracker.Repo.BurgerRepo;
import com.example.BurgerTracker.models.BurgerTraker;

import jakarta.validation.Valid;

@Service
public class BurgerTrackerServ {
	@Autowired
	BurgerRepo burgerrepo;

	public List<BurgerTraker> allBurgers() {
		return burgerrepo.findAll();
	}

	public BurgerTraker createBurgerTraker(BurgerTraker burgertracker) {
		return burgerrepo.save(burgertracker);
	}
	
	  public BurgerTraker findBurgerTraker(Long id) {
	        Optional<BurgerTraker> optionalBurgerTraker = burgerrepo.findById(id);
	        if(optionalBurgerTraker.isPresent()) {
	            return optionalBurgerTraker.get();
	        } else {
	            return null;
	        }}
	  
	        
	        public BurgerTraker updateBurgerTraker(@Valid BurgerTraker burgertraker) {
				// TODO Auto-generated method stub
				  return burgerrepo.save(burgertraker);
				
			}
		
	  
}
