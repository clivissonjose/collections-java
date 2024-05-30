package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	private Map<String, Integer> contagemMap;
	
	public ContagemPalavras(){
		this.contagemMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemMap.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if(!contagemMap.isEmpty()) {
			contagemMap.remove(palavra);
		}
	}
	
	public void exibirContagemPalavras() {
		System.out.println(contagemMap);
	}
	
	public String encontrarPalavraMaisFrequente() {
		
		String palavraMaisFrequente = null;
		int contagem = 0;
		
		 for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
		      if (entry.getValue() > contagem) {
		        contagem = entry.getValue();
		        palavraMaisFrequente = entry.getKey();
		      }
		    }
		 
		 return palavraMaisFrequente;
		
		
	}
	
	public static void main(String[] args) {
		var palavras = new ContagemPalavras();
		
		palavras.adicionarPalavra("Carrosel", 10);
		palavras.adicionarPalavra("Carro", 6);
		palavras.adicionarPalavra("Goku", 1);
		palavras.adicionarPalavra("Garrafa", 16);
		palavras.adicionarPalavra("Salada", 4);
		
		palavras.exibirContagemPalavras();
		
		palavras.removerPalavra("Carro");
		
		palavras.exibirContagemPalavras();
		
		System.out.println("Palavra mais frequente: " + palavras.encontrarPalavraMaisFrequente());
	}	
	
	
}
