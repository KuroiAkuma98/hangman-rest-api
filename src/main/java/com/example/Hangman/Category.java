package com.example.Hangman;

import javax.persistence.*;

@Entity
@Table(name ="categories")
public class Category {

    private Long categoryId;
    private String name;

    Category(Long id,String name)
    {
        this.categoryId = id;
        this.name = name;
    }
    Category(){}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public Long getId() {
        return categoryId;
    }

    public void setId(Long id) {
        this.categoryId = id;
    }
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
