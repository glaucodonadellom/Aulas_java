package exercicio4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Exercicio4 {
	private JFrame frm;
	private JTextField textValorVenda;
	private JTextField textFinal;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 window = new Exercicio4();
					window.frm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */private void initialize() {
			frm = new JFrame();
			frm.setTitle("Preço FInal");
			frm.setBounds(100, 100, 450, 300);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frm.getContentPane().setLayout(null);
			
			JLabel lblEntreComO = new JLabel("Entre com o valor da venda");
			lblEntreComO.setBounds(30, 12, 207, 15);
			frm.getContentPane().add(lblEntreComO);
			
			JLabel lblPreoFinalDa = new JLabel("Preço final da compra");
			lblPreoFinalDa.setBounds(30, 98, 207, 15);
			frm.getContentPane().add(lblPreoFinalDa);
			
			textValorVenda = new JTextField();
			textValorVenda.setBounds(255, 10, 160, 20);
			frm.getContentPane().add(textValorVenda);
			textValorVenda.setColumns(10);
			
			textFinal = new JTextField();
			textFinal.setBounds(255, 94, 160, 20);
			frm.getContentPane().add(textFinal);
			textFinal.setColumns(10);
			
			ButtonGroup groupFormaPagamento = new ButtonGroup();
			
			JRadioButton rdbtnDinheiro = new JRadioButton("Dinheiro");
			rdbtnDinheiro.setToolTipText("");
			rdbtnDinheiro.setBounds(30, 46, 106, 23);
			frm.getContentPane().add(rdbtnDinheiro);
			groupFormaPagamento.add(rdbtnDinheiro);
			
			JRadioButton rdbtnCartao = new JRadioButton("Cartão");
			rdbtnCartao.setToolTipText("");
			rdbtnCartao.setBounds(165, 46, 106, 23);
			frm.getContentPane().add(rdbtnCartao);
			groupFormaPagamento.add(rdbtnCartao);
			
			JRadioButton rdbtnCheque = new JRadioButton("Cheque");
			rdbtnCheque.setToolTipText("");
			rdbtnCheque.setBounds(283, 46, 106, 23);
			frm.getContentPane().add(rdbtnCheque);
			groupFormaPagamento.add(rdbtnCheque);
			
			JButton btnCalcular = new JButton("Calcular");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String valorVendaTxt = String.valueOf(textValorVenda.getText());
					double valor = Double.parseDouble(valorVendaTxt);

					if(rdbtnCheque.isSelected()) {
						valor = valor + (valor*0.05);
						valorVendaTxt = String.valueOf(valor);
						textFinal.setText(valorVendaTxt);
					}
					if(rdbtnCartao.isSelected()) {
						valor = valor + (valor*0.10);
						valorVendaTxt = String.valueOf(valor);
						textFinal.setText(valorVendaTxt);
					}
					if(rdbtnDinheiro.isSelected()) {
						valor = valor - (valor*0.05);
						valorVendaTxt = String.valueOf(valor);
						textFinal.setText(valorVendaTxt);
					}
					
					
				}
			});
			btnCalcular.setBounds(108, 160, 117, 25);
			frm.getContentPane().add(btnCalcular);
			
			JButton btnLimpar = new JButton("Limpar");
			btnLimpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textFinal.setText(null);
					textValorVenda.setText(null);
					rdbtnCartao.setSelected(false);
					rdbtnCheque.setSelected(false);
					rdbtnDinheiro.setSelected(false);
					
				}
			});
			btnLimpar.setBounds(283, 160, 117, 25);
			frm.getContentPane().add(btnLimpar);
		}
	}