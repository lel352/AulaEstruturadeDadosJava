package loaine.estruturadados.vetor;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1,"B");
		System.out.println(arrayList);
		
		if (arrayList.contains("A")) {
			System.out.println("Elemento existe no Arraylist");
		}
		else {
			System.out.println("Elemento não existe no Arraylist");
		}
		
		int pos = arrayList.indexOf("B"); //indice
		if (pos > -1) {
			System.out.println("Elemento existe no Arraylist");
		}
		else {
			System.out.println("Elemento não existe no Arraylist");
		}
		
		pos = arrayList.indexOf("D"); //indice
		if (pos > -1) {
			System.out.println("Elemento existe no Arraylist");
		}
		else {
			System.out.println("Elemento não existe no Arraylist");
		}
		
		System.out.println(arrayList.get(2));
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println(arrayList);
		
		arrayList.remove("C");
		System.out.println(arrayList);
		arrayList.remove(1);
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		
		
		
			

	}

}
