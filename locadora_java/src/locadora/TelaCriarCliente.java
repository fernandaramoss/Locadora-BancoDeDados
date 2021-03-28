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

public class TelaCriarCliente {
	private JPanel panel;
	private CardLayout cardLayout;
	private JPanel painelCont;
	private JTextField textFieldNome;
	private JTextField textFieldEnde;
	private JTextField textFieldCpf;
	private JTextField textFieldTel;
	
	private ClienteController controller;
	
	public TelaCriarCliente(CardLayout cardLayout,JPanel painelCont) {
		this.painelCont=painelCont;
		this.cardLayout=cardLayout;
		initialize();
	}

	private void initialize() {
		controller= new ClienteController();
		
		panel = new JPanel();
		panel.setBounds(200, 200, 550, 400);
		panel.setLayout(null);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.setBounds(380, 341, 141, 23);
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(painelCont, "1");
			}
		});
		panel.add(btnMenuPrincipal);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(10, 26, 185, 20);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 57, 69, 14);
		panel.add(lblNewLabel_1);
		
		textFieldEnde = new JTextField();
		textFieldEnde.setBounds(10, 71, 86, 20);
		panel.add(textFieldEnde);
		textFieldEnde.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 102, 46, 14);
		panel.add(lblNewLabel_2);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(10, 120, 86, 20);
		panel.add(textFieldCpf);
		textFieldCpf.setColumns(10);
		 
		JLabel lblNewLabel_3 = new JLabel("Telefone");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 151, 69, 14);
		panel.add(lblNewLabel_3);
		
		textFieldTel = new JTextField();
		textFieldTel.setBounds(10, 168, 86, 20);
		panel.add(textFieldTel);
		textFieldTel.setColumns(10);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(textFieldNome.getText());
				controller.insertClienteValue(textFieldNome.getText(), textFieldEnde.getText(), textFieldCpf.getText(),Integer.parseInt(textFieldTel.getText()));
			}
		});
		btnInserir.setBounds(10, 287, 104, 23);
		panel.add(btnInserir);
		
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
