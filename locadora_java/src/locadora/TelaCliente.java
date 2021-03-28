package locadora;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaCliente {
	private JPanel panel;
	private CardLayout cardLayout;
	private JPanel painelCont;
	
	public TelaCliente(CardLayout cardLayout,JPanel painelCont) {
		this.painelCont=painelCont;
		this.cardLayout=cardLayout;
		initialize();
	}

	private void initialize() {

		
		panel = new JPanel();
		panel.setBounds(200, 200, 550, 400);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(240, 31, 89, 23);
		panel.add(lblNewLabel);
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(painelCont, "3");
			}
		});
		btnCriar.setBounds(214, 84, 104, 23);
		panel.add(btnCriar);
		
		
		JButton btnSelecionar = new JButton("Selecionar");
		btnSelecionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(painelCont, "4");
			}
		});
		btnSelecionar.setBounds(214, 125, 104, 23);
		panel.add(btnSelecionar); 
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(painelCont, "5");
			}
		});
		btnAtualizar.setBounds(214, 169, 104, 23);
		panel.add(btnAtualizar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(painelCont, "6");
			}
		});
		btnDeletar.setBounds(214, 214, 104, 23);
		panel.add(btnDeletar);

		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.setBounds(377, 322, 141, 23);
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
