package pacotinho;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int total = 0;
		
		for(int i = 0; i < 10 ; i++) {
			System.out.println("Digite um valor inteiro");
			int numero = ler.nextInt();
			total += numero;
		}
		
		System.out.println("O valor da soma dos números inteiro é " + total);
	}

}
