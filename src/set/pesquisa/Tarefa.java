package set.pesquisa;

import java.util.Objects;

public class Tarefa {

	private String descricao;
	private boolean estaConcluida;
	
	
	@Override
	public String toString() {
		return "{" + descricao + ", esta Concluida= " + estaConcluida + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}

	// construtor
	public Tarefa(String descricao, boolean estaConcluida) {
		super();
		this.descricao = descricao;
		this.estaConcluida = estaConcluida;
	}
	
	// Getters e Setters 
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isEstaConcluida() {
		return estaConcluida;
	}
	public void setEstaConcluida(boolean estaConcluida) {
		this.estaConcluida = estaConcluida;
	}
	
}
