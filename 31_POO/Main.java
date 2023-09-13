class Main {
  public static void main(String[] args) {
    Cachorro bulldog = new Cachorro();
    bulldog.setNome("Thor");

    Gato siames = new Gato();
    siames.setNome("Agatha");

    bulldog.mostrar();
    bulldog.Comer();
    System.out.println("---------------------");
    siames.mostrar();
    siames.Comer();
  }
}