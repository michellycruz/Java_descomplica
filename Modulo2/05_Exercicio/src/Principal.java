import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite o valor da nota 1: ");
		nota1 = input.nextDouble();
		System.out.println("Digite o valor da nota 2: ");
		nota2 = input.nextDouble();
		System.out.println("Digite o valor da nota 3: ");
		nota3 = input.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 7) {
			System.out.println("Media: " + media);
			System.out.println("Aluno aprovado");
		} else if (media < 7 && media > 4) {
			System.out.println("Nota: " + media);
			System.out.println("Aluno de recuperação");
		} else {
			System.out.println("Nota: " + media);
			System.out.println("Aluno reprovado");
		}

	}

}
