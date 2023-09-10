public class Cao{
  String nome;
  String cor;
  int idade;
  double peso;

  public Cao(){
    cor = "camarelo";
  }

  public Cao(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  
  public void Apresentacao(){
    System.out.println("A cor do cachorrinho é " + cor);
  }

  public void DadosCao(){
    System.out.println("O nome dele é " + nome + "  e ele tem " + idade + " anos de idade.");
  }
}