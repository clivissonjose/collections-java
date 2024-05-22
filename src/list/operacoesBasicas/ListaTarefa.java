package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> tarefaList;
	
	// Construtor
	
	public ListaTarefa() {
		tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	// remover tarefa
	
	public void removerTarefa(String Descricao) {
		if(!tarefaList.isEmpty()) {
			List<Tarefa> tarefasParaRemover = new ArrayList<>();
			
			for(Tarefa t: tarefaList) {
				if(t.getDescricao().equalsIgnoreCase(Descricao)) {
					tarefasParaRemover.add(t);
				}
			}
			tarefaList.removeAll(tarefasParaRemover);
			
		}else {
			System.out.println("A lista de tarefas está vazia! ");
		}
	}
	// Pegar quantidade de tarefas
	
	public int numeroDeTarefas() {
		return tarefaList.size();
	}
	
	// Obter descrições das tarefas
	
	public void descricaoTarefa() {
		System.out.println(tarefaList);
	}
}
