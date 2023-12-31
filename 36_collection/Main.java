import java.util.ArrayList;
import java.util.Iterator;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();
    numeros.add(1);
    numeros.add(3);
    numeros.add(2);

    System.out.println("ArrayList: " + numeros);


    //criando uma instância de Iterator
    Iterator<Integer> it = numeros.iterator();

    int numero = it.next();
    System.out.println("Elemento: " + numero); //vai mostrar o primeiro número do ArrayList

    while(it.hasNext()){
      it.forEachRemaining((value) -> System.out.print(value + ", "));
    } // vai mostrar separando por virgula, os números que sobraram e não foram mostrados
  }
}