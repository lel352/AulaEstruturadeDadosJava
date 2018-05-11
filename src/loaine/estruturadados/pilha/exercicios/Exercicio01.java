package loaine.estruturadados.pilha.exercicios;

import java.util.Random;
import java.util.Scanner;

import loaine.estruturadados.pilha.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha<Integer> pilha = new Pilha<Integer>(10);
		Scanner scan = new Scanner(System.in);
		
		int valor = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Valor"+(i+1)+": ");
			valor = scan.nextInt();			
			if (valor % 2 == 0) {
				System.out.println("Empilhado: " + valor);
				pilha.empilha(valor);				
			}
			else {
				Integer desempilhado = pilha.desempilha();
				if (desempilhado == null)
					System.out.println("Está vazia");
				else
					System.out.println("Desempilhado: " + desempilhado);
				
			}
		}
		
		System.out.println();
		System.out.println("Desempilhando");
		while (!pilha.estaVazia()) {
			System.out.println(pilha.desempilha());
		}	
	}
}
