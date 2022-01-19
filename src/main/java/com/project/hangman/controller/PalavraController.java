package com.project.hangman.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hangman.controller.dto.PalavraRequest;
import com.project.hangman.controller.dto.PalavraResponse;
import com.project.hangman.model.Palavra;
import com.project.hangman.service.PalavraService;

@RestController
@RequestMapping("/palavras")
public class PalavraController {
	
	@Autowired
	private PalavraService service;	
	
	@PostMapping("/cadastrar")
	public ResponseEntity<String> cadastrar(@RequestBody @Valid PalavraRequest request) {
		service.cadastrar(request);		
		return ResponseEntity.ok().body("ok"); 
	}
	
	@GetMapping("/listar")
	public List<PalavraResponse> listar() {
		List<Palavra> palavras = service.listar();
		List<PalavraResponse> dtos = palavras.stream()
				.map(dto -> new PalavraResponse(dto)).collect(Collectors.toList());
		
		return dtos;
	}

}
