package com.project.hangman.controller.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.project.hangman.model.Palavra;

public class PalavraRequest {

	
	private @NotBlank @Min(1) String palavra;
	private @NotBlank @Min(1) String descricao;
	private @NotBlank @Min(1) String dica;
	
	@Deprecated
	public PalavraRequest() {
	}
	
	public PalavraRequest(@NotBlank @Min(1) String palavra, @NotBlank @Min(1) String descricao,
			@NotBlank @Min(1) String dica) {
		this.palavra = palavra;
		this.descricao = descricao;
		this.dica = dica;
	}

	public String getPalavra() {
		return palavra;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public String getDica() {
		return dica;
	}
	
	public Palavra toModel() {
		return new Palavra(palavra, descricao, dica);
	}
	
	
}
