package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {

	Set<Tarefa> tarefaSet;

	// Contrutor 
	public ListaTarefa() {
		super();
		this.tarefaSet = new HashSet<>();
	}
	
	// adicionando tarefa, colocando já com pendete
	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa(descricao, false));
	}
	
	public void removerTarefa(String descricao) {
		
		Tarefa tarefaParaRemover = null;
		
		if(!tarefaSet.isEmpty()) {
			
			for(Tarefa t : tarefaSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover= t;
					break;
				}
			}
			tarefaSet.remove(tarefaParaRemover);
		}else {
			System.out.println("A lista está vazia! ");
		}
	}
	
	// Exibir tarefas
	
	public void exibirTarefas() {
		System.out.println(tarefaSet);
	}
	
	// Contar total de tarefas
	
	public int contarTarefas() {
		return tarefaSet.size();
	}
	
	// Tarefas que foram concluidas
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		
		for(Tarefa t : tarefaSet) {
			if(t.isEstaConcluida()) {
				tarefasConcluidas.add(t);
			}
		}
		
		return tarefasConcluidas;
	}
	
	// Listando tarefas pendentes
	public  Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		
		for(Tarefa t : tarefaSet) {
			if(!t.isEstaConcluida()) {
				tarefasPendentes.add(t);
			}
		}
		
		return tarefasPendentes;
	}
	
	//  Concluir tarefa
	public void marcarTarefaConcluida(String descricao) {
		//Tarefa concluida = null;
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setEstaConcluida(true);
				//	concluida = t;
					break;
				}
			}
			
		}else {
			System.out.println("A lista está vazia! ");
		}
	}
	
	// Marcar tarefa como pendente
	public void marcarTarefaPendente(String descricao) {
		//Tarefa pendente = null;
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setEstaConcluida(false);
				 //	pendente = t;
					break;
				}
			}
			
		}else {
			System.out.println("A lista está vazia! ");
		}
	}
	
	//Remover todo as as tarefas
	public void limparListaTarefas() {
		tarefaSet.clear();
	}
	
	public static void main(String[] args) {
		
		 ListaTarefa listaTarefaSet = new ListaTarefa();
		 
		 listaTarefaSet.exibirTarefas();
		 listaTarefaSet.adicionarTarefa("Lavar o carro");
		 listaTarefaSet.adicionarTarefa("Lavar a moto");
		 listaTarefaSet.adicionarTarefa("Comprar feijão");
		 listaTarefaSet.adicionarTarefa("Comprar sal");
		 listaTarefaSet.adicionarTarefa("Ligar para ju");
		 listaTarefaSet.adicionarTarefa("terminar projeto poo");
		 listaTarefaSet.adicionarTarefa("Almocar");
		 
		// listaTarefaSet.exibirTarefas();
		 
		// listaTarefaSet.marcarTarefaConcluida("Lavar o carrro");
		 
		 listaTarefaSet.marcarTarefaConcluida("terminar projeto poo");
		 listaTarefaSet.marcarTarefaConcluida("Ligar para ju");
		 listaTarefaSet.marcarTarefaConcluida("Lavar o carro");
		 
		// listaTarefaSet.exibirTarefas();
		 
	  //   System.out.println(listaTarefaSet.obterTarefasConcluidas());	 
	  //   System.out.println(listaTarefaSet.obterTarefasPendentes());
	     
	  //   listaTarefaSet.marcarTarefaPendente("Ligar para ju");
		 
	  //   System.out.println(listaTarefaSet.obterTarefasPendentes());
	     
	     System.out.println("Quantidaade de tarefas: " + listaTarefaSet.contarTarefas());
	     
	     listaTarefaSet.limparListaTarefas();
	     
	     System.out.println("Quantidaade de tarefas: " + listaTarefaSet.contarTarefas());
		 
		
	}
}
