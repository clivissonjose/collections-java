package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	// Atributo
	private List<Integer> listaNumeros;
	
	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	
	
	// Adicionar números
	public void adicionaNumero(int num) {
		listaNumeros.add(num);
	}
	
	
	// Somar números
	public int calcularSoma() {
		int total =0;
		
		for(Integer i: listaNumeros) {
			total += i;
		}
		
		return total;
	}
	
	public int encontrarMaiorNumero() {
		int maior = 0;
		int interacao = 0;
		for(Integer i: listaNumeros) {
			if(interacao == 0) {
				maior = i;
			}
			if(i>maior) {
				maior = i;
			}
			interacao++;
			
		}
		
		return maior;
	}
	
	public int encontrarMenorNumero() {
		int menor =0;
		int interacao = 0;
		
		for(Integer i : listaNumeros) {
			
			// if para pegar o primeiro numero da lista
			if(interacao == 0) {
				menor = i;
				interacao++;
			}
			
			if(i < menor) {
				menor = i;
			}
		}
		
		return menor;
	}

	
	public void exibirNumeros() {
		if(!listaNumeros.isEmpty()) {
			for(Integer i: listaNumeros) {
				System.out.println(i + " ");
			}
		}
	}
	@Override
	public String toString() {
		return "SomaNumeros [listaNumeros=" + listaNumeros + "]";
	}

	public List<Integer> getListaNumeros() {
		return listaNumeros;
	}

	public void setListaNumeros(List<Integer> listaNumeros) {
		this.listaNumeros = listaNumeros;
	}
	
	public static void main(String[] args) {
		
		SomaNumeros somaNumeros = new SomaNumeros();
		
		// Adicionando números
		
		somaNumeros.adicionaNumero(70);
		somaNumeros.adicionaNumero(10);
		somaNumeros.adicionaNumero(-9);
		somaNumeros.adicionaNumero(-8);
		somaNumeros.adicionaNumero(30);
		
		// Exibir os numeros
		somaNumeros.exibirNumeros();
		
		// Soma dos números
		int total = somaNumeros.calcularSoma();
		System.out.println("Soma dos números: " + total);
		
		
		// Maior e menor número
		
		System.out.println("Maior número: "+ somaNumeros.encontrarMaiorNumero());
		System.out.println("Menor número: "+ somaNumeros.encontrarMenorNumero());
		
	
		
		
	
	}
}
