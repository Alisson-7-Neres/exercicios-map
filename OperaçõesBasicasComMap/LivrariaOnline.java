package com.dio.map.OperaçõesBasicasComMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LivrariaOnline {
	
	Map<String, Livro> livros = new HashMap<>();
	
	public void adicionarLivro(String link, String titulo, String autor, double preco) {
		Livro livro = new Livro(titulo, autor, preco);
		livros.put(link, livro);
	}
	public void removerLivro(String titulo) {
		if(livros.entrySet().stream().filter(l -> l.getValue().getTitulo().contains(titulo)) != null) {
			livros.entrySet().removeIf(l -> l.getValue().getTitulo().contains(titulo));
			System.err.println("Livro removido: " + titulo);
		}
	}
	public void exibirLivrosOrdenadosPorPreco() {
		livros.entrySet().stream().sorted(Entry.comparingByValue( 
				(l1,l2) -> Double.compare(l1.getPreco(), l2.getPreco()))).forEach(l -> {
					System.out.println("ISBN: " + l.getKey() + "\nTítulo: " + l.getValue().getTitulo() + "\nAutor: " + l.getValue().getAutor() + 
							"\nPreço: " + l.getValue().getPreco() +
							"\n##########################################");
				});
	}
	public void pesquisarLivrosPorAutor(String autor) {
		System.err.println("Livros do autor:");
		livros.entrySet().stream().filter(l -> l.getValue().getAutor().contains(autor)).forEach(l -> {
			System.out.println("ISBN: " + l.getKey() + "\nTítulo: " + l.getValue().getTitulo() + "\nAutor: " + l.getValue().getAutor() + 
					"\nPreço: " + l.getValue().getPreco() +
					"\n##########################################");
		});
	}
	public void obterLivroMaisCaro() {
		System.err.println("Livro mais caro:");
		Entry<String, Livro> livroMaisCaro = livros.entrySet().stream().max((l1,l2) -> Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco())).get();
		System.out.println("ISBN: " + livroMaisCaro.getKey() + "\nTítulo: " + livroMaisCaro.getValue().getTitulo() + "\nAutor: " + livroMaisCaro.getValue().getAutor() + 
				"\nPreço: " + livroMaisCaro.getValue().getPreco() +
				"\n##########################################");
	}
	public void exibirLivroMaisBarato() {
		System.err.println("Livro mais barato:");
		Entry<String, Livro> livroMaisBarato = livros.entrySet().stream().min((l1,l2) -> Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco())).get();
		System.out.println("ISBN: " + livroMaisBarato.getKey() + "\nTítulo: " + livroMaisBarato.getValue().getTitulo() + "\nAutor: " + livroMaisBarato.getValue().getAutor() + 
				"\nPreço: " + livroMaisBarato.getValue().getPreco() +
				"\n##########################################");
	}

}
