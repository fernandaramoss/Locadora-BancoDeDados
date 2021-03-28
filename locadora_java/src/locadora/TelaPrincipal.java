package locadora;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;

public class TelaPrincipal {

	public JFrame frame = new JFrame("Locadora");
	public JPanel panelConst = new JPanel();
	public JPanel panelFirst = new JPanel();

	CardLayout cardLayout = new CardLayout(); 
	private final JLabel titulo = new JLabel("Bem vindo a Locadora");
	private final JButton botaoCliente = new JButton("Cliente");
	private final JButton botaoFilme = new JButton("Filme");
	private final JButton botaoLocador = new JButton("Locador");
	private final JButton botaoLocacao = new JButton("Loca\u00E7\u00E3o");
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame.setBounds(200, 200, 550, 400);
		
		panelConst.setLayout(cardLayout);
		panelFirst.setLayout(null);
		
		panelConst.add(panelFirst, "1");
		TelaCliente cliente=new TelaCliente(cardLayout,panelConst);
		panelConst.add(cliente.getPanel(), "2");
		TelaCriarCliente criarCliente=new TelaCriarCliente(cardLayout,panelConst);
		panelConst.add(criarCliente.getPanel(), "3");
		TelaSelectCliente selectCliente=new TelaSelectCliente(cardLayout,panelConst);
		panelConst.add(selectCliente.getPanel(), "4");
		TelaUpdateCliente updateCliente=new TelaUpdateCliente(cardLayout,panelConst);
		panelConst.add(updateCliente.getPanel(), "5");
		TelaDeletCliente deleteCliente=new TelaDeletCliente(cardLayout,panelConst);
		panelConst.add(deleteCliente.getPanel(), "6");
		
		
		titulo.setBounds(210, 39, 131, 14);
		panelFirst.add(titulo);
		
		botaoCliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.show(panelConst, "2");
			}
		});
		botaoCliente.setBounds(173, 95, 197, 23);
		panelFirst.add(botaoCliente);
		
		botaoFilme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoFilme.setBounds(173, 139, 197, 23);
		panelFirst.add(botaoFilme);
		
		botaoLocador.setBounds(173, 185, 197, 23);
		panelFirst.add(botaoLocador);
		
		botaoLocacao.setBounds(173, 230, 193, 23);
		panelFirst.add(botaoLocacao);
		
		cardLayout.show(panelConst, "1");
		
		frame.getContentPane().add(panelConst);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}

}
