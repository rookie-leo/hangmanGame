package com.project.hangman.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Palavra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private @NotBlank @Min(1) String palavra;
	private @NotBlank @Min(1) String descricao;
	
//	@OneToMany(mappedBy = "dica")
	@ElementCollection
	private @NotBlank @Min(1) List<String> dicas = new ArrayList<String>();
	
	private @NotNull Integer tamanhoPalavra;
	
	public Palavra() {}
	
	public Palavra(@NotBlank @Min(1) String palavra, @NotBlank @Min(1) String descricao, @NotNull List<String> dica) {
		this.palavra = palavra;
		this.descricao = descricao;
		this.dicas.addAll(dicas);
		this.tamanhoPalavra = palavra.length();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@ElementCollection
	public List<String> getDica() {
		return dicas;
	}

	public void setDica(List<String> dicas) {
		this.dicas.addAll(dicas);
	}

	public Integer getTamanhoPalavra() {
		return tamanhoPalavra;
	}

	public void setTamanhoPalavra(Integer tamanhoPalavra) {
		this.tamanhoPalavra = tamanhoPalavra;
	}

	@Override
	public String toString() {
		return "Palavra [id=" + id + ", palavra=" + palavra + ", descricao=" + descricao + ", dica=" + dicas
				+ ", tamanhoPalavra=" + tamanhoPalavra + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((dicas == null) ? 0 : dicas.hashCode());
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
		if (dicas == null) {
			if (other.dicas != null)
				return false;
		} else if (!dicas.equals(other.dicas))
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
