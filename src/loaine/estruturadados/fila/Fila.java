package loaine.estruturadados.fila;

import loaine.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public void enfileirar(T elemento) {
		this.adiciona(elemento);
	}
	
	public T espiar() {
		 if (this.estaVazia()) {
			 return null;
		 }
		 return this.elementos[0];
		//return (T) super.busca(0);
	}
	
	public T desenfileirar() {
		
		 if (this.estaVazia()) {
			 return null;
		 }
		 
		T elementoSerRemovido = espiar();
		this.remove(0);
		return elementoSerRemovido;
	}
	
	
	
}
