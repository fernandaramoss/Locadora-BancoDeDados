package locadora;

public class Aplicacao {
	public static void main(String[] args) {
    	FilmeController filmeController = new FilmeController();
    	ClienteController clienteController = new ClienteController();
    	LocadorController locadorController = new LocadorController();
    	LocacaoController locacaoController = new LocacaoController();
    	
    	  
//    	//CLIENTE
		 clienteController.insertClienteValue("marias joana", "rua f","123.456.789.21",33333333);	
		 clienteController.selectClienteTable();
		 clienteController.selectClienteCpf("123.456.789.21");
		 clienteController.updateClienteNome("maria","123.456.789.21");
		 clienteController.updateClienteEnd("rua b","123.456.789.21");
		 clienteController.updateClienteTel(444444444,"123.456.789.10");
		 clienteController.deleteClienteValue("123.456.789.21");
		 
//         //FILME
		 filmeController.insertFilmeValue("minha mãe é uma peça", "13","comédia");	
		 filmeController.selectFilmeTable();
		 filmeController.selectFilmeCod(1);
		 filmeController.selectFilmeGenero("terror");
		 filmeController.updateFilmeValue("minha mãe é uma peça2",1);
		 filmeController.deleteFilmeValue(4);
		 
		 //LOCADOR
		 locadorController.insertLocadorValue("jefersom", "rua 45","4578457845",1,"admin","admin");	
		 locadorController.selectLocadorTable();
		 locadorController.selectLocadorId(1);
		 locadorController.updateLocadorSenha("admin","4578457845");
		 locadorController.updateLocadorEnd("rua b","4578457845");
		 locadorController.deleteLocadorValue(1);
		 
//		 //LOCACAO
		 locacaoController.insertLocacaoValue("123.456.789.11",4.0,1,4,1);	
		 locacaoController.selectLocacaoTable();
		 locacaoController.selectLocacaoId(1);
		 locacaoController.updateLocacaoPrazo(1,2);
		 locacaoController.updateLocacaoValor(1.1,1);
		 locacaoController.deleteLocacaoValue(1);
		 
    }
}
