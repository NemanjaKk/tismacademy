package group.tismacademy.service;

import group.tismacademy.entity.Category;
import group.tismacademy.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public Category saveCategory(Category category){
        return repository.save(category);
    }

    public List<Category> getCategories(){
        return repository.findAll();
    }

    public boolean deleteCategory(int id){
        repository.deleteById(id);
        return true;
    }
}
