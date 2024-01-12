package pacotao;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Integer> numerosArrayList = new ArrayList<>();
		numerosArrayList.add(8);
		numerosArrayList.add(5);
		numerosArrayList.add(8);
		System.out.println("ArrayList: " + numerosArrayList);
		
		LinkedHashSet<Integer> numerosLinkedHashSet = new LinkedHashSet<>(numerosArrayList);
		/*System.out.println("LinkedHashSet: " + numerosLinkedHashSet);*/
		numerosLinkedHashSet.addAll(numerosArrayList);
		numerosLinkedHashSet.add(4);
		System.out.println("LinkedHashSer: " + numerosLinkedHashSet);
	}
}