package pacote;

public class Main {
	public static void main (String[] args) {
		String nome = "Michelly";
		String nomeGuerra = "Michelly";
		String sobreNome = new String("Michelly");
		
		if(nome.equals(nomeGuerra)) {
			System.out.println("Os nomes são iguais");
			System.out.println(nome.charAt(0));
			System.out.println(nome.concat(" Cruz"));
			System.out.println(nome);}
		else 
			System.out.println("Os nomes são diferentes");
		
		if(nome.equals(sobreNome)) {
			System.out.println("Nomes iguais");
			System.out.println(nome);}
		else
			System.out.println("Nomes diferentes");
	}
}


// == compara a localização / .equals() compara o conteúdo