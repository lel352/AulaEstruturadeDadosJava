package loaine.estruturadados.pilha.exercicios;

import loaine.estruturadados.pilha.Pilha;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		imprimeResultado("a + b");
		imprimeResultado("a + b + (c - d)");
		imprimeResultado("{[()]}[](){()}");
		imprimeResultado("{[(]}[](){()}");
		imprimeResultado("a + b + c - d)");

	}
	
	public static void imprimeResultado(String expressao) {
		System.out.print("Espressao: "+expressao);
		if (verificaSimbolosBalanceados(expressao))
		   System.out.println(" - Espressao esta balanceada");
		else
		   System.out.println(" - Espressao não esta balanceada");
		
	}
	
	final static String  ABRE = "([{";
	final static String  FECHA = ")]}";
	
	public static boolean verificaSimbolosBalanceados(String expressao) {
		Pilha<Character> pilha = new Pilha<Character>();
		char simbolo;
		char topo;
		
		for (int i = 0; i < expressao.length(); i++) {
			simbolo = expressao.charAt(i);
			
			if (ABRE.indexOf(simbolo) > -1) {
				pilha.empilha(simbolo);
		    }
		    else if (FECHA.indexOf(simbolo) > -1) {
		    	if (pilha.estaVazia()) {
		    		return false;
		    	}
		    	else {
		    		topo = pilha.desempilha();
		    		
		    		if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo))
		    			return false;
		    	}		    		
		    }	
		}
	
		return true;
	}

}
