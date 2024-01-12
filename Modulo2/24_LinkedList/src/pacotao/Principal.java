package pacotao;

import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
			List<String> listaNome = new LinkedList<>();
			listaNome.add("Oswaldo");
			listaNome.add("Gisele");
			listaNome.add("Giovanna");
			listaNome.add("Giulianna");
			listaNome.add(0, "Lucas");
			
			System.out.println("Antes");
			
			for(String nome: listaNome) {
				System.out.println(nome);
			}
			
			listaNome.set(1, "Jujuba");
			
			System.out.println();
			System.out.println();
			
			System.out.println("Depois");
			
			for(String nome: listaNome) {
				System.out.println(nome);
			}
	}
}

/*
LinkedList
Um LinkedList é ordenado pela posição do índice, como ArrayList, exceto que os elementos estão duplamente vinculados um ao outro. Esse vínculo fornece novos métodos (além do que você obtém da interface de lista) para adicionar e remover do início ou do fim, o que facilita a implementação de uma pilha ou fila. A lista vinculada tem um conceito de nós e dados. Aqui o Nó está armazenando valores do próximo no enquanto os dados armazenam o valor que está mantendo.


addFirst() ou offerFirst() -> Para adicionar elementos ao início de uma lista

addLast() ou offerLast() ou add() -> Para adicionar elementos ao final da lista

getFirst() ou peekFirst() -> Para obter o primeiro elemento da lista

getLast() ou peekLast() -> Para obter o último elemento da lista

removeFirst() ou pollFirst() ou remove() -> Para remover o primeiro elemento da lista

removeLast() ou pollLast() -> Para remover o último elemento da lista.

 */
