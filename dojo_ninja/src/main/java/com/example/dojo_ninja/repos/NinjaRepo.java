package com.example.dojo_ninja.repos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.dojo_ninja.models.NinjaModels;



@Repository
public interface NinjaRepo extends CrudRepository<NinjaModels, Long>{
	 List<NinjaModels> findAll();

}
