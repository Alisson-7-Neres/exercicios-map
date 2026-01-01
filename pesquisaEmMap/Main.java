package com.dio.map.pesquisaEmMap;

import com.dio.map.OperaçõesBasicasComMap.LivrariaOnline;

public class Main {
	public static void main(String[] args) {
		
		/*
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProduto(54789, "Micro-ondas", 127, 597.90);
		estoqueProdutos.adicionarProduto(64782, "Forno Eletrico", 98, 328.63);
		estoqueProdutos.adicionarProduto(15257, "Air Fryer", 98, 239.00);
		estoqueProdutos.adicionarProduto(41254, "Churrasqueira Elétrica ", 365, 210.84);
		
		estoqueProdutos.exibirProdutos();
		
		estoqueProdutos.calcularValorTotalEstoque();
		estoqueProdutos.obterProdutoMaisCaro();
		estoqueProdutos.obterProdutoMaisBarato();
		estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();

		ContagemPalavras contagemPalavras = new ContagemPalavras();
		
		contagemPalavras.adicionarPalavra("vermelho", 3);
		contagemPalavras.adicionarPalavra("amarelo", 2);
		contagemPalavras.adicionarPalavra("preto", 8);
		contagemPalavras.adicionarPalavra("azul", 0);
		
		contagemPalavras.exibirContagemPalavras();
		
		contagemPalavras.removerPalavra("azul");
		contagemPalavras.removerPalavra("rosa");
		
		contagemPalavras.encontrarPalavraMaisFrequente();
		*/
		
		LivrariaOnline livrariaOnline = new LivrariaOnline();
		livrariaOnline.adicionarLivro("8556510671", "Outsider", "Stephen King", 78.99);
		livrariaOnline.adicionarLivro("8595810087", "Deixada Para Trás", "Charlie Donlea", 49.80);
		livrariaOnline.adicionarLivro("9788501116536", "A paciente silenciosa", "Alex Michaelides", 39.80);
		livrariaOnline.adicionarLivro("6555984562", "O Silêncio dos Inocentes: Entre Cordeiros e Monstros", "Yvonne Tasker", 62.37);
		livrariaOnline.adicionarLivro("8582852479", "Memórias do subsolo", "Fiódor Dostoiévski", 59.05);
		livrariaOnline.adicionarLivro("8582850743", "Noites brancas", "Fiódor Dostoiévski", 28.03);
		
		livrariaOnline.exibirLivrosOrdenadosPorPreco();
		livrariaOnline.pesquisarLivrosPorAutor("Alex Michaelides");
		livrariaOnline.removerLivro("Noites brancas");
		livrariaOnline.exibirLivrosOrdenadosPorPreco();
		livrariaOnline.obterLivroMaisCaro();
		livrariaOnline.exibirLivroMaisBarato();
	}

}