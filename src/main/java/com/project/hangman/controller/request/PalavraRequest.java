package com.project.hangman.controller.request;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.project.hangman.model.Palavra;

public class PalavraRequest {

	private @NotBlank @Min(1) String palavra;
	private @NotNull List<String> dicas;

	public PalavraRequest() {
	}

	public PalavraRequest(@NotBlank @Min(1) String palavra, @NotNull @Min(1) List<String> dicas) {
		this.palavra = palavra;
		this.dicas = dicas;
	}

	public String getPalavra() {
		return palavra;
	}
	
	public List<String> getDicas() {
		return dicas;
	}

	public void setDicas(List<String> dicas) {
		this.dicas = dicas;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public Palavra toModel() {
		return new Palavra(palavra, dicas);
	}

}
