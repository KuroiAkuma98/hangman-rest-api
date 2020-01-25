package com.example.Hangman;

public class GameStatus {
    private String categoryName;
    private int numberOfLives;
    private String wordStatus;
    private String usedLetters;

    GameStatus(String categoryName, int numberOfLives, String wordStatus, String usedLetters)
    {
        this.categoryName = categoryName;
        this.numberOfLives = numberOfLives;
        this.wordStatus = wordStatus;
        this.usedLetters = usedLetters;
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

    @Override
    public String toString() {
        return "GameStatus: \n" +
                "categoryName=" + categoryName + "\n" +
                "numberOfLives=" + numberOfLives + "/10 \n" +
                "wordStatus=" + wordStatus + "\n" +
                "usedLetters=" + usedLetters + "\n" ;
    }
}
