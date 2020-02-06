package com.dushdesh.receipeapp.repositories;

import com.dushdesh.receipeapp.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
