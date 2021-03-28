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

public class TelaDeletCliente {
	private JPanel panel;
	private CardLayout cardLayout;
	private JPanel painelCont;
	private JTextField textFieldCpfCliente;
	
	private ClienteController controller;
	
	public TelaDeletCliente(CardLayout cardLayout,JPanel painelCont) {
		this.painelCont=painelCont;
		this.cardLayout=cardLayout;
		initialize();
	}

	private void initialize() {
		controller= new ClienteController();
		
		panel = new JPanel();
		panel.setBounds(200, 200, 550, 400);
		panel.setLayout(null);
		
		
		textFieldCpfCliente = new JTextField();
		textFieldCpfCliente.setBounds(10, 101, 185, 20);
		panel.add(textFieldCpfCliente);
		textFieldCpfCliente.setColumns(10);
		
		JLabel lblDeleteCliente = new JLabel("Cpf cliente");
		lblDeleteCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeleteCliente.setBounds(10, 66, 185, 14);
		panel.add(lblDeleteCliente);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(textFieldCpfCliente.getText());
				controller.deleteClienteValue(textFieldCpfCliente.getText());
			}
		});
		btnDeletar.setBounds(10, 287, 104, 23);
		panel.add(btnDeletar);
		
		
		
		JLabel lblDeletar = new JLabel("Deletar");
		lblDeletar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDeletar.setBounds(242, 11, 80, 14);
		panel.add(lblDeletar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(painelCont, "2");
			}
		});
		btnVoltar.setBounds(402, 287, 89, 23);
		panel.add(btnVoltar);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.setBounds(380, 341, 141, 23);
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(painelCont, "1");
			}
		});
		panel.add(btnMenuPrincipal);
		
	}
	public JPanel getPanel() {
		return panel;
	}

}
