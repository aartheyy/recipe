package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Ingredient;
import com.example.demo.entities.Recipe;


public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
	
	List<Recipe> findAllByName(String name);

	void save(Recipe recipe); 
}
