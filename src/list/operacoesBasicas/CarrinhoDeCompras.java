package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itensDoCarrinho;
	
	// construtor
	
	public CarrinhoDeCompras() {
		itensDoCarrinho = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		 itensDoCarrinho.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		
		if(!itensDoCarrinho.isEmpty()) {
			List<Item> itensParaRemover = new ArrayList<>();
			for(Item i: itensDoCarrinho) {
				if(i.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(i);
				}
			}
			itensDoCarrinho.removeAll(itensParaRemover);
		}else {
			System.out.println("O carrinho está vazinho!");
		}
	}
	
	public double calcularValorTotal() {
		double total = 0.0;
		
	/*	List<Item> preco;
		for(int i = 0; i < itensDoCarrinho.size(); i++) {
			total += itensDoCarrinho;
		} */
		
		for(Item i: itensDoCarrinho) {
			total += i.getPreco() * i.getQuantidade();
		}
		
		return total;
	}
	
	public void exibirItens() {
		System.out.println(itensDoCarrinho);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		// Adicionar itens
		carrinho.adicionarItem("Coca cola", 23.0, 3);
		carrinho.adicionarItem("Cerveja", 4, 10);
		
		// exibir itens
		carrinho.exibirItens();
		
		// Mostra  o valor total dos prodotos do carrinho
		System.out.println("Preço do carrinho: " + carrinho.calcularValorTotal());
		
		// Remover item
		carrinho.removerItem("Cerveja");
		
		// Exibir itens e o valor total do carrinho após a  remoção
		
         carrinho.exibirItens();
		
		System.out.println("Preço do carrinho: " + carrinho.calcularValorTotal());
		
		
	}
}
