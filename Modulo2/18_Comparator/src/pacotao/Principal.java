package pacotao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		
			ArrayList<String> listaNomes = new ArrayList<>();
			listaNomes.add("Oswaldo");
			listaNomes.add("Gisele");
			listaNomes.add("Giovanna");
			listaNomes.add("Giulianna");
			listaNomes.add("Luana");
			
			System.out.println("Elementos antes da ordenação:");		
			for (int i = 0; i < listaNomes.size(); i++) {
				System.out.println(listaNomes.get(i));
			}
			
			Comparator<String> comparator = Collections.reverseOrder();
			
			Collections.sort(listaNomes, comparator);
			
			System.out.println("Elementos depois da operação:");
			for(String nome: listaNomes)
				System.out.println(nome);
	}
}