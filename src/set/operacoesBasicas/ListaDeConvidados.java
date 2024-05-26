package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ListaDeConvidados {

	
	private Set<Convidado> convidadoSet;

	public ListaDeConvidados() {
		super();
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerCandidato(int codigoConvite) {
		
		Convidado codigoParaRemover = null;
		
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				codigoParaRemover =  c;
				break;
			}
		}
		
		convidadoSet.remove(codigoParaRemover);
		
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void  exibirConvidado() {
		System.out.println(convidadoSet);
	}
	
 public static void main(String [] args) {
		
	ListaDeConvidados convidado = new ListaDeConvidados();
	
	// Exibir quantidade de convidados  sem adicionar (0)
	
	System.out.println("Quantidade de convidados: " + convidado.contarConvidados());
	
	convidado.adicionarConvidado("Clivisson",1234);
	convidado.adicionarConvidado("Paulinha",1434);
	convidado.adicionarConvidado("Edson",1434);
	convidado.adicionarConvidado("Josefa",1294);
	
	// Ver dados após adicionar pessoas
	
	System.out.println("Quantidade de convidados: " + convidado.contarConvidados());
	convidado.exibirConvidado();
	
	// Remover convidado
	
	convidado.removerCandidato(1234);
	
	
	// Exibindo dados após remoção
	System.out.println("Quantidade de convidados: " + convidado.contarConvidados());
	convidado.exibirConvidado();
	
	
		
 }
	
}
