import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> estados = new ArrayList<>();

    estados.add("Espirito Santo");
    estados.add("Minas Gerais");
    estados.add("Mato Grosso do Sul");
    estados.add("Paraná");
    
      System.out.println(estados.contains("Paraná"));
}