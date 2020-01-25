package com.example.Hangman;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "geusswords")
public class GuessWord {

    @Id
    @GeneratedValue
    private Long wordId;
    private String word;
    private String categoryName;

    GuessWord(Long id, String word, String categoryName)
    {
        this.wordId = id;
        this.word = word;
        this.categoryName = categoryName;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setId(Long id) {
        this.wordId = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getWord() {
        return word;
    }

    public Long getId() {
        return wordId;
    }
}
