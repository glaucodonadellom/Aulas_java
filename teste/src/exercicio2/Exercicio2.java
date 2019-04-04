package exercicio2;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Exercicio2 {

	private JFrame frmCadastramentoDePeoas;
	private JTextField textNome;
	private JTextField textEndereco;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 window = new Exercicio2();
					window.frmCadastramentoDePeoas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastramentoDePeoas = new JFrame();
		frmCadastramentoDePeoas.setTitle("Cadastramento de pessoas");
		frmCadastramentoDePeoas.setBounds(100, 100, 450, 300);
		frmCadastramentoDePeoas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastramentoDePeoas.getContentPane().setLayout(null);
		
		JComboBox comboSexo = new JComboBox();
		comboSexo.setBounds(124, 64, 165, 25);
		comboSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		frmCadastramentoDePeoas.getContentPane().add(comboSexo);
		
		JComboBox comboEstCiv = new JComboBox();
		comboEstCiv.setBounds(124, 91, 165, 25);
		comboEstCiv.setModel(new DefaultComboBoxModel(new String[] {"Casado(a)", "Divorciado(a)", "Solteiro(a)", "União Estável", "Viúvo(a)"}));
		frmCadastramentoDePeoas.getContentPane().add(comboEstCiv);
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(12, 12, 70, 15);
		frmCadastramentoDePeoas.getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(124, 10, 165, 25);
		frmCadastramentoDePeoas.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endereço :");
		lblEndereo.setBounds(12, 39, 115, 15);
		frmCadastramentoDePeoas.getContentPane().add(lblEndereo);
		
		JLabel lblSexo = new JLabel("Sexo :");
		lblSexo.setBounds(12, 69, 115, 15);
		frmCadastramentoDePeoas.getContentPane().add(lblSexo);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil :");
		lblEstadoCivil.setBounds(12, 96, 115, 15);
		frmCadastramentoDePeoas.getContentPane().add(lblEstadoCivil);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(124, 37, 165, 25);
		textEndereco.setColumns(10);
		frmCadastramentoDePeoas.getContentPane().add(textEndereco);
		
		JTextArea TxtArea = new JTextArea();
		TxtArea.setBounds(22, 160, 385, 98);
		frmCadastramentoDePeoas.getContentPane().add(TxtArea);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.setBounds(12, 123, 117, 25);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				TxtArea.setText("Nome : "+ textNome.getText() + "\nEndereço : "+ textEndereco.getText() +"\nSexo : "+ comboSexo.getSelectedItem() + "\nE.C :  " + comboEstCiv.getSelectedItem());
				//TxtArea.setText(textEndereco.getText());
//				TxtArea.setText(comboSexo.getSelectedItem());
//				TxtArea.setText(comboEstCiv.getSelectedItem());
//				
//				System.out.println(textNome.getText());
//				System.out.println();
//				System.out.println(comboSexo.getSelectedItem());
//				System.out.println();
							
			}
		});
		frmCadastramentoDePeoas.getContentPane().add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(155, 123, 117, 25);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textEndereco.setText(null);
				textNome.setText(null);
				comboSexo.setSelectedItem(null);;
				comboEstCiv.setSelectedItem(null);
			}
		});
		frmCadastramentoDePeoas.getContentPane().add(btnLimpar);
				
	}
}
