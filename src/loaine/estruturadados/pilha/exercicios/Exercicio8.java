package loaine.estruturadados.pilha.exercicios;

import java.util.Stack;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> original = new Stack<Integer>();
		Stack<Integer> destino = new Stack<Integer>();
		Stack<Integer> auxiliar = new Stack<Integer>();
		
		original.push(3);
		original.push(2);
		original.push(1);
		
		torreHanoi(original.size(), original, destino, auxiliar);

	}
	
	public static void torreHanoi(int n, Stack<Integer> original,Stack<Integer> destino,Stack<Integer> auxiliar) {
		if (n > 0) {
			torreHanoi(n-1,original,auxiliar,destino);
			destino.push(original.pop());
			System.out.println("----");
			System.out.println("original "+original);
			System.out.println("destino "+destino);
			System.out.println("Auxiliar "+auxiliar);
			torreHanoi(n-1,auxiliar,destino,original);
		}
	}

}
