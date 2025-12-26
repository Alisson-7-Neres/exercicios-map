package com.dio.map.pesquisaEmMap;

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
		*/
		
		ContagemPalavras contagemPalavras = new ContagemPalavras();
		
		contagemPalavras.adicionarPalavra("vermelho", 3);
		contagemPalavras.adicionarPalavra("amarelo", 2);
		contagemPalavras.adicionarPalavra("preto", 8);
		contagemPalavras.adicionarPalavra("azul", 0);
		
		contagemPalavras.exibirContagemPalavras();
		
		contagemPalavras.removerPalavra("azul");
		contagemPalavras.removerPalavra("rosa");
		
		contagemPalavras.encontrarPalavraMaisFrequente();
	}

}
