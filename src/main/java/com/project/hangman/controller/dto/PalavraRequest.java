package com.project.hangman.controller.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.project.hangman.model.Palavra;

public class PalavraRequest {

	private @NotBlank @Min(1) String palavra;
	private @NotBlank @Min(1) String dica;

	@Deprecated
	public PalavraRequest() {
	}

	public PalavraRequest(@NotBlank @Min(1) String palavra, @NotBlank @Min(1) String dica) {
		this.palavra = palavra;
		setDica(dica);
//		this.dica = dica;
	}

	public String getPalavra() {
		return palavra;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		if (dica.equals(palavra)) {
			throw new IllegalArgumentException("A palavra não pode ser a dica!");
		} else {
			this.dica = dica;
		}

	}

	public Palavra toModel() {
		return new Palavra(palavra, dica);
	}

}
