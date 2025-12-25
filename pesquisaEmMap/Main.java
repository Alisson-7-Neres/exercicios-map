package com.dio.map.pesquisaEmMap;

public class Main {
	public static void main(String[] args) {
		
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
	}

}
