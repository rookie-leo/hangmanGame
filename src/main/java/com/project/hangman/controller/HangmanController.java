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
		
	public ResponseEntity<?> match(Character letra) {
		service.partida();
		
	}
		
}
