package com.project.hangman.controller.response;

import com.project.hangman.model.Jogador;

public class JogadorResponse {

	private String nome;
	
	public JogadorResponse() {}
	
	public JogadorResponse(Jogador jogador) {
		this.nome = jogador.getNome();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
