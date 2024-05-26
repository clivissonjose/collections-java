package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavraUnicas;

	public ConjuntoPalavrasUnicas() {
		this.palavraUnicas = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavraUnicas.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		String palavraParaRemover = null;
		
		if(!palavraUnicas.isEmpty()) {
			
			for(String s : palavraUnicas) {
				if(s.equalsIgnoreCase(palavra)) {
					palavraParaRemover = s;
					break;
				}
			}
		}else {
			System.out.println("Lista está vazia!");
		}
		
		palavraUnicas.remove(palavraParaRemover);
	}
	
	public void verificarPalavra(String palavra) {
		int flag = 0;
		for(String s : palavraUnicas) {
			if(s.equalsIgnoreCase(palavra)) {
				System.out.println("A palavra "+ palavra + " está presente no set.");
				flag++;
				break;
			}
		}
		
		if(flag==0) {
			System.out.println("A palavra "+ palavra + " não está presente no set.");
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(palavraUnicas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
		return Objects.equals(palavraUnicas, other.palavraUnicas);
	}

	public void exibirPalavrasUnicas() {
		System.out.println(palavraUnicas);
	}
	
	@Override
	public String toString() {
		return "ConjuntoPalavrasUnicas [palavraUnicas=" + palavraUnicas + "]";
	}
	
	public static void main(String [] args) {
		
		ConjuntoPalavrasUnicas palavra = new ConjuntoPalavrasUnicas();
		
		
		// adicionando palavras
		palavra.adicionarPalavra("Ola mundo");
		palavra.adicionarPalavra("Hello world");
		palavra.adicionarPalavra("Major ");
		palavra.adicionarPalavra("interface");
		// adicionado palavra repetida para testar o set
		palavra.adicionarPalavra("interface");
		
		// exibir dados
		palavra.exibirPalavrasUnicas();
		
		// Testar a remoção
		palavra.removerPalavra("Major ");
		
		// Exibir palavras após a remoção, para ver se o método de remover está funcionando
		palavra.exibirPalavrasUnicas();
		
		
		// Testando método de  verificar palavra
		palavra.verificarPalavra("interface");
		palavra.verificarPalavra("Arroba");
		
		
	}

	
	
}
