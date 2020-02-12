package com.dushdesh.receipeapp.services;

import com.dushdesh.receipeapp.models.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> findAll();
}
