package com.project.hangman.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hangman.controller.request.JogadorRequest;
import com.project.hangman.model.Jogador;
import com.project.hangman.service.HangmanService;
import com.project.hangman.service.JogadorService;

@RestController
@RequestMapping("/hangman")
public class HangmanController {

	@Autowired
	private HangmanService service;
	
	@Autowired
	private JogadorService jService;
	
	@GetMapping("/palavra")
	public char[] mostraPalavra() {
		return service.trabalhaPalavra();
	}
	
//	public char[] recebeLetra(@RequestBody Character letra) {
//		//TODO implementar a logica que ira receber uma letra e verificar se palavra contem a letra digitada
//	}
	
	public ResponseEntity<?> jogo(@Valid @RequestBody JogadorRequest request) {
		Jogador jogador = jService.buscarPorNome(request.getNome());
	}
	
}
