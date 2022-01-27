package com.project.hangman.controller.dto;

import com.project.hangman.model.Palavra;

public class PalavraResponse {

	private String palavra;
	private String dica;
	private Integer tamanhoPalavra;

	public PalavraResponse() {
	}

	public PalavraResponse(Palavra response) {
		super();
		this.palavra = response.getPalavra();
		this.dica = response.getDica();
		this.tamanhoPalavra = response.getTamanhoPalavra();
	}

	public String getPalavra() {
		return palavra;
	}
 
	public String getDica() {
		return dica;
	}

	public Integer getTamanhoPalavra() {
		return tamanhoPalavra;
	}

}
