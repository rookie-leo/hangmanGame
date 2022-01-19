package com.project.hangman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hangman.controller.dto.PalavraRequest;
import com.project.hangman.model.Palavra;
import com.project.hangman.repository.PalavraRepository;

@Service
public class PalavraService {
	
	@Autowired
	private PalavraRepository repository;
	
	public void cadastrar(PalavraRequest request) {
		Palavra palavra = request.toModel();
		repository.save(palavra);
	}
	
	public List<Palavra> listar() {
		return repository.findAll();
	}

}
