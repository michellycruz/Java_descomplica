package pacotasso;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Digite o denominador: ");
			int valor = scanner.nextInt();
			
			int resultado = 1000/valor;
			System.out.println(resultado);
			
		} catch (ArithmeticException e){			
			System.out.println("ArithmeticException => " + e.getMessage());
			
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException => " + e.getMessage());
			
		} catch (Exception e) {
			System.out.println("Exception => " + e.getMessage());
			
		} finally {
			System.out.println("Fim");
		}
	}
}
