package locadora;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaSelectCliente {
	private JPanel panel;
	private CardLayout cardLayout;
	private JPanel painelCont;
	private JTextField textField;
	private JTextField textField_1;
	
	private ClienteController controller;
	private JTextField textFieldCpf;
	
	public TelaSelectCliente(CardLayout cardLayout,JPanel painelCont) {
		this.painelCont=painelCont;
		this.cardLayout=cardLayout;
		initialize();
	}

	private void initialize() {
		controller= new ClienteController();
		
		panel = new JPanel();
		panel.setBounds(200, 200, 550, 400);
		panel.setLayout(null);
		
		JLabel lbLabelSelecionar = new JLabel("Selecionar");
		lbLabelSelecionar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbLabelSelecionar.setBounds(227, 11, 97, 14);
		panel.add(lbLabelSelecionar); 
		
		JLabel lblNewLabelTodosCliente = new JLabel("Cliente");
		lblNewLabelTodosCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabelTodosCliente.setBounds(10, 27, 78, 14);
		panel.add(lblNewLabelTodosCliente);
		
		JButton btnSelecionarTodosCliente = new JButton("Selecionar todos os clientes");
		btnSelecionarTodosCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.selectClienteTable();
			}
		});
		btnSelecionarTodosCliente.setBounds(10, 52, 173, 23);
		panel.add(btnSelecionarTodosCliente);
		
		JLabel lblNewLabelPorCpf = new JLabel("Por cpf");
		lblNewLabelPorCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabelPorCpf.setBounds(10, 102, 46, 14);
		panel.add(lblNewLabelPorCpf);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(10, 131, 173, 20);
		panel.add(textFieldCpf);
		textFieldCpf.setColumns(10);
		
		JButton btnSelecionarPorCpf = new JButton("Selecionar cliente");
		btnSelecionarPorCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(textFieldCpf.getText());
				controller.selectClienteCpf(textFieldCpf.getText());		
			}
		});
		btnSelecionarPorCpf.setBounds(10, 162, 173, 23);
		panel.add(btnSelecionarPorCpf);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.setBounds(380, 341, 141, 23);
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(painelCont, "1");
			}
		});
		panel.add(btnMenuPrincipal);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(painelCont, "2");
			}
		});
		btnVoltar.setBounds(402, 287, 89, 23);
		panel.add(btnVoltar);
		
	}
	public JPanel getPanel() {
		return panel;
	}

}
