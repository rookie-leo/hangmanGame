package com.project.hangman.controller.response;

import java.util.Set;

import com.project.hangman.model.Hangman;

public class HangmanResponse {

	private String hangMan;
	private Integer maxAttempts;
	private Integer wrongAttempts;
	private Boolean correctLetter;
	private Boolean gameOver;
	private Set<Character> listAttempt;
	
	public HangmanResponse(Hangman hang) {
		this.hangMan = hang.getHangMan();
		this.maxAttempts = hang.getMaxAttempts();
		this.wrongAttempts = hang.getWrongAttempts();
		this.correctLetter = hang.getCorrectLetter();
		this.listAttempt = hang.getListAttempt();
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
	
}
