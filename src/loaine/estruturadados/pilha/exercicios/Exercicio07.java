package loaine.estruturadados.pilha.exercicios;

import java.util.Stack;

import org.omg.PortableServer.ThreadPolicyOperations;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImprimeResultado(2,2);
		ImprimeResultado(4,2);
		ImprimeResultado(5,2);
		ImprimeResultado(100,2);
		ImprimeResultado(25,2);		
		ImprimeResultado(2503,2);
		ImprimeResultado(10035,2);
		ImprimeResultado(10035,8);
		ImprimeResultado(10035,16);
	}
	
	public static void ImprimeResultado(int numero,int base) {
		System.out.println("Numero: "+numero +" para base "+base+": "+decimalQualquerBase(numero, base));
	}
	
	
	public static String decimalQualquerBase(int numero, int base) {
		
		if (base > 16) {
			throw new IllegalArgumentException();
		}
		
		
		Stack<Integer> pilha = new Stack<Integer>();
		
		String numeroBase = "";
		int resto;
		String bases = "0123456789ABCDEF";
		
		while (numero > 0) {
			resto = numero % base;
			pilha.push(resto);
			numero /= base;
		}
		
		while (!pilha.isEmpty()) {
			numeroBase += bases.charAt(pilha.pop());
		}		
		
		return numeroBase;
	}

}
