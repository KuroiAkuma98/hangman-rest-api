package com.example.Hangman;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="categories")
public class Category {
    @Id
    @GeneratedValue
    private Long categoryId;
    private String name;

    Category(Long id,String name)
    {
        this.categoryId = id;
        this.name = name;
    }

    public Long getId() {
        return categoryId;
    }

    public void setId(Long id) {
        this.categoryId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
