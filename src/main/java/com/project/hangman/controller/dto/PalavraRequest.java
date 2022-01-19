package com.project.hangman.controller.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.project.hangman.model.Dica;
import com.project.hangman.model.Palavra;

public class PalavraRequest {

	private @NotBlank @Min(1) String palavra;
	private @NotBlank @Min(1) String descricao;
	private @NotBlank @Min(1) List<Dica> dicas = new ArrayList<Dica>();

	@Deprecated
	public PalavraRequest() {
	}

	public PalavraRequest(@NotBlank @Min(1) String palavra, @NotBlank @Min(1) String descricao) {
		this.palavra = palavra;
		this.descricao = descricao;
	}

	public String getPalavra() {
		return palavra;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Dica> getDica() {
		return dicas;
	}

	public void setDica(List<Dica> dicas) {
		for (Dica dica : dicas) {
			if (dica.getDica().equals(palavra)) {
				throw new IllegalArgumentException("A palavra não pode ser a dica!");
			} else {
				this.dicas.add(dica);
			}
		}
	}

	public Palavra toModel() {
		return new Palavra(palavra, descricao, dicas);
	}

}
