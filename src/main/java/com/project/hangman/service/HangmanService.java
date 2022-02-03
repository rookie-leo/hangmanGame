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

		
//		
//		while (true) {
//			for (int rodada = 0; jogadores.size(); rodada++) {
//			}
//		}
	}
	
	/**
	 * @method escolhe uma palavra aleatoriamente no banco de dados e transforma ela em um array de caracteres '_'
	 * @return retorna um array array de caracteres '_'
	 * */
	public char[] trabalhaPalavra() {
		Palavra palavra = pService.escolherPalavra();
		char[] conjunto = pService.desmontarPalavra(palavra.getPalavra());
		char[] icognito = pService.escondePalavra(conjunto);
		
		return icognito;
	}
	
	public void verificaPalavra(char letra) {
		//TODO implementar a logica que irá verificar se a palavra contem a letra digitada 
	}
}
