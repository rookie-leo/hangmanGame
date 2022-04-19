package com.project.hangman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hangman.service.HangmanService;
import com.project.hangman.service.JogadorService;

@RestController
@RequestMapping("/hangman")
public class HangmanController {

	@Autowired
	private HangmanService service;
	
	@Autowired
	private JogadorService jService;
		
	public ResponseEntity<?> start(){
		service.iniciar();
		return ResponseEntity.status(200).build();
	}
	
	public ResponseEntity<?> match(Character letra) {
		service.partida();
		
	}
		
}
