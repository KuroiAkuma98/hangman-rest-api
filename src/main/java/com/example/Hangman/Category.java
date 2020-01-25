package com.example.Hangman;

import javax.persistence.*;

@Entity
@Table(name ="categories")
public class Category {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long categoryId;
    @Column(name = "NAME")
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
