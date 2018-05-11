package loaine.estruturadados.base;

import java.lang.reflect.Array;

public class EstruturaEstatica<T> {
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public EstruturaEstatica(Object[] elementos) {
		super();
		this.elementos = (T[]) elementos;
	}
	public EstruturaEstatica() {
		this(10);
	}

	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade(); 
		if (this.tamanho < this.elementos.length) { 
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	protected boolean adiciona(int posicao,T elemento) {

		if (!((posicao >= 0) && (posicao < this.tamanho))) {
			throw new IllegalArgumentException("Posição Invalida");
		}

		this.aumentaCapacidade(); 

		for (int i = (this.tamanho-1); i >=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
			for (int i=0; i<this.tamanho; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}
	
	public boolean estaVazia(){
		return this.tamanho == 0;
    }
	
	protected void remove(int posicao) {
		if (!((posicao >= 0) && (posicao < tamanho))) {
			throw new IllegalArgumentException("Posição Invalida");
		}
		
		for (int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;		
	}
	
	protected Object busca(int posicao){
		if (!((posicao >= 0) && (posicao < tamanho))) {
			throw new IllegalArgumentException("Posição Invalida");
		}

		return this.elementos[posicao];		
	}

	protected int busca(T elemento){
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	
	protected void remove(T elemento) {
		int posicao = busca(elemento); 
		remove(posicao);		
	}

	@Override
	public String toString() {
		StringBuilder sbRetorno = new StringBuilder();  
		sbRetorno.append("[");

		for (int i = 0; i < this.tamanho-1 ; i++) {
			sbRetorno.append(this.elementos[i]);
			sbRetorno.append(", ");			
		} 

		if (this.tamanho > 0) {
			sbRetorno.append(this.elementos[this.tamanho-1]);
		}			

		sbRetorno.append("]");

		return sbRetorno.toString();
	}

}
