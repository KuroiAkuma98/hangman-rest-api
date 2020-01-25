package com.example.Hangman;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    private Long gameId;
    private String categoryName;
    private int numberOfLives;
    private String wordStatus;
    private String usedLetters;
    private String wordToGuess;
    Game(){}
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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    @Column(name = "NUMBER_OF_LIVES")
    public int getNumberOfLives() {
        return numberOfLives;
    }
    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }
    @Column(name = "CATEGORY")
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    @Column(name = "USED_LETTERS")
    public String getUsedLetters() {
        return usedLetters;
    }
    public void setUsedLetters(String usedLetters) {
        this.usedLetters = usedLetters;
    }
    @Column(name = "WORD_STATUS")
    public String getWordStatus() {
        return wordStatus;
    }
    public void setWordStatus(String wordStatus) {
        this.wordStatus = wordStatus;
    }
    @Column(name = "WORD_TO_GUESS")
    public String getWordToGuess() {
        return wordToGuess;
    }

    public void setWordToGuess(String wordToGuess) {
        this.wordToGuess = wordToGuess;
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
