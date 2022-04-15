package com.project.hangman.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hangman.controller.response.HangmanResponse;
import com.project.hangman.model.Hangman;
import com.project.hangman.model.Palavra;
import com.project.hangman.repository.HangmanRepository;

@Service
public class HangmanService {

	@Autowired
	private PalavraService pService;
	
	@Autowired
	private PartidaService partida;
	
	@Autowired
	private HangmanRepository repository;
	
	private Hangman hang = new Hangman();
	
	public Hangman findHangmanById(Long id) {
		Optional<Hangman> hangman = repository.findById(id);
		return hangman.get();
	}
	
	
	public HangmanResponse partida() {
		char[] palavra = escolhePalavra();
		hang.setHangMan(palavra.toString());
		char[] icognito = escondePalavra(palavra);
			
		partida.findPartida(hang);
		
		while (icognito != palavra) {
			
		}
	}
	
	/**
	 * @method escolhe uma palavra aleatoriamente no banco de dados e transforma ela em um array de caracteres
	 * @return retorna um array array de caracteres
	 * */
	public char[] escolhePalavra() {
		Palavra palavra = pService.escolherPalavra();
		char[] conjunto = pService.desmontarPalavra(palavra.getPalavra());
		
		return conjunto;
	}
	
	public char[] escondePalavra(char[] palavra) {
		char[] icognito = pService.escondePalavra(palavra);
		return icognito;
	}
	
	/**
	 * @method recebe uma letra, e dois vetores, um que é a palavra e o outro a palavra mascarada
	 * verifica se a palavra contem a letra inserida, e adiciona na palavra mascarada  
	 * */
	public void verificaPalavra(char letra, char[] palavra, char[] icognito) {
		//TODO implementar a logica que irá verificar se a palavra contem a letra digitada 
		int attempts = 0;
		int contains = 0;
		
		for (int i = 0; i < palavra.length; i++) {
			if (palavra[i] == letra) {
				icognito[i] = letra;
				contains++;
			}
		}
		
		attempts++;
		if (contains > 0) {
			hang.setCorrectLetter(true);
		} else {
			hang.setWrongAttempts(attempts);
		}
		
		hang.setMaxAttempts(attempts);			
	}

	
	/**
	 * @method verifica se a quantidade de tentativas erradas é igual a 6. Caso seja, o jogo termina,
	 *  caso o contrário, o jogo continua  
	 *  @return retorna uma resposta verdadeira para o caso do jogo terminar, e falso para o jogo continuar
	 * */
	public boolean gameOver() {
		if (hang.getWrongAttempts() == 6) {
			hang.setGameOver(true);
			hang.setMsg("Você perdeu!");
		} /*else if() {
			//TODO implementando a condição de vitoria
		}*/ else {
			hang.setGameOver(false);
		}
		return hang.getGameOver();
	}
	
}
