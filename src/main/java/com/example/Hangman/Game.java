package com.example.Hangman;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue
    private Long gameId;
    private String categoryName;
    private int numberOfLives;
    private String wordStatus;
    private String usedLetters;
    private String wordToGuess;

    Game(Long id,String categoryName,String wordToGuess)
    {
        this.gameId = id;
        this.categoryName = categoryName;
        this.numberOfLives = 10;
        this.wordToGuess = wordToGuess;
        this.wordStatus = hideWord(wordToGuess);
        this.usedLetters = "";

    }
    //get
    public int getNumberOfLives() {
        return numberOfLives;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public String getUsedLetters() {
        return usedLetters;
    }
    public String getWordStatus() {
        return wordStatus;
    }
    //set

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public void setUsedLetters(String usedLetters) {
        this.usedLetters = usedLetters;
    }

    public void setWordStatus(String wordStatus) {
        this.wordStatus = wordStatus;
    }

    public String hideWord(String wordToGuess){
        String tmpWord = "";
        for(int i = 0; i < wordToGuess.length();i++)
        {
            if(wordToGuess.charAt(i) == ' ') tmpWord += " ";
            else tmpWord += wordToGuess.charAt(i);
        }
        return tmpWord;
    }

    @Override
    public String toString() {
        return "GameStatus: \n" +
                "categoryName=" + categoryName + "\n" +
                "numberOfLives=" + numberOfLives + "/10 \n" +
                "wordStatus=" + wordStatus + "\n" +
                "usedLetters=" + usedLetters + "\n" ;
    }

}
