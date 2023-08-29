import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random geradorDeNumero = new Random();
    int numeroX = geradorDeNumero.nextInt(100);
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Adivinhe o número que estou pensando");

    int numero = entrada.nextInt();

    if(numero == numeroX){
      System.out.println("Acertou, pensei no " + numeroX);
    } else if (numero > numeroX){
      System.out.println("Errou, pensei em um número menor que " + numero);
      System.out.println("Pensei no " + numeroX);
    } else if (numero < numeroX){
      System.out.println("Errou, pensei em um número maior que o número " + numero);
      System.out.println("Pensei no " + numeroX);
    }
  }
}