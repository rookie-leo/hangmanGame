package com.project.hangman.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.hangman.controller.dto.PalavraRequest;
import com.project.hangman.model.Palavra;
import com.project.hangman.repository.PalavraRepository;

@RestController
public class PalavraController {
	
	private PalavraRepository repository;
	
	public ResponseEntity<String> cadastrar(@RequestBody @Valid PalavraRequest request) {
		Palavra palavra = request.toModel();
		repository.save(palavra);
		
		return ResponseEntity.ok().body("ok"); // TODO quando o front-end da aplicação for desenvolvido, transferir o usuario para o dash board do usuario
	}

}
