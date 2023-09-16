import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> animais = new LinkedList <>();

    animais.add("Cachorro");
    animais.add("Papagaio");
    animais.add("Hamster");
    System.out.println("LinkedList: " + animais);

    animais.add(0, "Gato");
    System.out.println("LinkedList: " + animais);
  }
}