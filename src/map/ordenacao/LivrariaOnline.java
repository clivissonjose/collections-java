package map.ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class LivrariaOnline {

	private Map<String, Livro> livrosMap;
	
	public LivrariaOnline() {
		this.livrosMap = new HashMap<>();
	}
	
	public void adicionarLivro(String link, Livro livro) {
		livrosMap.put(link, livro);
	}
	
	public void exibir() {
		System.out.println(livrosMap);
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void removerLivro(String titulo) {
		Livro livroParaRemover = null;
		for(Livro l : livrosMap.values()) {
			if(l.getTitulo().equalsIgnoreCase(titulo));
				livroParaRemover = l;
		}
		
		livrosMap.remove(livroParaRemover);
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
		Map<String, Livro> livrosPorPreco = new TreeMap<>(livrosMap);
		return livrosPorPreco;
	}
	
	public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
		Map<String, Livro> livrosPorAutor = new HashMap<>();
		
		for(Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
			if(entry.getValue().getAutor().equalsIgnoreCase(autor)) {
				livrosPorAutor.put(entry.getKey(), entry.getValue());
			}
				
		}
		return livrosPorAutor;
	}
	
	public Livro obterLivroMaisCaro() {
		Livro livroMaisCaro = null;
		double maiorValor = 0.0;
		
		for(Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
			if(entry.getValue().getValor() > maiorValor) {
				maiorValor = entry.getValue().getValor();
				livroMaisCaro = entry.getValue();
			}
		}
		
		return livroMaisCaro;
	}
	
	public Livro obterLivroMaisBarato() {
		Livro livroMaisBarato = null;
		double menorValor = 0.0;
		int i = 0;
		
		for(Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
			double valorAtual = entry.getValue().getValor();
			if(i  == 0) {
				menorValor = valorAtual;
				i++;
			}
			if(valorAtual < menorValor) {
				menorValor = entry.getValue().getValor();
				livroMaisBarato = entry.getValue();
			}
		}
		
		return livroMaisBarato;
	}
	
	public static void main(String[] args) {
		
		LivrariaOnline livrariaOnline = new LivrariaOnline();
		
		 livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
		 livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
		 livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 0.99d));
		 livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
		 livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
		 livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

		    // Exibe todos os livros ordenados por preço
		   System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco()); 

		    // Pesquisa livros por autor
		    String autorPesquisa = "Josh Malerman";
		    System.out.println("\nLivros por autor: \n " + livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa));
		    

		    // Obtém e exibe o livro mais caro
		    System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

		    // Obtém e exibe o livro mais barato
		   System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

		    // Remover um livro pelo título
		    livrariaOnline.removerLivro("1984");
		    livrariaOnline.exibir();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
