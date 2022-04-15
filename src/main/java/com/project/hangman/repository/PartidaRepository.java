package com.project.hangman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.hangman.model.Partida;

public interface PartidaRepository extends JpaRepository<Partida, Long>{

}
