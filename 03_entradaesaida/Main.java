import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Olá, mundo!");
    System.out.println("Informe o seu nome");

    String nome;
    Scanner entrada = new Scanner(System.in);
    nome = entrada.next();

    System.out.println("Qual o nome da sua mãe?");

    String nomemae;
    Scanner nomem = new Scanner(System.in);
    nomemae = nomem.next();

    System.out.println("Nome: " + nome);
    System.out.println("Mãe: " + nomemae);
  }
}