import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Cadastrar aluno");
    System.out.println("2 - Cadastrar nota");
    System.out.println("3 - Listar alunos e notas");

    int numero = entrada.nextInt();

    switch(numero){
      case 1:
        System.out.println("Cadastro de aluno");
        break;
      case 2:
        System.out.println("Cadastro de nota");
        break;
      case 3:
        System.out.println("Listagem de alunos e notas");
        break;
      default:
        System.out.println("Opção inválida");
    }
  }
}