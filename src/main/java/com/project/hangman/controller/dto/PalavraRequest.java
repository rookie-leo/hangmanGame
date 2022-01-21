package com.project.hangman.controller.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.project.hangman.model.Palavra;

public class PalavraRequest {

	private @NotBlank @Min(1) String palavra;
	private @NotBlank @Min(1) String descricao;
	private @NotNull @Min(1) List<String> dicas;// = new ArrayList<String>();

	@Deprecated
	public PalavraRequest() {
	}

	public PalavraRequest(@NotBlank @Min(1) String palavra, @NotBlank @Min(1) String descricao, @NotNull List<String> dica) {
		this.palavra = palavra;
		this.descricao = descricao;
		setDica(dica);
	}

	public String getPalavra() {
		return palavra;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<String> getDica() {
		return dicas;
	}

	public void setDica(List<String> dicas) {
		for (String dica : dicas) {
			if (dica.equals(palavra)) {
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
