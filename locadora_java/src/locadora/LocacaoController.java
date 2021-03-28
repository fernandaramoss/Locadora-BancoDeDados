package locadora;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class LocacaoController {
	//INSERT
	public void insertLocacaoValue(String cpf,double valor,int cod_locacao,int prazo,int id_locador){ 
		Connection connection = null;
    	Statement statement = null;
    	
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
			String query= "INSERT INTO locacao(cpf_cliente,valor,id_locacao,prazo,id_locador) Values ('" + cpf + "','" + valor + "','" + id_locador +"','" +prazo +"','" +id_locador + "')";
				statement = connection.createStatement();
				statement.executeUpdate(query);
				System.out.println("Inserção de dados Concluída");

		}catch (Exception e) {
				e.printStackTrace();
		}
   }	
	//SELECT tabela locacao
	public void selectLocacaoTable(){   
		Connection connection = null;
    	Statement statement = null;
		ResultSet res =null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "SELECT * FROM locacao";
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
	//SELECT por id_locacao
	public void selectLocacaoId(int id){   
		Connection connection = null;
    	Statement statement = null;
		ResultSet res =null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "SELECT * FROM locacao WHERE id_locacao='" + id + "'";
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
	
	//UPDATE por prazo
	public void updateLocacaoPrazo( int prazoNovo, int idLocacao){
		Connection connection = null;
    	Statement statement = null;
    	
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
			String query= "UPDATE locacao SET prazo='" + prazoNovo + "'" + " WHERE id_locacao='" + idLocacao + "'" ;
				statement = connection.createStatement();
				statement.executeUpdate(query);
				System.out.println("atualização concluída");


		}catch (Exception e) {
				e.printStackTrace();
		}
		
   }	
	//UPDATE por valor
		public void updateLocacaoValor(double valorNovo, int idLocacao){
			Connection connection = null;
	    	Statement statement = null;
	    	
			Conexao obj_conexao = new Conexao();
			connection = obj_conexao.getConexao();
		
			try {
				String query= "UPDATE locacao SET valor='" + valorNovo + "'" +  " WHERE id_locacao='" + idLocacao + "'" ;
					statement = connection.createStatement();
					statement.executeUpdate(query);
					System.out.println("atualização concluída");


			}catch (Exception e) {
					e.printStackTrace();
			}
			
	   }	
		
   //DELETE
	public void deleteLocacaoValue(int id){
		Connection connection = null;
    	Statement statement = null;
		
		Conexao obj_conexao = new Conexao();
		connection = obj_conexao.getConexao();
	
		try {
				String query= "DELETE FROM locacao WHERE id_locacao='" + id + "'";  
				statement = connection.createStatement();
				 statement.executeUpdate(query);	
				System.out.println("Cliente deletado com sucesso");

		}catch (Exception e) {
				e.printStackTrace();
		}
		
   }	

}
