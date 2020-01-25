package com.example.Hangman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    CategoryRepository categoryRepository;
    @Autowired
    CategoryService(CategoryRepository categoryRepository)
    {
        this.categoryRepository = categoryRepository;
    }
    // get by id
    public Optional<Category> findById(Long Id)
    {
        return categoryRepository.findById(Id);
    }
    // get all
    public List<Category> findAll()
    {
        return categoryRepository.findAll();
    }
    // post
    public  Category save(Category category)
    {
        return categoryRepository.save(category);
    }
    // delete by id
    public void deleteById(Long Id)
    {
        categoryRepository.deleteById(Id);
    }



}
