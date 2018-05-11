package loaine.estruturadados.vetor.exercicios;

import java.lang.reflect.Array;

public class Lista<T> {


	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public Lista(Object[] elementos) {
		super();
		this.elementos = (T[]) elementos;
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


	public boolean adiciona(T elemento) {
		this.aumentaCapacidade(); 
		if (this.tamanho < this.elementos.length) { 
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}


	public boolean adiciona(T elemento, int posicao) {

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

	public T obtem(int posicao) {
		return this.busca(posicao);
	}

	public T busca(int posicao){
		if (!((posicao >= 0) && (posicao < tamanho))) {
			throw new IllegalArgumentException("Posição Invalida");
		}

		return this.elementos[posicao];		
	}

	public int busca(T elemento){
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contem(T elemento) {
		return (this.busca(elemento) > -1)?true:false; 
	}	

	public int ultimoIndice(T elemento) {
		for (int i = (this.tamanho -1); i >=0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}			
		}		
		return -1;
	}

	public void remove(int posicao) {
		if (!((posicao >= 0) && (posicao < tamanho))) {
			throw new IllegalArgumentException("Posição Invalida");
		}

		for (int i = posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;		
	}


	public void remove(T elemento) {
		int posicao = busca(elemento);
		if (posicao > -1)
			this.remove(posicao);		
	}

	public void limpar() {
		this.elementos =  (T[]) new Object[this.elementos.length];
		//ou
		/*this.tamanho = 0; // o resto vira lixo
		//ou
		for (int i = 0; i < this.tamanho-1; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;*/
	}

	@Override
	public String toString() {
		StringBuilder sbRetorno = new StringBuilder();  
		sbRetorno.append("[");

		for (int i = 0; i < this.tamanho-1 ; i++) {
			sbRetorno.append(this.elementos[i]);
			sbRetorno.append(", \n");			
		} 

		if (this.tamanho > 0) {
			sbRetorno.append(this.elementos[this.tamanho-1]);
		}			

		sbRetorno.append("]");


		return sbRetorno.toString();
	}

}
