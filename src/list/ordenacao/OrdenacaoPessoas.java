package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	List<Pessoa> pessoas ;
	
	public OrdenacaoPessoas() {
		this.pessoas = new ArrayList<>();
	}
	
	// Adicionar uma pessoa
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> ordenarPorIdade = new ArrayList<>(pessoas);
		Collections.sort(ordenarPorIdade);
		return ordenarPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> ordenarPorAltura = new  ArrayList<>(pessoas); // ArrayList<>(Pessoas);
		Collections.sort(ordenarPorAltura, new ComparatorPorAltura() );
		return ordenarPorAltura;
	}
	
	public static void main(String[] args) {
		
		OrdenacaoPessoas pessoa = new OrdenacaoPessoas();
		
		// Adicionar alunos
		pessoa.adicionarPessoa("Clívisson", 23, 1.74);
		pessoa.adicionarPessoa("Rafaela", 20, 1.62);
		pessoa.adicionarPessoa("Samira Almeida", 22, 1.59);
		pessoa.adicionarPessoa("Joao Santos", 30, 1.89);
		pessoa.adicionarPessoa("Kaio", 19, 1.70);
		
		// Ver alunos ordenados  por idade (ordem crescente)
		System.out.println(pessoa.ordenarPorIdade());
		
		// Ver alunos ordenados  por altura (ordem crescente)
		System.out.println(pessoa.ordenarPorAltura());
		
	}
}
