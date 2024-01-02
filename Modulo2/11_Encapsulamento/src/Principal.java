
public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		aluno.setNome("Michelly");
		aluno.teste = 9;
		aluno.prova = 8;
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMedia());
		
		professor.setNome("Oswaldo");
		professor.setSalario(1000);
		
		System.out.println(professor.getNome());
		System.out.println(professor.getInss());
		System.out.println(professor.getSalarioLiquido());
	}

}
