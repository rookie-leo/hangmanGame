package com.project.hangman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hangman.model.Jogador;
import com.project.hangman.model.Palavra;

@Service
public class HangmanService {

	@Autowired
	private PalavraService pService;
	
	public void partida(List<Jogador> jogadores) {
		//TODO esse método ficara encarregado de guardar os jogadores que estão na partida, e também a palavra
		char[] palavra = escolhePalavra();
		char[] icognito = escondePalavra(palavra);
			
		while (icognito != palavra) {
			for (int rodada = 0; jogadores.size() == rodada; rodada++) {
				jogadores.get(rodada);
			}
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
	
	public void verificaPalavra() {
		//TODO implementar a logica que irá verificar se a palavra contem a letra digitada 
	}
	
	public void recebeLetra(Character letra) {
		
	}
	
}
