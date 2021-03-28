package locadora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao{
	String url = "jdbc:postgresql://localhost:5432/locadora";
    String usuario = "postgres";
    String senha= "6283";
    
	public Connection getConexao(){    //metodo que vai realmente conectar
		try {
			System.out.println("Conexão Realizada com sucesso!");
			return DriverManager.getConnection(url,usuario,senha);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}


