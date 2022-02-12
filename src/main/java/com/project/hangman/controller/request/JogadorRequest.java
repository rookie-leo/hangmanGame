package com.project.hangman.controller.request;

public class JogadorRequest {
	
	private String nome;
	
	public JogadorRequest() {}
	
	public JogadorRequest(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
