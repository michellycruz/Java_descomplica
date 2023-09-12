class Main {
  public static void main(String[] args) {
    Pessoa p = new Pessoa();
    p.nome = "João";
    p.rg = "12345678";
    System.out.println(p.nome + " " + p.rg);

    Vendedor v = new Vendedor();
    v.nome = "Maria";
    v.rg = "12345667";
    v.comissao = 9.4;
    System.out.println(v.nome + " " + v.rg + " " + v.comissao);
    
  }
}