package loaine.estruturadados.vetor;

public class Teste {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);
		//Vetor vetor = new Vetor(3);
		
		/*try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor);
		
		
		System.out.println(vetor.busca(1));
		System.out.println(vetor.busca("aa"));
		System.out.println(vetor.busca("elemento 2"));
		
		vetor.adiciona("elemento 1.5",1);
		System.out.println(vetor);
		
		vetor.adiciona("elemento 4");
		System.out.println(vetor);
		vetor.adiciona("elemento 5");
		System.out.println(vetor);
		vetor.adiciona("elemento 6");
		System.out.println(vetor);
		
		vetor.remove(1);
		System.out.println(vetor);
		vetor.remove("elemento 6");
		System.out.println(vetor);
		
		
		
		Contato c1 = new Contato("Contato 1", "234234", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "234234", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "234234", "contato3@email.com");
				
		VetorObjetos vetorContato = new VetorObjetos(3);
		vetorContato.adiciona(c1);
		vetorContato.adiciona(c2);
		vetorContato.adiciona(c3);
		
		System.out.println(vetorContato);
		Contato c4 = new Contato("Contato 4", "234234", "contato4@email.com");
		
		System.out.println(vetorContato.busca(c4));
		
		vetorContato.adiciona(c4);
		System.out.println(vetorContato);
		System.out.println(vetorContato.busca(c4));*/
		
		
		vetor.adiciona(1);
		vetor.adiciona("Teste");
		
		System.out.println(vetor);
		
		
		Lista<String> lista = new Lista(5);
		lista.adiciona("Elemento 1");
		lista.adiciona("Elemento 2");
		lista.adiciona("Elemento 3");
		System.out.println(lista);
		
		
		
	}
}
