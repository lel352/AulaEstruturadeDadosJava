package loaine.estruturadados.vetor;

public class VetorObjetos {

	private Object[] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	public VetorObjetos(Object[] elementos) {
		super();
		this.elementos = elementos;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length){
			Object[] elementosNovos = new Object[this.elementos.length*2];
			for (int i=0; i<this.tamanho; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade(); 
		if (this.tamanho < this.elementos.length) { 
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}


	public boolean adiciona(Object elemento, int posicao) {

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

	public Object busca(int posicao){
		if (!((posicao >= 0) && (posicao < tamanho))) {
			throw new IllegalArgumentException("Posição Invalida");
		}

		return this.elementos[posicao];		
	}

	public int busca(Object elemento){
		for (int i = 0; i < this.tamanho; i++) {
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
	
	
	public void remove(Object elemento) {
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
