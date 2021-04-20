package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import entities.Fatorial;

public class JanelaPrincipal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8793096896408790672L;

	private JPanel panel;

	private JLabel lblNumPositivo;
	private JTextField txtNumPositivo;
	private JLabel lblFatorial;
	private JTextField txtFatorial;

	private JButton btnCalcular;
	private JButton btnLimpar;

	public JanelaPrincipal() {

		criarComponentes();
		ajustarPropriedadesJanela();

	}

	private void criarComponentes() {

		panel = new JPanel();

		lblNumPositivo = new JLabel("Insere um Número: ");
		lblFatorial = new JLabel("Fatorial: ");

		txtNumPositivo = new JTextField(5);
		txtFatorial = new JTextField(10);
		txtFatorial.setEnabled(true);

		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(this);

		adicionarComponentes();

	}

	private void adicionarComponentes() {

		panel.add(lblNumPositivo);
		panel.add(txtNumPositivo);
		panel.add(lblFatorial);
		panel.add(txtFatorial);
		panel.add(btnCalcular);
		panel.add(btnLimpar);
		add(panel);

	}

	private void ajustarPropriedadesJanela() {
		setVisible(true);
		setTitle("Semana 2 - Fatorial");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void calcular() {

		String numero = txtNumPositivo.getText();
		int resultado = Integer.parseInt(numero);
		
		Fatorial fat = new Fatorial();
		
		String fatorial = fat.fatorialRecursivo(resultado).toString();
		
		txtFatorial.setText(fatorial);

	}

	private void limpar() {
		txtNumPositivo.setText("");
		txtFatorial.setText("");
		btnCalcular.setEnabled(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnCalcular) {
			calcular();
		}

		if (e.getSource() == btnLimpar) {
			limpar();
		}

	}

}
