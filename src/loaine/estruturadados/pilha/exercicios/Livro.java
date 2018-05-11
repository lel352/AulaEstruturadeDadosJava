package loaine.estruturadados.pilha.exercicios;

public class Livro {
	
	private String nome;
	private String isbn;
	private int anoLacamento;
	private String autor;
	
	public Livro() {
	}
	
	public Livro(String nome, String isbn, int anoLacamento, String autor) {
		super();
		this.nome = nome;
		this.isbn = isbn;
		this.anoLacamento = anoLacamento;
		this.autor = autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAnoLacamento() {
		return anoLacamento;
	}
	public void setAnoLacamento(int anoLacamento) {
		this.anoLacamento = anoLacamento;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", isbn=" + isbn + ", anoLacamento=" + anoLacamento + ", autor=" + autor + "]";
	}	
	
}
