package loaine.estruturadados.pilha;

import java.util.Stack;

public class Teste {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println("Pilha:"+pilha);
		System.out.println("Tamanho:"+pilha.tamanho());
		System.out.println("Top:"+pilha.topo());

		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		pilha.empilha(4);
		
		System.out.println("Pilha:"+pilha);
		System.out.println("Tamanho:"+pilha.tamanho());
		
		System.out.println("Top:"+pilha.topo());
		System.out.println("desempinha:"+pilha.desempilha());
		System.out.println("Top:"+pilha.topo());
		System.out.println("Pilha:"+pilha);
		System.out.println("Tamanho:"+pilha.tamanho());
		
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println();
		
		System.out.println("Esta fazio:"+stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("Esta fazio:"+stack.isEmpty());
		System.out.println("Tamanho:" +stack.size());
		System.out.println("Pilha Stack:"+stack);
		
		System.out.println("Topo:" +stack.peek());
		System.out.println("Retira:" +stack.pop());
		System.out.println("Pilha Stack:" +stack);
		
		
		
	}

}
