package locadora;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class LocadorController {
	//INSERT
	public void insertLocadorValue(String nomeCampo,String nomeCampo2,String nomeCampo3, int nomeCampo4,String nomeCampo5,String nomeCampo6){ 
		Connection connection = null;
    	Statement statement = null;
    	
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
			String query= "INSERT INTO locador(nome_locador,end_locador,cpf_locador,id_locador,logini,senha) Values ('" + nomeCampo + "','" + nomeCampo2 + "','" + nomeCampo3 +"','" +nomeCampo4 + "','" +nomeCampo5 + "','"+ nomeCampo6 + "')";
				statement = connection.createStatement();
				statement.executeUpdate(query);
				System.out.println("Inserção de dados Concluída");

		}catch (Exception e) {
				e.printStackTrace();
		}
   }	
	//SELECT tabela locador
	public void selectLocadorTable(){   
		Connection connection = null;
    	Statement statement = null;
		ResultSet res =null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "SELECT * FROM locador";
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
	
	//SELECT por id_locador
	public void selectLocadorId(int Id){   
		Connection connection = null;
    	Statement statement = null;
		ResultSet res =null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "SELECT * FROM locador WHERE id_locador='" + Id + "'";
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
	
	//UPDATE senha locador
	public void updateLocadorSenha( String novoSenha,String nomeSenha){
		Connection connection = null;
    	Statement statement = null;
    	
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
			String query= "UPDATE locador SET senha='" + novoSenha + "'" + " WHERE senha='" + nomeSenha + "'" ;
				statement = connection.createStatement();
				statement.executeUpdate(query);
				System.out.println("atualização concluída");


		}catch (Exception e) {
				e.printStackTrace();
		}
		
   }	
	//UPDATE endereço cliente
		public void updateLocadorEnd(String endeNovo,String endeAntigo){
			Connection connection = null;
	    	Statement statement = null;
	    	
			Conexao obj_conexao = new Conexao();
			connection = obj_conexao.getConexao();
		
			try {
				String query= "UPDATE locador SET end_locador='" + endeNovo + "'" + " WHERE end_locador='" + endeAntigo + "'" ;
					statement = connection.createStatement();
					statement.executeUpdate(query);
					System.out.println("atualização concluída");


			}catch (Exception e) {
					e.printStackTrace();
			}
			
	   }	
		
   //DELETE
	public void deleteLocadorValue(int id){
		Connection connection = null;
    	Statement statement = null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "DELETE FROM locador WHERE id_locador='" + id + "'";  
				statement = connection.createStatement();
				 statement.executeUpdate(query);	
				System.out.println("Locador deletado com sucesso");

		}catch (Exception e) {
				e.printStackTrace();
		}
		
   }	

}
