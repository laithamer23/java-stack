package com.example.BurgerTracker.Repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BurgerTracker.Serv.BurgerTrackerServ;
import com.example.BurgerTracker.models.BurgerTraker;

@Repository
public interface BurgerRepo  extends CrudRepository<BurgerTraker, Long>  {
	 List<BurgerTraker> findAll();

	BurgerTraker save(BurgerTrackerServ burgertrackerServ);


}
