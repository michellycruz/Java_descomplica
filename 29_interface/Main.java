class Main {
  public static void main(String[] args) {
    Conta cp = new Poupanca();
    cp.depositar(850);
    cp.sacar(8);
    cp.getSaldo();
    
    System.out.println(cp.getSaldo());
  }
}