package com.example.Hangman;

import org.hibernate.cfg.CreateKeySecondPass;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
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
    public ResponseEntity create(@RequestBody Map<String,String> body)
    {
        System.out.println(body.get("categoryId"));
        System.out.println(body.get("name"));
        Long id = Integer.toUnsignedLong(Integer.parseInt(body.get("categoryId")));
        String categoryName = body.get("name");
        Category category = new Category(id,categoryName);
        return ResponseEntity.ok().body(categoryService.save(category));
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
