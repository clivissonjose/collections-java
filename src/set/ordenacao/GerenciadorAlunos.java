package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	private Set<Aluno> alunosSet;

	// Construtor
	public GerenciadorAlunos() {
		super();
		this.alunosSet = new HashSet<>();
	}
	
	// Metodo para adicionar
	public void adicionarAluno(String nome, long matricula, double media) {
		alunosSet.add(new Aluno(nome, matricula , media));
	}
	
	// Exibir alunos matriculados
	public void exibirAlunos() {
		System.out.println(alunosSet);
	}
	
	// Metod para remover aluno
	public void removerAluno(long matricula) {
		if(!alunosSet.isEmpty()) {
			for(Aluno a : alunosSet) {
				if(a.getMatricula() == matricula) {
					alunosSet.remove(a);
					break;
				}
			}
		}
	}
	
	//Exibir alunos em ordem alfabética
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNotas());
		alunosPorNota.addAll(alunosSet);
		return alunosPorNota;
	}
	
	
	
	
	
	
	
	public static void main(String [] args) {
		
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		
		alunos.adicionarAluno("Kaic joao", 68466936, 8.9);
		alunos.adicionarAluno("Vanessa", 68466436, 5);
		alunos.adicionarAluno("Sysana", 61166936, 10.0);
		alunos.adicionarAluno("Clivisson", 61166936, 7.0);
		alunos.adicionarAluno("Rafaela Nery", 8966936, 3.0);
		alunos.adicionarAluno("Carlos", 71166936, 10.0);
		
	//	alunos.exibirAlunos();
		
	//	alunos.removerAluno(68466436);
		
		alunos.exibirAlunos();
		
		System.out.println("========= Alunos em ordem alfabetica ========");
		
		System.out.println(alunos.exibirAlunosPorNome());
		
		System.out.println("========= Alunos em ordenados por nota ========");
		
		System.out.println(alunos.exibirAlunosPorNota());
		
	}
	
}
