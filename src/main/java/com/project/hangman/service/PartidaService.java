package com.project.hangman.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hangman.model.Hangman;
import com.project.hangman.model.Partida;
import com.project.hangman.repository.PartidaRepository;

@Service
public class PartidaService {

	@Autowired
	private PartidaRepository repository;

	/**
	 * Já que o método findPartida() também pode criar uma nova partida, não será necessário utilizar esse
	 * metodo fora dessa classe 
	 */
	@Transactional
	private Partida startPartida() {
		Partida partida = new Partida();
		repository.save(partida);
		return partida;
	}

	public Partida findPartida(Hangman hangmanId) {
		Optional<Partida> partida = repository.findById(hangmanId.getId());
		if (partida.isEmpty()) {
			Partida novaPartida = startPartida();
			novaPartida.setId(hangmanId.getId());
			return novaPartida;
		}

		return partida.get();
	}

}
