package com.dio.map.pesquisaEmMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ContagemPalavras {

	Map<String, Integer> palavras = new HashMap<>();

	public void adicionarPalavra(String palavra, Integer contagem) {
		palavras.entrySet().stream().filter(p -> p.getKey() == palavra).forEach(p -> {
			palavras.put(palavra, contagem + 1);
		});
		palavras.put(palavra, contagem);
	}

	public void removerPalavra(String palavra) {
		if (palavras.get(palavra) != null) {
			palavras.remove(palavra);
			System.out.println("Palavra removida: " + palavra);
		} else {
			System.err.println("Palavra inexistente: " + palavra);
		}
	}

	public void exibirContagemPalavras() {
		for (Entry<String, Integer> entry : palavras.entrySet()) {
			System.out.println("Palavra(s): " + entry.getKey() + ", contagem: " + entry.getValue());
		}
		// System.out.println(palavras.entrySet());
	}

	public void encontrarPalavraMaisFrequente() {
		palavras.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(entry -> 
		System.out.println("Palavra com maior frequência -> " + entry.getKey() + ", contagem: " + entry.getValue()));
	}

}
