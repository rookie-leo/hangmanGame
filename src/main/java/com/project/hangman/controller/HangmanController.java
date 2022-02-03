package com.project.hangman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hangman.service.HangmanService;

@RestController
@RequestMapping("/hangman")
public class HangmanController {

	@Autowired
	private HangmanService service;
	
	@GetMapping("/palavra")
	public char[] mostraPalavra() {
		return service.trabalhaPalavra();
	}
	
	public char[] recebeLetra(@RequestBody char letra) {
		//TODO implementar a logica que ira receber uma letra e verificar se palavra contem a letra digitada
	}
	
}
