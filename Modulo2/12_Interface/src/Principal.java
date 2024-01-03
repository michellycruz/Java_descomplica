
public class Principal {

	public static void main(String[] args) {
		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();
		
		alunoEnsinoMedio.nome = "Marcos";
		alunoEnsinoMedio.teste = 8;
		alunoEnsinoMedio.prova = 9;
		
		System.out.println("Aluno do Ensino Médio: ");
		System.out.println("Nome: " + alunoEnsinoMedio.nome);
		System.out.println("Média: " + alunoEnsinoMedio.getMedia());
		
		alunoEnsinoSuperior.nome = "Luana";
		alunoEnsinoSuperior.teste = 8;
		alunoEnsinoSuperior.prova = 9;
		
		System.out.println("Aluno do Ensino Superior: ");
		System.out.println("Nome: " + alunoEnsinoSuperior.nome);
		System.out.println("Média: " + alunoEnsinoSuperior.getMedia());
	}

}
