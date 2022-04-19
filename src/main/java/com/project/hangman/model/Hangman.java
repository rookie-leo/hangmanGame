package com.project.hangman.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Hangman {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String result;
	private String hangMan;
	private Integer maxAttempts;
	private Integer wrongAttempts;
	private Boolean correctLetter;
	private Boolean gameOver;
	@ElementCollection
	private Set<Character> listAttempt;
	private String msg;
	@OneToOne(cascade = CascadeType.ALL)
	private Partida partida;
	
	public Hangman() {}

	public Hangman(Long id, String result, String hangMan, Integer maxAttempts, Integer wrongAttempts,
			Boolean correctLetter, Boolean gameOver, Set<Character> listAttempt, String msg, Partida partida) {
		super();
		this.id = id;
		this.result = result;
		this.hangMan = hangMan;
		this.maxAttempts = maxAttempts;
		this.wrongAttempts = wrongAttempts;
		this.correctLetter = correctLetter;
		this.gameOver = gameOver;
		this.listAttempt = listAttempt;
		this.msg = msg;
		this.partida = partida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getHangMan() {
		return hangMan;
	}

	public void setHangMan(String hangMan) {
		this.hangMan = hangMan;
	}

	public Integer getMaxAttempts() {
		return maxAttempts;
	}

	public void setMaxAttempts(Integer maxAttempts) {
		this.maxAttempts = maxAttempts;
	}

	public Integer getWrongAttempts() {
		return wrongAttempts;
	}

	public void setWrongAttempts(Integer wrongAttempts) {
		this.wrongAttempts = wrongAttempts;
	}

	public Boolean getCorrectLetter() {
		return correctLetter;
	}

	public void setCorrectLetter(Boolean correctLetter) {
		this.correctLetter = correctLetter;
	}

	public Boolean getGameOver() {
		return gameOver;
	}

	public void setGameOver(Boolean gameOver) {
		this.gameOver = gameOver;
	}

	public Set<Character> getListAttempt() {
		return listAttempt;
	}

	public void setListAttempt(Set<Character> listAttempt) {
		this.listAttempt = listAttempt;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Partida getPartida() {
		return partida;
	}
	
	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hangman [id=");
		builder.append(id);
		builder.append(", result=");
		builder.append(result);
		builder.append(", hangMan=");
		builder.append(hangMan);
		builder.append(", maxAttempts=");
		builder.append(maxAttempts);
		builder.append(", wrongAttempts=");
		builder.append(wrongAttempts);
		builder.append(", correctLetter=");
		builder.append(correctLetter);
		builder.append(", gameOver=");
		builder.append(gameOver);
		builder.append(", listAttempt=");
		builder.append(listAttempt);
		builder.append(", msg=");
		builder.append(msg);
		builder.append(", partida=");
		builder.append(partida);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correctLetter == null) ? 0 : correctLetter.hashCode());
		result = prime * result + ((gameOver == null) ? 0 : gameOver.hashCode());
		result = prime * result + ((hangMan == null) ? 0 : hangMan.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((listAttempt == null) ? 0 : listAttempt.hashCode());
		result = prime * result + ((maxAttempts == null) ? 0 : maxAttempts.hashCode());
		result = prime * result + ((msg == null) ? 0 : msg.hashCode());
		result = prime * result + ((partida == null) ? 0 : partida.hashCode());
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		result = prime * result + ((wrongAttempts == null) ? 0 : wrongAttempts.hashCode());
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
		Hangman other = (Hangman) obj;
		if (correctLetter == null) {
			if (other.correctLetter != null)
				return false;
		} else if (!correctLetter.equals(other.correctLetter))
			return false;
		if (gameOver == null) {
			if (other.gameOver != null)
				return false;
		} else if (!gameOver.equals(other.gameOver))
			return false;
		if (hangMan == null) {
			if (other.hangMan != null)
				return false;
		} else if (!hangMan.equals(other.hangMan))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listAttempt == null) {
			if (other.listAttempt != null)
				return false;
		} else if (!listAttempt.equals(other.listAttempt))
			return false;
		if (maxAttempts == null) {
			if (other.maxAttempts != null)
				return false;
		} else if (!maxAttempts.equals(other.maxAttempts))
			return false;
		if (msg == null) {
			if (other.msg != null)
				return false;
		} else if (!msg.equals(other.msg))
			return false;
		if (partida == null) {
			if (other.partida != null)
				return false;
		} else if (!partida.equals(other.partida))
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		if (wrongAttempts == null) {
			if (other.wrongAttempts != null)
				return false;
		} else if (!wrongAttempts.equals(other.wrongAttempts))
			return false;
		return true;
	}

		
}
