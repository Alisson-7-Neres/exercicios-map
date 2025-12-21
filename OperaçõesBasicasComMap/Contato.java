package com.dio.Map.OperaçõesBasicasComMap;

public class Contato {

	private String nome;
	private int numeroTelefone;
	
	public Contato() {}
	
	public Contato(String nome, int numeroTelefone) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
	}
	
	public String getNome() {
		return nome;
	}
	public int getNumeroTelefone() {
		return numeroTelefone;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ",Número: " + numeroTelefone;
	}
	
}
