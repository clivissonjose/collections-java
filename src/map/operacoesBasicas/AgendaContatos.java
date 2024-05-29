package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaContatosMap;

	public AgendaContatos() {
		super();
		this.agendaContatosMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer numero) {
		agendaContatosMap.put(nome, numero);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatosMap.isEmpty()) {
			agendaContatosMap.remove(nome);
		}else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatosMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer contato = null;
		if(!agendaContatosMap.isEmpty()) {
			contato = agendaContatosMap.get(nome);
		}else {
			System.out.println("A agenda está vazia: ");
		}
		
		return contato;
	}
	

	public static void main(String[] args) {
		
		AgendaContatos agenda = new AgendaContatos();
		
        agenda.exibirContatos();
		
		// adicionar contatos, alguns com mesmo nome
		agenda.adicionarContato("Clivisson", 992029189);
		agenda.adicionarContato("Clivisson", 99209);
		agenda.adicionarContato("Clivisson cesar", 9920189);
		agenda.adicionarContato("Valéria", 9920389);
		agenda.adicionarContato("simone", 9924343);
		
		
		// Exibir agenda após ter adicionado alguns contatos
		agenda.exibirContatos();
		
		// Remover contato
		agenda.removerContato("simone");
		
		// Ver contatos após remoção
		agenda.exibirContatos();
		
		// Ver contatos por nome 
		System.out.println("Numero: " + agenda.pesquisarPorNome("Clivisson"));
	}
}
