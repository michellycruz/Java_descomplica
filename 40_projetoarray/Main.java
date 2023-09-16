import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> linguagens = new ArrayList<>();

    linguagens.add("Java");
    linguagens.add("CSharp");
    linguagens.add("Python");
    linguagens.add("JavaScript");

    System.out.println("Linguagens: " + linguagens);

    String[] arr = new String[linguagens.size()];
    System.out.println("Array: ");

    linguagens.toArray(arr);
    for(String item:arr){
      System.out.println(item + ", ");
    }
  }
}