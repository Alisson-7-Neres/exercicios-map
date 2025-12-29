package com.dio.map.ordenacaoNosMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AgendaEventos {
	
	Map<LocalDate, Evento> datas = new HashMap<>();
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento eventos = new Evento(nome, atracao);
		datas.put(data, eventos);
	}
	public void exibirAgenda() {
		TreeMap<LocalDate, Evento> treeMap = new TreeMap<>(datas);
		
		for(Entry<LocalDate, Evento> entry : treeMap.entrySet()) {
			System.out.println("Evento\nNome: " + entry.getValue().getNome() + "\nAtração: " + entry.getValue().getAtracao() + 
					"\nData: " + entry.getKey());
			System.out.println("###############################");
		}
		
	}
	public void obterProximoEvento() {
		LocalDate atual = LocalDate.now();
		datas.entrySet().stream().forEach(d -> {
			if(d.getKey().isAfter(atual)) {
				System.err.println("Evento\nNome: " + d.getValue().getNome() + "\nAtração: " + d.getValue().getAtracao() + 
					"\nData: " + d.getKey());
			}
		});
	}

}
