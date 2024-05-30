package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class AgendaEventos {

	private Map<LocalDate, Evento>   eventosMap;

	public AgendaEventos() {
		super();
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate i, String nome, String atracao) {
	//	Evento evento = new Evento(nome, atracao);
		eventosMap.put(i, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		
		// Aqui pegamos os eventos em ordem crescente graças ao TreeeMap que ordena os dados
		Map<LocalDate, Evento> eventoOrdenado = new TreeMap<>(eventosMap);
		System.out.println(eventoOrdenado);
	}
	
	public void obterProximoEvento() {
	/*	Set<LocalDate> dataSet = eventosMap.keySet(); // Retorna um set com todas a chaves
		Collection<Evento> values = eventosMap.values(); // Retorna uma coleção com os valores */
		
		// Primeiro vamos pegar a data atual
		LocalDate dataAtual = LocalDate.now();
		
		// Ordenar os eventos
		Map<LocalDate, Evento> eventoOrdenado = new TreeMap<>(eventosMap);
		
		for(Map.Entry<LocalDate, Evento> entry : eventoOrdenado.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println(entry);
				break;
			}
		}
		
	}
	
	public static void main(String [] args) {
		
		AgendaEventos eventos = new AgendaEventos();
		
		eventos.adicionarEvento(LocalDate.of(2022, Month.MAY, 27), "EVENTO FAKE", "Jorge Santanna");
		eventos.adicionarEvento(LocalDate.of(2022, Month.APRIL, 10), "Valeria birthday party", "Luan Guedes");
		eventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 30), "Hoje", "Tarcisio do acordeon");
		eventos.adicionarEvento(LocalDate.of(2025, Month.FEBRUARY, 27), "festa de carnaval", "Calcinha Preta");
		
		eventos.exibirAgenda();
		eventos.obterProximoEvento();
	}
	
}
