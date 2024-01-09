package pacotao;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
			ArrayList<String> listaNome = new ArrayList<>();
			listaNome.add("Oswaldo");
			listaNome.add("Gisele");
			listaNome.add("Giovanna");
			listaNome.add("Giulianna");
			
			System.out.println("Antes");
			
			for(String nome: listaNome) {
				System.out.println(nome);
			}
			
			listaNome.remove(0);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Depois");
			
			for(String nome: listaNome) {
				System.out.println(nome);
			}
	}
}