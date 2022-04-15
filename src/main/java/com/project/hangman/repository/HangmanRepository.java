package com.project.hangman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hangman.model.Hangman;

public interface HangmanRepository extends JpaRepository<Hangman, Long>{

}
