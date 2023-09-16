class Main {
  public static void main(String[] args) {
    String primeira = "Java";
    String segunda = "C#";
    String terceira = new String("Python");

    System.out.println(primeira);
    System.out.println(segunda);
    System.out.println(terceira);

    //comparar strings
    boolean result = primeira.equals(segunda);
    
    System.out.println("A primeira string é igual a segunda? " + result);

    result = segunda.equals(terceira);

    System.out.println("A segunda string é igual a terceira? " + result);
  }
}