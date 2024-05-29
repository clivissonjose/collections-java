package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	private Map<Long, Produto> produtosMap;
	
	public EstoqueProdutos() {
		this.produtosMap =  new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int quant, double preco ) {
		this.produtosMap.put(cod, new Produto(nome, quant, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(produtosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotal = 0;
		if(!produtosMap.isEmpty())
			for(Produto p : produtosMap.values()) {
				valorTotal += p.getPreco() * p.getQuantidade();
			}
		else
			System.out.println("Estoque vazio!");
		
		return valorTotal;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto maisCaro = null;
		
		if(!produtosMap.isEmpty()) {
			double maiorPreco = Double.MIN_VALUE;
			for(Produto p : produtosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					maiorPreco = p.getPreco();
					maisCaro = p;
				}
			}
		}
		
		return maisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto maisBarato = null;
		if(!produtosMap.isEmpty()) {
			double menorPreco = Double.MAX_VALUE;
			for(Produto p : produtosMap.values()) {
				if(p.getPreco() < menorPreco) {
					menorPreco = p.getPreco();
					maisBarato = p;
				}
			}
		}
		
		return maisBarato;
	
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		// Retorna o produto que está em maior quantidade no estoque, 
		// considerando o valor total de cada produto (quantidade * preço).
		
		Produto maior = null;
		if(!produtosMap.isEmpty()) {
			
			for(Produto p :  produtosMap.values()) {
				if(p.getPreco() * p.getQuantidade() > maior.getPreco() * maior.getQuantidade()) {
					maior  = p;
				}
			}
			
		}else {
			System.out.println("Estoque vazio!");
		}
		return maior;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
