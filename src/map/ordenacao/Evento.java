package map.ordenacao;

public class Evento {

	private String atracao;
	private String nome;
	
	public Evento(String nome, String atracao) {
		this.atracao  = atracao;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Evento [atracao=" + atracao + ", nome=" + nome + "]";
	}

	public String getAtracao() {
		return atracao;
	}

	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
