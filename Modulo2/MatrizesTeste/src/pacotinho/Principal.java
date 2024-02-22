package pacotinho;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] total = new int[10];
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Escreva um número inteiro");
			int numero = ler.nextInt();
			total[i] = numero;
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(total[i] + " ");
		}
	}

}
