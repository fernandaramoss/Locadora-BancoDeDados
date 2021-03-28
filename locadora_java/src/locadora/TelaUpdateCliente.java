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

public class TelaUpdateCliente {
	private JPanel panel;
	private CardLayout cardLayout;
	private JPanel painelCont;
	private JTextField textField;
	private JTextField textField_1;
	
	private ClienteController controller;
	private JTextField textFieldNovoNome;
	private JTextField textFieldCpfCliente;
	private JTextField textFieldNovoEnde;
	private JTextField textFieldNovoTelefone;
	
	public TelaUpdateCliente(CardLayout cardLayout,JPanel painelCont) {
		this.painelCont=painelCont;
		this.cardLayout=cardLayout;
		initialize();
	}

	private void initialize() {
		controller= new ClienteController();
		
		panel = new JPanel();
		panel.setBounds(200, 200, 550, 400);
		panel.setLayout(null);
		
		JLabel lbLabelAtualizar = new JLabel("Atualizar");
		lbLabelAtualizar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbLabelAtualizar.setBounds(227, 11, 97, 14);
		panel.add(lbLabelAtualizar);   
		
		JLabel lblNewLabelNovoNome_1 = new JLabel("Novo Nome");
		lblNewLabelNovoNome_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabelNovoNome_1.setBounds(10, 45, 97, 14);
		panel.add(lblNewLabelNovoNome_1);
		
		textFieldNovoNome = new JTextField();
		textFieldNovoNome.setBounds(10, 70, 173, 20);
		panel.add(textFieldNovoNome);
		textFieldNovoNome.setColumns(10);
		
		JLabel lblLabelCpf = new JLabel("Cpf cliente");
		lblLabelCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLabelCpf.setBounds(207, 45, 173, 14);
		panel.add(lblLabelCpf);
		
		textFieldCpfCliente = new JTextField();
		textFieldCpfCliente.setBounds(194, 70, 173, 20);
		panel.add(textFieldCpfCliente);
		textFieldCpfCliente.setColumns(10);
		
		JButton btnAtualizarNome = new JButton("Atualizar nome");
		btnAtualizarNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.updateClienteNome(textFieldNovoNome.getText(),textFieldCpfCliente.getText());
			}
		});
		btnAtualizarNome.setBounds(10, 101, 163, 23);
		panel.add(btnAtualizarNome);
		
		JLabel lblNewLabelNovoEnde = new JLabel("Novo endere\u00E7o");
		lblNewLabelNovoEnde.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabelNovoEnde.setBounds(10, 128, 97, 14);
		panel.add(lblNewLabelNovoEnde);
		
		textFieldNovoEnde = new JTextField();
		textFieldNovoEnde.setColumns(10);
		textFieldNovoEnde.setBounds(10, 157, 173, 20);
		panel.add(textFieldNovoEnde);
		
		JButton btnAtualizarEnde = new JButton("Atualizar endere\u00E7o");
		btnAtualizarEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.updateClienteEnd(textFieldNovoEnde.getText(),textFieldCpfCliente.getText());
			}
		});
		btnAtualizarEnde.setBounds(10, 188, 163, 23);
		panel.add(btnAtualizarEnde);
		
		JLabel lblNovoTelefone = new JLabel("Novo telefone");
		lblNovoTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNovoTelefone.setBounds(10, 215, 97, 14);
		panel.add(lblNovoTelefone);
		
		textFieldNovoTelefone = new JTextField();
		textFieldNovoTelefone.setColumns(10);
		textFieldNovoTelefone.setBounds(10, 240, 173, 20);
		panel.add(textFieldNovoTelefone);
		
		JButton btnAtualizarTelefone = new JButton("Atualizar telefone");
		btnAtualizarTelefone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.updateClienteTel(Integer.parseInt(textFieldNovoTelefone.getText()),textFieldCpfCliente.getText());
			}
		});
		btnAtualizarTelefone.setBounds(10, 270, 163, 23);
		panel.add(btnAtualizarTelefone);
		
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
