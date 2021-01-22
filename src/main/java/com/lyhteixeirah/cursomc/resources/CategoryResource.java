package com.lyhteixeirah.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import com.lyhteixeirah.cursomc.entities.Category;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    
    @GetMapping
    public List<Category> listar() {

        Category category1 = new Category(1, "technology");
        Category category2 = new Category(2, "Bureau");
        
        List<Category> list = new ArrayList<>();
        list.add(category1);
        list.add(category2);
        
        return list;
    }
}
