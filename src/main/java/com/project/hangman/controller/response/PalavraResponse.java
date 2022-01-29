package com.project.hangman.controller.response;

import java.util.List;

import com.project.hangman.model.Palavra;

public class PalavraResponse {
	
	private String palavra;
	private Integer tamanhoPalavra;
	private List<String> dicas;
	
	public PalavraResponse() {}

	public PalavraResponse(Palavra response) {
		super();
		this.palavra = response.getPalavra();
		this.dicas = response.getDicas();
		this.tamanhoPalavra = response.getTamanhoPalavra();
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public List<String> getDicas() {
		return dicas;
	}

	public void setDicas(List<String> dicas) {
		this.dicas = dicas;
	}

	public Integer getTamanhoPalavra() {
		return tamanhoPalavra;
	}

	public void setTamanhoPalavra(Integer tamanhoPalavra) {
		this.tamanhoPalavra = tamanhoPalavra;
	}

}
