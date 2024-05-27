package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

	
	private Set<Contato> agendaSet;
	
	// Construtor
	public AgendaContato() {
		this.agendaSet = new HashSet<>();
	}
	
	// Metodo  para adicionar contato
	public void adicionarContato(String nome, int numero) {
		agendaSet.add(new Contato(nome, numero));
	}
	
	// metodo para exibir a agenda
	public void exibirAgenda() {
		System.out.println(agendaSet);
	}
	
	// pesquisar contato por nome
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> nomes =  new HashSet<>();
		for(Contato c : agendaSet) {
			if(c.getNome().startsWith(nome)) {
				nomes.add(c);
			}
		}
		return nomes;
	}
	
	// método para atualizar numero de contato
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c : agendaSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		
		AgendaContato agenda = new AgendaContato();
		
		// Exibir agenda vazia
		agenda.exibirAgenda();
		
		// adicionar contatos, alguns com mesmo nome
		agenda.adicionarContato("Clivisson", 992029189);
		agenda.adicionarContato("Clivisson", 99209);
		agenda.adicionarContato("Clivisson cesar", 9920189);
		agenda.adicionarContato("Valéria", 9920389);
		agenda.adicionarContato("simone", 9924343);
		
		
		// Exibir agenda após ter adicionado alguns contatos
		agenda.exibirAgenda();
		
		// contato atualizado
		System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Clivisson", 00000));
		
		// Ver contatos após atulização
		agenda.exibirAgenda();
		
		// Ver conatatos por nome 
		System.out.println(agenda.pesquisarPorNome("Clivisson"));
		
		
	}
	
}
