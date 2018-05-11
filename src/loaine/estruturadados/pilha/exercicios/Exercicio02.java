package loaine.estruturadados.pilha.exercicios;

import java.util.Scanner;

import loaine.estruturadados.pilha.Pilha;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha<Integer> pilhaPar = new Pilha<Integer>(10);
		Pilha<Integer> pilhaImpar = new Pilha<Integer>(10);
		Scanner scan = new Scanner(System.in);
		
		int valor = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Valor"+(i+1)+": ");
			valor = scan.nextInt();	
			if (valor == 0) {
				if (pilhaPar.estaVazia())
					System.out.println("pilha par vazia");
				else
				  System.out.println("Desempilha par: "+pilhaPar.desempilha());
				
				if (pilhaImpar.estaVazia())
				   System.out.println("pilha Impar vazia");
				else
				   System.out.println("Desempilha impar: "+pilhaImpar.desempilha());
				
			}
			else if (valor % 2 == 0) {
				System.out.println("Empilha par: "+valor);
				pilhaPar.empilha(valor);				
			}
			else {
				System.out.println("Empilha impar: "+valor);
				pilhaImpar.empilha(valor);					
			}
		}
		
		System.out.println();
		System.out.println("par:");
		while (!pilhaPar.estaVazia()) {
			System.out.println(pilhaPar.desempilha());
		}
		System.out.println();
		System.out.println("Impar:");
		while (!pilhaImpar.estaVazia()) {
			System.out.println(pilhaImpar.desempilha());
		}
		
	}

}
