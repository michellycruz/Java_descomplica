import java.util.TreeSet;

class Main {
  public static void main(String[] args) {
    TreeSet<Integer> numeros = new TreeSet<>();

    numeros.add(8);
    numeros.add(5);
    numeros.add(2);

    System.out.println("TreeSet: " + numeros);

    boolean result = numeros.remove(5);
    System.out.println("TreeSet: " + numeros);
    System.out.println("O número foi removido? " + result);

    result = numeros.removeAll(numeros);
    System.out.println("TreeSet: " + numeros);
    System.out.println("Todos os números foram removidos? " + result);
  }
}