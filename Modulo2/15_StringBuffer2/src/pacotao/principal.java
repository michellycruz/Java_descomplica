package pacotao;

public class principal {

	public static void main(String[] args) {
		
		String nome = "Michelly";
		String sobreNome = "Cruz";
		String nomeCompleto = nome + sobreNome;
		String nomeComBuffer;
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(nome);
		buffer.append(sobreNome);
		
		nomeComBuffer = buffer.toString();
		
		System.out.println(nomeCompleto);
		System.out.println(nomeComBuffer);
	}

}
