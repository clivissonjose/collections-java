package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

	private Set<Produto> produtoSet;

	public CadastroProduto() {
		super();
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
		produtoSet.add(new Produto(nome, codigo, preco, quantidade));
	}
	
	public Set<Produto> exibirPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		
		return produtosPorNome;
	}
	
	public Set<Produto> exibirPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new comparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		
		return produtosPorPreco;
	}
	
}


















