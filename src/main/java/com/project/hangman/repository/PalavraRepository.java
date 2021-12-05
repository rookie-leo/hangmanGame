package com.project.hangman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hangman.model.Palavra;

public interface PalavraRepository extends JpaRepository<Palavra, Long> {
	
}
