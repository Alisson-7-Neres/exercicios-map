package com.dio.map.ordenacaoNosMap;import com.dio.map.OperaçõesBasicasComMap.LivrariaOnline;

public class Main {
	public static void main(String[] args) {
		
		/*
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2025, 12, 25) , "Natal", "Papai Noel");
		agendaEventos.adicionarEvento(LocalDate.of(2025, 9, 26) , "Aniversário", "Eu");
		agendaEventos.adicionarEvento(LocalDate.of(2025, 5, 2) , "Páscoa", "Jesus");
		agendaEventos.adicionarEvento(LocalDate.of(2026, 1, 1) , "Ano novo", "Roberto Carlos");
		agendaEventos.exibirAgenda();
		agendaEventos.obterProximoEvento();
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
