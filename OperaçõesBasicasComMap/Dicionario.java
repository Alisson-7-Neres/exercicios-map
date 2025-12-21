package com.dio.Map.OperaçõesBasicasComMap;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	Map<String, String> palavras = new HashMap<>();

	public void adicionarPalavra(String palavra, String definicao) {
		palavras.put(palavra, definicao);
	}

	public void removerPalavra(String palavra) throws ConcurrentModificationException{
		try {
		palavras.entrySet().stream().filter(p -> p.getKey().contains(palavra)).forEach(p -> {
			palavras.entrySet().removeIf(c -> c.getKey().contains(palavra));
			System.out.println("Palavra removida: " + palavra);
		}); 
		} catch (ConcurrentModificationException e) {
			System.err.println("Inexistente!");
		}
	}

	public void exibirPalavras() {
		palavras.entrySet().stream().forEach(palavras -> {
			System.out.println("Palavra: " + palavras.getKey() + ", Definição: " + palavras.getValue());
		});
	}

	public void pesquisarPorPalavra(String palavra) {
		palavras.entrySet().stream().filter(p -> p.getKey().contains(palavra)).forEach(p -> {
			System.out.println(p.toString());
		});
	}
}
