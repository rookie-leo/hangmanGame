package com.project.hangman.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Partida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Hangman hangman;
		
	public Partida() {
		super();
	}

	public Partida(Long id, Hangman hangman) {
		super();
		this.id = id;
		this.hangman = hangman;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Hangman getHangman() {
		return hangman;
	}

	public void setHangman(Hangman hangman) {
		this.hangman = hangman;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hangman == null) ? 0 : hangman.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Partida other = (Partida) obj;
		if (hangman == null) {
			if (other.hangman != null)
				return false;
		} else if (!hangman.equals(other.hangman))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Partida [id=");
		builder.append(id);
		builder.append(", hangman=");
		builder.append(hangman);
		builder.append("]");
		return builder.toString();
	}

		
}
