package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	
	private  Map<String, String> palavraMap;

	public Dicionario() {
		super();
		this.palavraMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		palavraMap.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!palavraMap.isEmpty())
			palavraMap.remove(palavra);
		else {
			System.out.println("Dicionário está vazio!");
		}
	}
	
	public void exibirPalavras() {
		if(!palavraMap.isEmpty()) {
			System.out.println(palavraMap);
		}else
			System.out.println("O dicionário está vazio!");
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String palavraParaPesquisar = null;
		
		if(!palavraMap.isEmpty()) {
			palavraParaPesquisar = palavraMap.get(palavra);
		}
		
		return palavraParaPesquisar;
	}
	
	public static void main(String [] args) {
		
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("Cachorro", " Animal que late");
		dicionario.adicionarPalavra("Vaca" , "Animal que dar leite");
		dicionario.adicionarPalavra("Garrafa", "Objeto para guardar liquido");
		dicionario.adicionarPalavra("Caderno", "Objeto para fazer anotações");
		dicionario.adicionarPalavra("Python", "Linhuagem de programação modinha");
		
		dicionario.exibirPalavras();
		
		dicionario.removerPalavra("Python");
		
		dicionario.exibirPalavras();
		
		String objeto = "Garrafa";
		System.out.println(objeto + ": "+ dicionario.pesquisarPorPalavra("Garrafa"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
