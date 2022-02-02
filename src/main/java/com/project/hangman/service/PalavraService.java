package com.project.hangman.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hangman.controller.request.PalavraRequest;
import com.project.hangman.model.Palavra;
import com.project.hangman.repository.PalavraRepository;

@Service
public class PalavraService {

	@Autowired
	private PalavraRepository repository;

	@Transactional
	public void cadastrar(PalavraRequest request) {
		Palavra palavra = request.toModel();
		repository.save(palavra);
	}

	public List<Palavra> listar() {
		return repository.findAll();
	}

	/**
	 * @method escolhe uma palavra aleatoriamente na tabela de palavras cadastradas
	 * @return retorna uma palavra
	 */
	public Palavra escolherPalavra() {
		List<Palavra> palavras = listar();
		Double random = Math.random();
		int escolhido = (int) (1 + random * (palavras.size() - 1));
		Palavra palavra = palavras.get(escolhido);

		return palavra;
	}

	public char[] desmontarPalavra(String palavra) {
		char[] conjunto = palavra.toCharArray();
		return conjunto;
	}

	/**
	 * @method transforma o array que recebeu em caracteres de interrogação
	 *         independente do tamanho que seja
	 * @param recebe um array de char
	 * @return retorna um array de char preenchido com interrogações
	 */
	public char[] escondePalavra(char[] palavra) {
		char[] icognito = new char[palavra.length];

		for (int i = 0; i == palavra.length; i++) {
			icognito[i] = '?';
		}

		return icognito;
	}
}
