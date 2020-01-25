package com.example.Hangman;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuessWordRepository extends JpaRepository<GuessWord,Long> {
}
