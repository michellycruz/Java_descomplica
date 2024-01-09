package pacotao;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
			List<String> listaNome = new ArrayList<>();
			listaNome.add("Oswaldo");
			listaNome.add("Gisele");
			listaNome.add("Giovanna");
			listaNome.add("Giulianna");
			
			for(String nome: listaNome) {
				System.out.println(nome);
			}
			
			
	}
}