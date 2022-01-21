package com.project.hangman.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.project.hangman.model.Palavra;

public class PalavraResponse {
	
	private String palavra;
	private String descricao;
	private List<String> dicas = new ArrayList<String>();
	private Integer tamanhoPalavra;
	
	public PalavraResponse() {}

	public PalavraResponse(Palavra response) {
		super();
		this.palavra = response.getPalavra();
		this.descricao = response.getDescricao();
		this.dicas.addAll(response.getDica());
		this.tamanhoPalavra = response.getTamanhoPalavra();
	}

	public String getPalavra() {
		return palavra;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<String> getDicas() {
		return dicas;
	}

	public Integer getTamanhoPalavra() {
		return tamanhoPalavra;
	}
	
	

}
