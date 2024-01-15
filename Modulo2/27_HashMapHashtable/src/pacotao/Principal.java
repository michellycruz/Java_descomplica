package pacotao;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

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
		
		System.out.println("HASHMAP");
		
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
		
		System.out.println("==========================================");
		System.out.println("LINKEDHASHMAP");
		
		LinkedHashMap<String, String> listaNomes = new LinkedHashMap<>();
		listaNomes.put("Mich", "Michelly");
		listaNomes.put("gisa", "Gisele");
		listaNomes.put("gigi", "Giovanna");
		listaNomes.put("giugiu", "Giulianna");
		
		System.out.println("LinkedHashMap: " + listaNomes);
		
		LinkedHashMap<String, String> novaListaNomes = new LinkedHashMap<>(listaNomes);
		novaListaNomes.put("Jubis", "Jujuba");
		System.out.println("Nova LinkedHashMap: " + novaListaNomes);
		
		System.out.println("==========================================");
		System.out.println("TREEMAP");
		
		TreeMap<String, String> mapaNomes = new TreeMap<>();
		mapaNomes.put("Mich", "Michelly");
		mapaNomes.put("gisa", "Gisele");
		mapaNomes.put("gigi", "Giovanna");
		mapaNomes.put("giugiu", "Giulianna");
		
		System.out.println("TreeMap de Nomes: " + mapaNomes);
		
		System.out.println("Chaves: " + mapaNomes.keySet());
		System.out.println("Valores: " + mapaNomes.values());
		System.out.println("Chave/Valor: " + mapaNomes.entrySet());
	}
}














