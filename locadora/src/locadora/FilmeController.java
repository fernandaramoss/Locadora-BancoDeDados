package locadora;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class FilmeController {
	//INSERT
	public void insertFilmeValue(String nomeCampo,String nomeCampo2,String nomeCampo3){ 
		Connection connection = null;
    	Statement statement = null;
    	
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
			String query= "INSERT INTO filme(nome_filme,cod_filme,genero)" + "Values ('" + nomeCampo + "','" + nomeCampo2 + "','" + nomeCampo3 +  "')";
				statement = connection.createStatement();
				statement.executeUpdate(query);
				System.out.println("Inserção de dados Concluída");

		}catch (Exception e) {
				e.printStackTrace();
		}
   }	
	//SELECT tabela filme
	public void selectFilmeTable(){   
		Connection connection = null;
    	Statement statement = null;
		ResultSet res =null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "SELECT * FROM filme";
				statement = connection.createStatement();
				res = statement.executeQuery(query);
				ResultSetMetaData rsmd = res.getMetaData();
				while (res.next()) {
					System.out.println("----------------");
					for(int i=1;i<=rsmd.getColumnCount();i++) {
				        String columnValue = res.getString(i);
				        System.out.println(columnValue);
					}
				}

		}catch (Exception e) {
				e.printStackTrace();
		}
   }
	//SELECT por cod_filme
	public void selectFilmeCod(int cod){   
		Connection connection = null;
    	Statement statement = null;
		ResultSet res =null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "SELECT * FROM filme WHERE cod_filme='" + cod + "'";
				statement = connection.createStatement();
				res = statement.executeQuery(query);
				ResultSetMetaData rsmd = res.getMetaData();
				while (res.next()) {
					System.out.println("----------------");
					for(int i=1;i<=rsmd.getColumnCount();i++) {
				        String columnValue = res.getString(i);
				        System.out.println(columnValue);
					}
				}

		}catch (Exception e) {
				e.printStackTrace();
		}
   }	
	//SELECT por genero
		public void selectFilmeGenero(String genero){   
			Connection connection = null;
	    	Statement statement = null;
			ResultSet res =null;
			
			Conexao obj_conexao = new Conexao();
			connection = obj_conexao.getConexao();
		
			try {
					String query= "SELECT * FROM filme WHERE genero='" + genero + "'";
					statement = connection.createStatement();
					res = statement.executeQuery(query);
					ResultSetMetaData rsmd = res.getMetaData();
					while (res.next()) {
						System.out.println("----------------");
						for(int i=1;i<=rsmd.getColumnCount();i++) {
					        String columnValue = res.getString(i);
					        System.out.println(columnValue);
						}
					}

			}catch (Exception e) {
					e.printStackTrace();
			}
	   }	
	//UPDATE
	public void updateFilmeValue( String novoNome,String nomeAntigo){
		Connection connection = null;
    	Statement statement = null;
    	
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
			String query= "UPDATE filme SET nome_filme='" + novoNome + "'" + " WHERE nome_filme='" + nomeAntigo + "'" ;
				statement = connection.createStatement();
				statement.executeUpdate(query);
				System.out.println("atualização concluída");


		}catch (Exception e) {
				e.printStackTrace();
		}
		
   }	
   //DELETE
	public void deleteFilmeValue(int value){
		Connection connection = null;
    	Statement statement = null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "DELETE FROM filme WHERE cod_filme='" + value + "'";  
				statement = connection.createStatement();
				 statement.executeUpdate(query);	
				System.out.println("Filme deletado com sucesso");

		}catch (Exception e) {
				e.printStackTrace();
		}
		
   }	

}
