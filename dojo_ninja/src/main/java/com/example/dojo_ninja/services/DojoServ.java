package com.example.dojo_ninja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.dojo_ninja.models.Dojo;
import com.example.dojo_ninja.repos.DojoRepo;
@Service
public class DojoServ {
	 private final DojoRepo dojorepo;
	 
	   public DojoServ(DojoRepo dojorepo) {
	        this.dojorepo = dojorepo;
	    }
	  
	    public List<Dojo> alldojos() {
	        return dojorepo.findAll();
	    }
	
	    public Dojo createDojo(Dojo a) {
	        return dojorepo.save(a);
	    }
	   
	    public Dojo findDojo(Long id) {
	        Optional<Dojo> optionalDojo = dojorepo.findById(id);
	        if(optionalDojo.isPresent()) {
	            return optionalDojo.get();
	        } else {
	            return null;
	        }
	    }

		public DojoRepo getDojoarepo() {
			return dojorepo;
		}
}
