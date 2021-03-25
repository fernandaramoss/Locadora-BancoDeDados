package locadora;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ClienteController {
	//INSERT
	public void insertClienteValue(String nomeCampo,String nomeCampo2,String nomeCampo3, String nomeCampo4){ 
		Connection connection = null;
    	Statement statement = null;
    	
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
			String query= "INSERT INTO cliente(nome_cliente,end_cliente,cpf_cliente,tel_cliente) Values ('" + nomeCampo + "','" + nomeCampo2 + "','" + nomeCampo3 +",'" +nomeCampo4 + "')";
				statement = connection.createStatement();
				statement.executeUpdate(query);
				System.out.println("Inserção de dados Concluída");

		}catch (Exception e) {
				e.printStackTrace();
		}
   }	
	//SELECT tabela cliente
	public void selectClienteTable(){   
		Connection connection = null;
    	Statement statement = null;
		ResultSet res =null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "SELECT * FROM cliente";
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
	//SELECT por cpf_cliente
	public void selectClienteCpf(String cpf){   
		Connection connection = null;
    	Statement statement = null;
		ResultSet res =null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "SELECT * FROM cliente WHERE cpf_cliente='" + cpf + "'";
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
	
	//UPDATE nome cliente
	public void updateClienteNome( String novoNome,String nomeAntigo){
		Connection connection = null;
    	Statement statement = null;
    	
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
			String query= "UPDATE cliente SET nome_cliente='" + novoNome + "'" + " WHERE nome_cliente='" + nomeAntigo + "'" ;
				statement = connection.createStatement();
				statement.executeUpdate(query);
				System.out.println("atualização concluída");


		}catch (Exception e) {
				e.printStackTrace();
		}
		
   }	
	//UPDATE endereço cliente
		public void updateClienteEnd(String endeNovo,String endeAntigo){
			Connection connection = null;
	    	Statement statement = null;
	    	
			Conexao obj_conexao = new Conexao();
			connection = obj_conexao.getConexao();
		
			try {
				String query= "UPDATE cliente SET nome_cliente='" + endeNovo + "'" + " WHERE nome_filme='" + endeAntigo + "'" ;
					statement = connection.createStatement();
					statement.executeUpdate(query);
					System.out.println("atualização concluída");


			}catch (Exception e) {
					e.printStackTrace();
			}
			
	   }	
		//UPDATE telefone cliente
				public void updateClienteTel( int telNovo,int telAntigo){
					Connection connection = null;
			    	Statement statement = null;
			    	
					Conexao obj_conexao = new Conexao();
					connection = obj_conexao.getConexao();
				
					try {
						String query= "UPDATE cliente SET nome_cliente='" + telNovo + "'" + " WHERE nome_filme='" + telAntigo + "'" ;
							statement = connection.createStatement();
							statement.executeUpdate(query);
							System.out.println("atualização concluída");


					}catch (Exception e) {
							e.printStackTrace();
					}
					
			   }	
   //DELETE
	public void deleteClienteValue(String cpf){
		Connection connection = null;
    	Statement statement = null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "DELETE FROM cliente WHERE cpf_cliente='" + cpf + "'";  
				statement = connection.createStatement();
				 statement.executeUpdate(query);	
				System.out.println("Cliente deletado com sucesso");

		}catch (Exception e) {
				e.printStackTrace();
		}
		
   }	

}
