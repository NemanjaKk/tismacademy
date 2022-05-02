package group.tismacademy.controller;

import group.tismacademy.entity.Category;
import group.tismacademy.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return service.getCategories();
    }

    @PostMapping("/categories")
    public Category saveCategory(@RequestBody Category category){
        return service.saveCategory(category);
    }
}
