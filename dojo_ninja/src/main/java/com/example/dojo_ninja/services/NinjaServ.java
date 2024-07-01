package com.example.dojo_ninja.services;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.dojo_ninja.models.NinjaModels;
import com.example.dojo_ninja.repos.NinjaRepo;

@Service
public class NinjaServ {
	 private final NinjaRepo ninjarepo;
	    
	    public NinjaServ(NinjaRepo ninjarepo) {
	        this.ninjarepo = ninjarepo;
	    }
	    // returns all the books
	    public List<NinjaModels> allninjas() {
	        return ninjarepo.findAll();
	    }
	    // creates a book
	    public NinjaModels createNinja(NinjaModels b) {
	        return ninjarepo.save(b);
	    }
	    // retrieves a book
	    public NinjaModels findNinja(Long id) {
	        Optional<NinjaModels> optionalNinja = ninjarepo.findById(id);
	        if(optionalNinja.isPresent()) {
	            return optionalNinja.get();
	        } else {
	            return null;
	        }
	    }

}
