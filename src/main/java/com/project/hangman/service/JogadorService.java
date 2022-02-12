package com.project.hangman.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hangman.controller.request.JogadorRequest;
import com.project.hangman.controller.response.JogadorResponse;
import com.project.hangman.model.Jogador;
import com.project.hangman.repository.JogadorRepository;

@Service
public class JogadorService {

	@Autowired
	private JogadorRepository repository;
	
	public void cadastrar(JogadorRequest request) {
		Jogador jogador = request.toModel();
		repository.save(jogador);
	}
	
	public List<JogadorResponse> listar() {
		List<Jogador> jogadores = repository.findAll();
		List<JogadorResponse> response = jogadores.stream()
				.map(j -> new JogadorResponse(j))
				.collect(Collectors.toList());
		return response;
	}
	
	public Jogador buscar(Long id) {
		Jogador jogador = repository.findById(id).get();
		return jogador;
	}
	
	public Jogador buscarPorNome(String nome) {
		Jogador jogador = repository.findByNome(nome); 
		return jogador;
	}
	
}
