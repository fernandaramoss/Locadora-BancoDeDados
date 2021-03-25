package locadora;

public class Aplicacao {
	public static void main(String[] args) {
    	FilmeController filmeController = new FilmeController();
    	ClienteController clienteController = new ClienteController();
    	LocadorController locadorController = new LocadorController();
    	LocacaoController locacaoController = new LocacaoController();
    	
    	
    	
    	//FILME
						//switch
						//    	scanf
						//    	scanf
						//    	scanf
		 filmeController.insertFilmeValue("minha mãe é uma peça", "13","comédia");	
		 filmeController.selectFilmeTable();
		 filmeController.selectFilmeCod(1);
		 filmeController.selectFilmeGenero("terror");
		 filmeController.updateFilmeValue("minha mãe é uma peça2","minha mãe é uma peça");
		 filmeController.deleteFilmeValue(4);
		 
		 //CLIENTE
		 clienteController.insertClienteValue("marias joana", "rua f","123.456.789.21","333333333");	
		 clienteController.selectClienteTable();
		 clienteController.selectClienteCpf("123.456.789.21");
		 clienteController.updateClienteNome("maria","marias");
		 clienteController.updateClienteEnd("rua b","rua a");
		 clienteController.updateClienteTel(444444444,333333333);
		 clienteController.deleteClienteValue("123.456.789.21");
		 
		 //LOCADOR
		 locadorController.insertLocadorValue("marias joana", "rua f","123.456.789.21",4,"admin","admin");	
		 locadorController.selectLocadorTable();
		 locadorController.selectLocadorId(1);
		 locadorController.updateLocadorSenha("rua b","rua a");
		 locadorController.updateLocadorEnd("rua b","rua a");
		 locadorController.deleteLocadorValue(1);
		 
		 //LOCACAO
		 locacaoController.insertLocacaoValue("123.456.789.21", 3.5,1,4,5);	
		 locacaoController.selectLocacaoTable();
		 locacaoController.selectLocacaoId(1);
		 locacaoController.updateLocacaoPrazo(1,2);
		 locacaoController.updateLocacaoValor(1.1,1.2);
		 locacaoController.deleteLocacaoValue(1);
		 
    }
}
