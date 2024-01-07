import discentes.AlunoSuperior;

public class Principal {

	public static void main(String[] args) {

		//public pode ser usado em qualquer lugar do programa
		//private pode ser usado dentro da classe
		//protected pode ser usado na classe e nas outras classes que a estendem 
		//default é o padrão, pode ser usado nas classes, nas suas filhas e em outras classes que estejam no mesmo pacote
		
			AlunoSuperior aluno = new AlunoSuperior();
			
			//aluno.nome = "Michelly";
			aluno.setNome("Michelly");
			
			//aluno.teste = 9;
			aluno.setTeste(9);
			//aluno.prova = 8;
			aluno.setProva(8);
			
			System.out.println(aluno.getMedia());

	}

}
