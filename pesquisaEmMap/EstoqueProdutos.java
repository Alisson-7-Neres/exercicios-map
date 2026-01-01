package com.dio.map.pesquisaEmMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	Map<Long, Produto> produtos = new HashMap<>();
	Produto produto = new Produto();
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		Produto produto = new Produto(nome, quantidade, preco);
		produtos.put(cod, produto);
	}
	public void exibirProdutos() {
		System.out.println("############################");
		produtos.entrySet().stream().forEach(p -> {
			System.out.println("Código do produto: " + p.getKey() + "\n" + p.getValue());
		});
	}
	public void calcularValorTotalEstoque() {
		System.out.println("############################");
		double valorTotalEstoque = produtos.entrySet().stream().mapToDouble(p -> p.getValue().getPreco() * p.getValue().getQuantidade()).sum();
		
		System.out.println("Valor total no estoque: R$" + valorTotalEstoque);
	}
	public void obterProdutoMaisCaro() {
		System.out.println("############################");
		Produto maisCaro = produtos.values().stream().max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())).get();
		System.out.println("Produto mais caro: " + maisCaro.getNome() + ", R$" + maisCaro.getPreco());
	}
	public void obterProdutoMaisBarato() {
		System.out.println("############################");
		Produto maisBarato = produtos.values().stream().min((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())).get();
		System.out.println("Produto mais barato: " + maisBarato.getNome() + ", R$" + maisBarato.getPreco());
	}
	public void obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		System.out.println("############################");
		Produto maiorQuantidade = produtos.values().stream().max((p1, p2) -> Integer.compare(p1.getQuantidade(), p2.getQuantidade())).get();
		System.out.println("Produto em maior quantidade: " + maiorQuantidade.getNome() + ", Quantidade: " + maiorQuantidade.getQuantidade()
		+ " unidades" +", preço: R$" + maiorQuantidade.getPreco());
	}
}
