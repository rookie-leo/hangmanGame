package com.project.hangman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hangman.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long>{

	Jogador findByNome(String nome);

}
