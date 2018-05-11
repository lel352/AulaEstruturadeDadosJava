package loaine.estruturadados.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

import loaine.estruturadados.pilha.Pilha;

public class Exercicio04 {

	public static void main(String[] args) {
		Stack<Livro> pilhaLivro = new Stack<Livro>();
		
		Livro livro;
		for (int i= 0;i < 6; i++) {
			livro = new Livro("livro"+(i+1),"1231"+i,2010+i,"Autor "+(i+1));
			pilhaLivro.add(livro);
		}
		
		System.out.println(pilhaLivro);
		System.out.println(pilhaLivro.peek());
		System.out.println(pilhaLivro);
		System.out.println(pilhaLivro.size());
		System.out.println(pilhaLivro.isEmpty());


	}

}
