public class Cao{
  private int idade;

  public void setIdade(int i){
    idade = i; //insere o valor
  }

  public int getIdade(){
    return idade; //retorna o valor
  }
  
  public void Latir(){
    System.out.println("AU-AU");
  }

  public boolean VerificarIdade(){
    if(idade > 10){
      return true;
    } else {
      return false;
    }
  }
}