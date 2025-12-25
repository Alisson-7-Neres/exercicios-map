package com.dio.map.OperaçõesBasicasComMap;

public class Main {
	public static void main (String[] args) throws InterruptedException {
		
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Ana Beatriz Silva", 987654321);
		agendaContatos.adicionarContato("Carlos Eduardo Gomes", 976543210);
		agendaContatos.adicionarContato("Mariana Oliveira Souza", 965432109);
		agendaContatos.adicionarContato("Ricardo Pereira Lima", 954321098);
		agendaContatos.adicionarContato("Juliana Costa Mendes", 943210987);
		agendaContatos.adicionarContato("Fernando Rocha Santos", 932109876);
		agendaContatos.adicionarContato("Camila Antunes Dias", 921098765);
		agendaContatos.adicionarContato("Lucas Martins Farias", 910987654);
		agendaContatos.adicionarContato("Beatriz Nogueira Alves", 909876543);
		agendaContatos.adicionarContato("Gabriel Henrique Vaz", 998765432);
		
		agendaContatos.removerContato("Ana Beatriz Silva");
		agendaContatos.removerContato("Ana Clara Silva");
		agendaContatos.exibirContatos();
		agendaContatos.pesquisarPorNome("Lucas Martins Farias");
		
		/*
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("Roda", "Objeto mais ou menos circular; círculo.");
		dicionario.adicionarPalavra("Intervenção", "Ato de intervir, de exercer influência em determinada situação na tentativa de alterar o seu resultado; interferência.");
		dicionario.adicionarPalavra("Inhame", "Planta tropical, de origem asiática, de folhas largas e espatas brancas, sua parte comestível é formada por um ou mais tubérculos grossos subterrâneos.");
		dicionario.adicionarPalavra("Emenda", "Ação de emendar, de corrigir, de acabar com os defeitos.");
		dicionario.adicionarPalavra("Integral", "Que se apresenta na sua totalidade; total, inteiro, completo.");
		
		dicionario.exibirPalavras();
		dicionario.removerPalavra("Roda");
		dicionario.removerPalavra("chave");
		dicionario.pesquisarPorPalavra("Intervenção");
		*/
	}

}
