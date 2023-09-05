import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> bandas = new ArrayList<String>();

    bandas.add("Beatles");
    bandas.add("Kiss");
    bandas.add("Guns N' Roses");

    System.out.println(bandas);

    bandas.add(bandas.indexOf("Kiss"), "CPM 22");
    System.out.println(bandas);

    bandas.remove("Kiss");
    System.out.println(bandas);
  }
}