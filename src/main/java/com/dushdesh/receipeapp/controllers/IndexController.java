package com.dushdesh.receipeapp.controllers;

import com.dushdesh.receipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    private final RecipeService recipeService;

    @Autowired
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/", "", "/index"})
    public String index_page(Model model) {
        log.debug("In the Index Page");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
