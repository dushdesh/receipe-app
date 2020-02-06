package com.dushdesh.receipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "", "/index"})
    public String index_page() {
        System.out.println("Some message");
        return "index";
    }
}
