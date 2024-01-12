package pacotao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("HASHSET");
		System.out.println("-------------------------");
		
			HashSet<String> listaNome = new HashSet<>();
			listaNome.add("Oswaldo");
			listaNome.add("Gisele");
			listaNome.add("Giovanna");
			listaNome.add("Giulianna");
			listaNome.add("Gisele");
			
			for(String nome: listaNome) {
				System.out.println(nome);
			}
			
		System.out.println("-------------------------");
		System.out.println("TREESET");
		System.out.println("-------------------------");
			
			TreeSet<String> listaNome1 = new TreeSet<>();
			listaNome1.add("Oswaldo");
			listaNome1.add("Gisele");
			listaNome1.add("Giovanna");
			listaNome1.add("Giulianna");
			listaNome1.add("Gisele");
			
			Iterator<String> iterator = listaNome1.iterator();
			
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	  }
}






/*
 HashSet
Um conjunto é uma coleção que não pode conter elementos duplicados. O HashSet modela a abstração do conjunto matemático. Ele cria uma coleção que usa uma tabela de hash para armazenamento. Uma tabela de hash armazena informações usando um menanismo chamado hash. No hash, o conteúdo informativo de uma chave é usado para determinar um valor exclusivo, chamado de código de hash. O código hash é tão usado como o índice no qual os dados associados à chave são armazenados. A transformação da chave em seu código de hash é realizada automaticamente.


public boolean add(Object o) -> Adiciona um objeto a um HashSet, se já não estiver presente no HashSet
public boolean remove(Object o) -> Remove um objeto HashSet se encontrado no HashSet.
public boolean contains(Object o) -> Retorna true se o objeto encontrado retornar return false
public boolean isEmpty() -> Retorna true se HashSet estiver vazio; caso contrário, retorne false
public int size() -> Retorna o número de elementos no HashSet
public boolean add(Object o) -> Adiciona um objeto a um HashSet, se já não estiver presente no HashSet.


TreeSet
Cria uma coleção que usa uma árvore para armazenamento. Os objetos são armazenados em ordem crescente e ordenada, de acordo com a ordem natural. Os tempos de acesso e recuperação são bastante rápidos, o que torna o TreeSet uma excelente opção ao armazenar grandes quantidades de informações classificadas que devem ser encontradas rapidamente. O TreeSet pode não ser usadi quando nosso aplicativo requer modificação do conjunto em termos de adição frequente de elementos.


void add(Object o) -> Adiciona o elemento especidicado a este conjunto, se ele ainda não estiver presente.
void clear -> Remove todos os elementos deste conjunto.
Object first() -> Retorna o primeiro elemento (mais baixo) atualmente neste conjunto classificado.
Object last() -> Retorna o último elemento (mais alto) atualmente neste conjunto classificado.
boolean isEmpty() -> Retorna true se este conjunto não contém elementos.
boolean remove(Object o) -> Remove o elemento especificado deste conjunto, se estiver presente.
*/










