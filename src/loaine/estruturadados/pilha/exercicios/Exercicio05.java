package loaine.estruturadados.pilha.exercicios;

import java.util.Scanner;

import loaine.estruturadados.pilha.Pilha;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Paravra: ");
		String palavra = scan.nextLine();
		Pilha<Character> pilhaInversa = new Pilha<Character>(); 
		
		for (int i = 0; i < palavra.length(); i++) {
			pilhaInversa.empilha(palavra.charAt(i));
		}
		
		String palavraInvertida ="";
		while (!pilhaInversa.estaVazia()) {
		  palavraInvertida += pilhaInversa.desempilha(); 
		}
		if (palavra.equalsIgnoreCase(palavraInvertida))
		    System.out.println(palavra+ " � palindromo "+palavra +" "+palavraInvertida);
		else
			System.out.println(palavra+ " n�o � palindromo "+palavra +" "+palavraInvertida);

	}

}
