package com.example.Hangman;

import org.hibernate.cfg.CreateKeySecondPass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hangman")
public class HangmanController {
    private CategoryService categoryService;

    // Mapping for Categories

    @GetMapping("/category")
    // get all
    public ResponseEntity<List<Category>> findAll()
    {
        return ResponseEntity.ok(categoryService.findAll());
    }

    @GetMapping("/category/{id}")
    // get by id
    public ResponseEntity<Category> findById(@PathVariable Long Id)
    {
        Optional<Category> category = categoryService.findById(Id);
        if (!category.isPresent()) {
            //log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(category.get());
    }

    @PostMapping("/category")
    public ResponseEntity create(@Valid @RequestBody Category category)
    {
        return ResponseEntity.ok(categoryService.save(category));
    }

    @PutMapping("/category/{id}")
    public ResponseEntity<Category> update(@PathVariable Long Id, @Valid @RequestBody Category category) {
        if (!categoryService.findById(Id).isPresent()) {
            //log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(categoryService.save(category));
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity delete(@PathVariable Long Id)
    {
        if(!categoryService.findById(Id).isPresent())
        {
            //log.error("Id " + id + " is not existed");
            ResponseEntity.badRequest().build();
        }
        categoryService.deleteById(Id);

        return ResponseEntity.ok().build();
    }




}
