package loaine.estruturadados.vetor;

import java.io.EOFException;
import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public Vetor(String[] elementos) {
		super();
		this.elementos = elementos;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length){
			String[] elementosNovos = new String[this.elementos.length*2];
			for (int i=0; i<this.tamanho; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	/*	public void adiciona(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) { 
			this.tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possivel adicionar novo elemento.");
		}*/


	public boolean adiciona(String elemento) {
		this.aumentaCapacidade(); 
		if (this.tamanho < this.elementos.length) { 
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}


	public boolean adiciona(String elemento, int posicao) {

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

	public String busca(int posicao){
		if (!((posicao >= 0) && (posicao < tamanho))) {
			throw new IllegalArgumentException("Posição Invalida");
		}

		return this.elementos[posicao];		
	}

	/*public boolean busca(String elemento){
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equalsIgnoreCase(elemento)) {
				return true;
			}
		}
		return false;
	}*/

	public int busca(String elemento){
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equalsIgnoreCase(elemento)) {
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
	
	
	public void remove(String elemento) {
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
