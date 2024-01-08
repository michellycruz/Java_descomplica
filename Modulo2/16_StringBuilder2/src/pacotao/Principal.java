package pacotao;

public class Principal {

	public static void main(String[] args) {
		
		String nome = "Michelly";
		String sobreNome = "Cruz";
		String nomeCompleto = nome + sobreNome;
		String nomeComBuffer;
		
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(nome);
		buffer.append(sobreNome);
		
		nomeComBuffer = buffer.toString();
		
		System.out.println(nomeCompleto);
		System.out.println(nomeComBuffer);
	}

}
