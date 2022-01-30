package com.project.hangman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hangman.model.Palavra;

@Service
public class PartidaService {

	@Autowired
	private PalavraService pService;
	
	public void partida(List<Jogador> jogadores) {
		Palavra palavra = pService.escolherPalavra();
		char[] conjunto = pService.desmontarPalavra(palavra.getPalavra());
		
		
		
		while (true) {
			for (int rodada = 0; jogadores.size(); rodada++) {
			}
		}
	}
	
}
