package list.pesquisa;

public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	// Construtor
	public Livro(String titulo, String autor, int anoPublicacao) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
	}
	
	// Getters e setters
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
}
