class Desenho {
//sobrecarga = métodos com o mesmo nome, com assinaturas diferentes
  
  //método sem parâmetros
  public void mostrar(){
    for(int i = 0; i < 10; i++){
      System.out.println("*");
    }
  }
  //método com um parâmetro
  public void mostrar(char simb){
    for(int i = 0; i < 10; i++){
      System.out.println(simb);
    }
  }
  //método com três parâmetros
  public void mostrar(char simb, int n){
    for(int i = 0; i < n; i++){
      System.out.println(simb);
    }
  }
}


class Main {
  public static void main(String[] args) {
    Desenho d1 = new Desenho();

    d1.mostrar();
    d1.mostrar('%');
    d1.mostrar('&', 3);
  }
}