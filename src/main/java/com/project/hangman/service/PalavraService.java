package com.project.hangman.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hangman.controller.dto.PalavraRequest;
import com.project.hangman.model.Palavra;
import com.project.hangman.repository.PalavraRepository;

@Service
public class PalavraService {
	
	@Autowired
	private PalavraRepository repository;
		
	@Transactional
	public void cadastrar(PalavraRequest request) {
		System.out.println(request.getDica());
		Palavra palavra = request.toModel();
		System.out.println(palavra.getDica());
		repository.save(palavra);	
	}
	
	public List<Palavra> listar() {
		return repository.findAll();
	}

}
