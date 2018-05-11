package loaine.estruturadados.pilha.exercicios;

import loaine.estruturadados.pilha.Pilha;

public class Exercicio03 {

	public static void main(String[] args) {
		Pilha<Livro> pilhaLivro = new Pilha<Livro>();
		
		Livro livro;
		for (int i= 0;i < 6; i++) {
			livro = new Livro("livro"+(i+1),"1231"+i,2010+i,"Autor "+(i+1));
			pilhaLivro.empilha(livro);
		}
		
		System.out.println(pilhaLivro);
		System.out.println(pilhaLivro.desempilha());
		System.out.println(pilhaLivro);
		System.out.println(pilhaLivro.tamanho());
		System.out.println(pilhaLivro.estaVazia());

	}

}
