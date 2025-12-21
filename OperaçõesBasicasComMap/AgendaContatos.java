package com.dio.Map.OperaçõesBasicasComMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	Map<String, Integer> contatos = new HashMap<>();
	
	public void adicionarContato(String nome, Integer telefone) {
		contatos.put(nome, telefone);
	}
	public void removerContato(String nome) throws InterruptedException {
		if (contatos.entrySet().stream().filter(c -> c.getKey().contains(nome)) != null) {
			System.out.println("Contato removido!\n" + nome);
			Thread.sleep(2000);
			contatos.remove(nome);
		} else {
			System.err.println("Contato inexistente!");
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
