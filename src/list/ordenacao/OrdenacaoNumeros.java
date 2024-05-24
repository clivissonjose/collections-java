package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	private List<Integer> numeros;
	
	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int num) {
		numeros.add(num);
	}
	/*
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> ordenarPorIdade = new ArrayList<>(pessoas);
		Collections.sort(ordenarPorIdade);
		return ordenarPorIdade;
	} */
	
	
	public List<Integer> ordenarAscendente() {
		List<Integer> numeroAscendente = numeros;
		Collections.sort(numeroAscendente);
		return numeroAscendente;
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> numerosDescendente = numeros;
		numerosDescendente.sort(Collections.reverseOrder());
		return numerosDescendente;
	}
	
	@Override
	public String toString() {
		return "OrdenacaoNumeros [numeros=" + numeros + "]";
	}
	
	public static void main(String[] args) {
		
		OrdenacaoNumeros numerosList = new OrdenacaoNumeros();
		
		numerosList.adicionarNumero(8);
		numerosList.adicionarNumero(18);
		numerosList.adicionarNumero(30);
		numerosList.adicionarNumero(-8);
		numerosList.adicionarNumero(15);
		numerosList.adicionarNumero(5);
		
		System.out.println(numerosList.ordenarAscendente());
		System.out.println(numerosList.ordenarDescendente());
	}

	
}
