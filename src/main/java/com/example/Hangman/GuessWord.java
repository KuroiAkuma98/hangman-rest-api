package com.example.Hangman;

import javax.persistence.*;

@Entity
@Table(name = "geusswords")
public class GuessWord {


    private Long wordId;
    private String word;
    private String categoryName;

    GuessWord(Long id, String word, String categoryName)
    {
        this.wordId = id;
        this.word = word;
        this.categoryName = categoryName;
    }
    GuessWord(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return wordId;
    }
    public void setId(Long id) {
        this.wordId = id;
    }
    @Column(name = "WORD")
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    @Column(name = "CATEGORY")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }





}
