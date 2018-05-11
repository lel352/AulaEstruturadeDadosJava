package loaine.estruturadados.vetor.exercicios;

public class Teste {
	
	public static void inserir(Lista<Contato> lista) {
		for (int i = 0; i < 30; i++) {
		   Contato contato = new Contato("Contato"+i, ""+i, "email"+i+"@gmail");
		   lista.adiciona(contato);
		}
	}	

	public static void main(String[] args) {
		Lista<String> lista = new Lista(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("E"));
		System.out.println(lista.contem("C"));
		
		/*Lista<Contato> lista = new Lista(20);
		inserir(lista);
		
		System.out.println(lista);*/
	}

}
