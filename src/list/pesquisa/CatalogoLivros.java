package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> listaLivros;
	
	// construtor
	public CatalogoLivros() {
		this.listaLivros = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		listaLivros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		
		List<Livro> livrosPorAutor = new ArrayList<>();
		//livrosPorAutor = null;
		
		if(!listaLivros.isEmpty()) {
			for(Livro l: listaLivros) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}else {
			System.out.println("A lista está vazia!");
		}
		
		return livrosPorAutor;
	}
	
	// Retonar  livros publicados entre um range.
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervalo = new ArrayList<>();
		
		if(!listaLivros.isEmpty()) {
			for(Livro l: listaLivros) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervalo.add(l);
				}
			}
		}else {
			System.out.println("A lista está vazia!");
		}
		
		return livrosPorIntervalo;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		
		if(!listaLivros.isEmpty()) {
			for(Livro l: listaLivros) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo =  l;
					break;
				}	
			}
		}else {
			System.out.println("A lista está vazia!");
		}
		
		return livroPorTitulo;
	}
	
	public static void main(String [] args) {
		
		CatalogoLivros livros = new CatalogoLivros();
		
		livros.adicionarLivro("Sonho de ferraz", "Cesar Lopes", 2003);
		livros.adicionarLivro("Ferrari", "Juliana Menezes", 1987);
		livros.adicionarLivro("Catraca rosa", "Cesar Lopes", 2007);
		livros.adicionarLivro("Carrosel", "Ramos Sérgio", 2005);
		livros.adicionarLivro("Ferrari", "Lionel Messi ", 2017);
		
		
		System.out.println("Livro: " + 	livros.pesquisarPorAutor("Cesar Lopes"));
		
		System.out.println("Livro: " + livros.pesquisarPorIntervaloAnos(2000, 2007));
		
		System.out.println("Livro: " + livros.pesquisarPorTitulo("Ferrari"));
		
		
	}
	
}
