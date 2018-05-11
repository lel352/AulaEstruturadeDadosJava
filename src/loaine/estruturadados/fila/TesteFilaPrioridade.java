package loaine.estruturadados.fila;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TesteFilaPrioridade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*FilaComPrioridade<Integer> fila = new FilaComPrioridade<Integer>();
		
		fila.enfileirar(1);
		fila.enfileirar(3);
		fila.enfileirar(2);
		
		System.out.println(fila);
		
		System.out.println();*/
		
		
		System.out.println("Fila com prioridade API");
		Queue<Integer> filaPrioridade = new PriorityQueue<>();
		
		filaPrioridade.add(2);
		filaPrioridade.add(1);
		
		System.out.println(filaPrioridade);
		System.out.println();
		
		Queue<Paciente> filaPrioridadePaciente = new PriorityQueue<>();
		filaPrioridadePaciente.add(new Paciente("A",2));
		filaPrioridadePaciente.add(new Paciente("B",1));
		filaPrioridadePaciente.add(new Paciente("C",3));
		System.out.println(filaPrioridadePaciente);
		
		
		Queue<Paciente> filaPrioridadePaciente2 = new PriorityQueue<>(
				new Comparator<Paciente>() {

					@Override
					public int compare(Paciente p1, Paciente p2) {
						/*if (p1.getPrioridade() > p2.getPrioridade())
						   return 1;
						else if (p1.getPrioridade() < p2.getPrioridade())
						   return -1;
						
						return 0;	*/						
						return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
					}
				}
		);
		filaPrioridadePaciente2.add(new Paciente("A",2));
		filaPrioridadePaciente2.add(new Paciente("B",1));
		filaPrioridadePaciente2.add(new Paciente("C",3));
		System.out.println(filaPrioridadePaciente);
		
		

	}

}