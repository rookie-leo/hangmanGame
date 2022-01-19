package com.project.hangman.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;

public class Dica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private @NotNull String dica;
	@ManyToOne
	private Palavra palavra;
	
	@Deprecated
	public Dica() {}
	
	public Dica(String dica, Palavra palavra) {
		this.dica = dica;
		this.palavra = palavra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

	public Palavra getPalavra() {
		return palavra;
	}

	public void setPalavra(Palavra palavra) {
		this.palavra = palavra;
	}

	@Override
	public String toString() {
		return "Dica [id=" + id + ", dica=" + dica + ", palavra=" + palavra + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dica == null) ? 0 : dica.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((palavra == null) ? 0 : palavra.hashCode());
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
		Dica other = (Dica) obj;
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
		return true;
	}
		
}
