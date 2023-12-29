import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String matricula, nome, situacao, turma;
		double teste, prova, media;
		
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Informe a matrícula: ");
			matricula = teclado.next();
			
			System.out.println("Informe o nome: ");
			nome = teclado.next();
			
			System.out.println("Informe a turma: ");
			turma = teclado.next();
			
			System.out.println("Informe a nota do teste: ");
			teste = teclado.nextDouble();
			
			System.out.println("Informe a nota da prova: ");
			prova = teclado.nextDouble();
			
			media = (teste + prova) /2;
			
			if(media > 5) {
				situacao = "Aprovado";
			} else {
				situacao = "Recuperação";
			}
			
			System.out.println("-------------------------------");
			System.out.println("Matrícula: " + matricula);
			System.out.println("Nome: " + nome);
			System.out.println("Media: " + media);
			System.out.println("Situação: " + situacao);
			System.out.println("-------------------------------");
		}
	}

}
