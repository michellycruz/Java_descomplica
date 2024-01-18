package pacotao;
import connection.Connection;
import connection.DriverManager;

public class Principal {

	public static void main(String[] args) {
		final String usuario = "postgres";
		final String senha = "admin123";
		final String url = "jdbc:postgresql://localhost/postgres";
		final String driverBanco = "org.postgresql.Driver";
		
		try {
				Class.forName(driverBanco);
				Connection conexao = DriverManager.getConnection(url, usuario, senha);
						
				System.out.println("Conexão realizada com sucesso");
				
		}catch(Exception exception) {
			System.out.println("Erro na conexão com o Banco de Dados");
		}
	}
}