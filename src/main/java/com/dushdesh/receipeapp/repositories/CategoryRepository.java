package com.dushdesh.receipeapp.repositories;

import com.dushdesh.receipeapp.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
