package com.project.hangman.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

@Entity
public class Palavra {
	
	@Id
	private Long id;
	private @NotBlank @Min(1) String palavra;
	private @NotBlank @Min(1) String descricao;
	private @NotBlank @Min(1) String dica;
	private @NotNull Integer tamanhoPalavra;
	
	public Palavra(@NotBlank @Min(1) String palavra, @NotBlank @Min(1) String descricao, @NotBlank @Min(1) String dica) {
		super();
		this.palavra = palavra;
		this.descricao = descricao;
		this.dica = dica;
		this.tamanhoPalavra = palavra.length();
	}

	@Override
	public String toString() {
		return "Palavra [id=" + id + ", palavra=" + palavra + ", descricao=" + descricao + ", dica=" + dica
				+ ", tamanhoPalavra=" + tamanhoPalavra + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((dica == null) ? 0 : dica.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((palavra == null) ? 0 : palavra.hashCode());
		result = prime * result + ((tamanhoPalavra == null) ? 0 : tamanhoPalavra.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palavra other = (Palavra) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (dica == null) {
			if (other.dica != null)
				return false;
		} else if (!dica.equals(other.dica))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (palavra == null) {
			if (other.palavra != null)
				return false;
		} else if (!palavra.equals(other.palavra))
			return false;
		if (tamanhoPalavra == null) {
			if (other.tamanhoPalavra != null)
				return false;
		} else if (!tamanhoPalavra.equals(other.tamanhoPalavra))
			return false;
		return true;
	}

}
