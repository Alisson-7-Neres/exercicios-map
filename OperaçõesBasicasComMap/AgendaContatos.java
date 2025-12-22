package com.dio.Map.OperaçõesBasicasComMap;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	Map<String, Integer> contatos = new HashMap<>();
	
	public void adicionarContato(String nome, Integer telefone) {
		contatos.put(nome, telefone);
	}
	public void removerContato(String nome) {
		try {
		contatos.entrySet().stream().filter(c -> c.getKey().contains(nome)).forEach(p -> {
			System.out.println("Contato removido!\n" + nome);
			contatos.remove(nome);
		}); 
		} catch (ConcurrentModificationException e) {
			System.err.println("Contato inexistente!" + " '" + nome +"'");
		}
		
	}
	public void exibirContatos() {
		System.out.println(contatos.entrySet());
	}
	public void pesquisarPorNome(String nome) {
		contatos.entrySet().stream().filter(a -> a.getKey() == nome).forEach( a -> {
			System.out.println(a.toString());
		}); 
		System.out.println();
	}

}
