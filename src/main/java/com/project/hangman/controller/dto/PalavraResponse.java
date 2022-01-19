package com.project.hangman.controller.dto;

import java.util.List;

import com.project.hangman.model.Dica;
import com.project.hangman.model.Palavra;

public class PalavraResponse {
	
	private String palavra;
	private String descricao;
	private List<Dica> dicas;
	private Integer tamanhoPalavra;
	
	public PalavraResponse() {}

	public PalavraResponse(Palavra response) {
		super();
		this.palavra = response.getPalavra();
		this.descricao = response.getDescricao();
		this.dicas = response.getDica();
		this.tamanhoPalavra = response.getTamanhoPalavra();
	}

	public String getPalavra() {
		return palavra;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Dica> getDicas() {
		return dicas;
	}

	public Integer getTamanhoPalavra() {
		return tamanhoPalavra;
	}
	
	

}
