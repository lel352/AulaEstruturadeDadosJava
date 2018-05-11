package loaine.estruturadados.vetor;

import loaine.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T>{
	
	public Lista2() {
		super();
	}

	public Lista2(int capacidade) {
		super(capacidade);
	}

	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}

	public boolean adiciona(int posicao,T elemento) {
		return super.adiciona(posicao, elemento);
	}

	public void remove(int posicao){
		super.remove(posicao);
	}
	
	public T busca(int posicao){
		return (T) super.busca(posicao);
	}	

	public int busca(T elemento){
		return super.busca(elemento);
	}
	

}
