package loaine.estruturadados.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Teste {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		System.out.println(fila);
		System.out.println(fila.espiar());
		
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		
		System.out.println();
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		System.out.println(fila);
		
		
		System.out.println();
		System.out.println(fila.espiar());
		System.out.println(fila.desenfileirar());
		System.out.println(fila.espiar());
		System.out.println(fila);
		
		
		System.out.println("\nClasse API Colleciton Java\n");
		
		Queue<Integer> fila2 = new LinkedList<Integer>();
		
		
		System.out.println(fila2.isEmpty());
		System.out.println(fila2.size());
		System.out.println(fila2);
		System.out.println(fila2.peek());//esp
		
		fila2.add(1);
		fila2.add(2);
		fila2.add(3);
		fila2.add(4);
		
		System.out.println();
		
		System.out.println(fila2.isEmpty());
		System.out.println(fila2.size());
		System.out.println(fila2);
		
		
		System.out.println();
		System.out.println(fila2.peek());//espiar
		System.out.println(fila2.remove());//remove
		System.out.println(fila2.peek());
		System.out.println(fila2);		
		System.out.println(fila2.poll());//remove
		System.out.println(fila2);		
		
		
		
		

	}

}
