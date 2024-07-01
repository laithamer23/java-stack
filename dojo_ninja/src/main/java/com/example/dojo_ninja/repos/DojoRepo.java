package com.example.dojo_ninja.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dojo_ninja.models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long>{
	 List<Dojo> findAll();

}
