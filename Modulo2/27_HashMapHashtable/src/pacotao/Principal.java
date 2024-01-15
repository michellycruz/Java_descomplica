package pacotao;

import java.util.HashMap;
import java.util.Hashtable;

public class Principal {

	public static void main(String[] args) {
		HashMap<Integer, String> linguagensProgramacao = new HashMap<>();
		linguagensProgramacao.put(1, "C++");
		linguagensProgramacao.put(2, "Java");
		linguagensProgramacao.put(3, "Cobol");
		System.out.println("Conteúdo do HashMap: " + linguagensProgramacao);
		
		String valor = linguagensProgramacao.get(2);
		System.out.println("Elemento da chave 2: " + valor);
		
		
		System.out.println("==========================================");
		
		System.out.println("Conteúdo do HashMap: " + linguagensProgramacao);
		
		System.out.println("Chaves: " + linguagensProgramacao.keySet());
		System.out.println("Valores: " + linguagensProgramacao.values());
		System.out.println("Chave/valor: " + linguagensProgramacao.entrySet());
		
		System.out.println("==========================================");
		
		System.out.println("HASHTABLE");
		
		Hashtable<Integer, String> linguagensProgramacao2 = new Hashtable<>();
		linguagensProgramacao2.put(1, "C++");
		linguagensProgramacao2.put(2, "Java");
		linguagensProgramacao2.put(3, "Cobol");
		System.out.println("Conteúdo do Hashtable: " + linguagensProgramacao2);
		
		String valorHash = linguagensProgramacao2.get(2);
		System.out.println("Elemento da chave 2: " + valorHash);
	}
}