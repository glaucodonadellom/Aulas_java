package exercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxEditor;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.Printable;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Exercicio1 {

	private JFrame frmClculoDePreo;
	private JTextField textValorVenda;
	private JLabel lblEscolhaAForma;
	private JLabel lblPreoFinalA;
	private JTextField textPrecoFinal;
	private JButton buttonLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 window = new Exercicio1();
					window.frmClculoDePreo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClculoDePreo = new JFrame();
		frmClculoDePreo.setTitle("Cálculo de preço final");
		frmClculoDePreo.setBackground(Color.GRAY);
		frmClculoDePreo.setBounds(100, 100, 450, 180);
		frmClculoDePreo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClculoDePreo.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Cartão,Chegue,Dinheiro");
		panel.setBounds(7, 3, 435, 140);
		frmClculoDePreo.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblValor = new JLabel("Entre com o valor da venda :");
		lblValor.setBounds(12, 5, 239, 35);
		panel.add(lblValor);
		
		textValorVenda = new JTextField();
		textValorVenda.setBounds(250, 13, 114, 20);
		panel.add(textValorVenda);
		textValorVenda.setColumns(10);
		
		lblEscolhaAForma = new JLabel("Escolha a forma de pagamento:");
		lblEscolhaAForma.setBounds(12, 39, 239, 35);
		panel.add(lblEscolhaAForma);
		
		lblPreoFinalA = new JLabel("Preço final a pagar :");
		lblPreoFinalA.setBounds(12, 64, 239, 35);
		panel.add(lblPreoFinalA);
		
		textPrecoFinal = new JTextField();
		textPrecoFinal.setColumns(10);
		textPrecoFinal.setBounds(250, 72, 114, 20);
		panel.add(textPrecoFinal);
		
		JComboBox comboBoxTipoPag = new JComboBox();
		comboBoxTipoPag.setModel(new DefaultComboBoxModel(new String[] {"Cartão", "Cheque", "Dinheiro"}));
		comboBoxTipoPag.setBounds(250, 44, 119, 20);
		panel.add(comboBoxTipoPag);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			double desc, valorReceb,valorTotal;
			int tipoPag;
			
			public void actionPerformed(ActionEvent e) {
				
				valorReceb = Double.parseDouble(textValorVenda.getText());
				tipoPag = comboBoxTipoPag.getSelectedIndex();
										
				switch (tipoPag) {
				case 0:
					desc = -0.10;
					break;
				case 1:
					desc = -0.05;
					break;
				case 2:
					desc = 0.05;
					break;
				}
				valorTotal = valorReceb-(valorReceb*desc);
				
				textPrecoFinal.setText(String.valueOf(valorTotal));
			}
		});
		btnCalcular.setBounds(22, 103, 117, 25);
		panel.add(btnCalcular);
		
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorVenda.setText(null);
				comboBoxTipoPag.setSelectedItem(0);
				textPrecoFinal.setText(null);				
			}
		});
		buttonLimpar.setBounds(247, 103, 117, 25);
		panel.add(buttonLimpar);
	}
}
