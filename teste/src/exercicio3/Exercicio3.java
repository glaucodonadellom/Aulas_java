package exercicio3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.NumberFormatter;

public class Exercicio3 {

	private JFrame frmSorveteria;
	private JTextField textQtdFruta;
	private JTextField textPreFruta;
	private JTextField textQtdChoco;
	private JTextField textPreChoco;
	private JTextField textQtdBola;
	private JTextField textPreBola;
	private JTextField textQtdPote;
	private JTextField textPrePote;
	private JTextField textTotal;
	private double total, preco;
	private int qtd ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 window = new Exercicio3();
					window.frmSorveteria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSorveteria = new JFrame();
		frmSorveteria.setTitle("Sorveteria");
		frmSorveteria.setBounds(100, 100, 450, 300);
		frmSorveteria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSorveteria.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de Sorvete");
		lblNewLabel.setBounds(12, 12, 123, 15);
		frmSorveteria.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Qtd");
		lblNewLabel_1.setBounds(181, 12, 70, 15);
		frmSorveteria.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Preço Unitário");
		lblNewLabel_2.setBounds(286, 12, 123, 15);
		frmSorveteria.getContentPane().add(lblNewLabel_2);
		
		textQtdFruta = new JTextField();
		textQtdFruta.addFocusListener(getQuantidadeFocusListner());
		textQtdFruta.setText("0");
		textQtdFruta.setToolTipText("");
		textQtdFruta.setBounds(156, 39, 120, 20);
		frmSorveteria.getContentPane().add(textQtdFruta);
		textQtdFruta.setColumns(10);
		
		textPreFruta = new JTextField();
		textPreFruta.addFocusListener(getPrecoFocusListner());
		textPreFruta.setText("0");
		textPreFruta.setToolTipText("");
		textPreFruta.setColumns(10);
		textPreFruta.setBounds(289, 39, 120, 20);
		frmSorveteria.getContentPane().add(textPreFruta);
		
		textQtdChoco = new JTextField();
		textQtdChoco.addFocusListener(getQuantidadeFocusListner());
		textQtdChoco.setText("0");
		textQtdChoco.setToolTipText("");
		textQtdChoco.setColumns(10);
		textQtdChoco.setBounds(156, 64, 120, 20);
		frmSorveteria.getContentPane().add(textQtdChoco);
		
		textPreChoco = new JTextField();
		textPreChoco.addFocusListener(getPrecoFocusListner());
		textPreChoco.setText("0");
		textPreChoco.setToolTipText("");
		textPreChoco.setColumns(10);
		textPreChoco.setBounds(289, 64, 120, 20);
		frmSorveteria.getContentPane().add(textPreChoco);
		
		textQtdBola = new JTextField();
		textQtdBola.addFocusListener(getQuantidadeFocusListner());
		textQtdBola.setText("0");
		textQtdBola.setToolTipText("");
		textQtdBola.setColumns(10);
		textQtdBola.setBounds(156, 89, 120, 20);
		frmSorveteria.getContentPane().add(textQtdBola);
		
		textPreBola = new JTextField();
		textPreBola.addFocusListener(getPrecoFocusListner());
		textPreBola.setText("0");
		textPreBola.setToolTipText("");
		textPreBola.setColumns(10);
		textPreBola.setBounds(289, 89, 120, 20);
		frmSorveteria.getContentPane().add(textPreBola);
		
		textQtdPote = new JTextField();
		textQtdPote.addFocusListener(getQuantidadeFocusListner());
		textQtdPote.setText("0");
		textQtdPote.setHorizontalAlignment(SwingConstants.LEFT);
		textQtdPote.setToolTipText("");
		textQtdPote.setColumns(10);
		textQtdPote.setBounds(156, 121, 120, 20);
		frmSorveteria.getContentPane().add(textQtdPote);
		
		textPrePote = new JTextField();
		
		textPrePote.setText("0");
		textPrePote.addFocusListener(getPrecoFocusListner());
		textPrePote.setHorizontalAlignment(SwingConstants.LEFT);
		textPrePote.setToolTipText("");
		textPrePote.setColumns(10);
		textPrePote.setBounds(289, 121, 120, 20);
		frmSorveteria.getContentPane().add(textPrePote);
		
		textTotal = new JTextField();
		textTotal.setText("0");
		textTotal.setColumns(10);
		textTotal.setBounds(289, 153, 120, 20);
		frmSorveteria.getContentPane().add(textTotal);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textQtdBola.setText("0");
				textQtdChoco.setText("0");
				textQtdFruta.setText("0");
				textQtdPote.setText("0");
				
				textPreBola.setText("0");
				textPreChoco.setText("0");
				textPreFruta.setText("0");
				textPrePote.setText("0");
				
				textTotal.setText("0");
			}
		});
		btnLimpar.setBounds(292, 210, 117, 25);
		frmSorveteria.getContentPane().add(btnLimpar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				preco = stringToDouble(textPreBola.getText());
				qtd = Integer.parseInt(textQtdBola.getText());
				total += preco*qtd;
				preco = stringToDouble(textPreFruta.getText());
				qtd = Integer.parseInt(textQtdFruta.getText());
				total += preco*qtd;
				preco = stringToDouble(textPreChoco.getText());
				qtd = Integer.parseInt(textQtdChoco.getText());
				total += preco*qtd;
				preco = stringToDouble(textPrePote.getText());
				qtd = Integer.parseInt(textQtdPote.getText());
				total += preco*qtd;
				String strTotal = String.valueOf(total).replace(".", ",");
				textTotal.setText(strTotal);
		}
	});
		
		btnCalcular.setBounds(159, 210, 117, 25);
		frmSorveteria.getContentPane().add(btnCalcular);
		
		JLabel lblFrutas = new JLabel("Sorvete de frutas");
		lblFrutas.setBounds(12, 39, 137, 15);
		frmSorveteria.getContentPane().add(lblFrutas);
		
		JLabel lblChocolatefrutas = new JLabel("Chocolate/Frutas");
		lblChocolatefrutas.setBounds(12, 66, 127, 15);
		frmSorveteria.getContentPane().add(lblChocolatefrutas);
		
		JLabel lblBolas = new JLabel("Bola");
		lblBolas.setBounds(12, 91, 70, 15);
		frmSorveteria.getContentPane().add(lblBolas);
		
		JLabel lblPoteLitros = new JLabel("Pote 2 Litros");
		lblPoteLitros.setBounds(12, 123, 123, 15);
		frmSorveteria.getContentPane().add(lblPoteLitros);
		
		JLabel lblTotalAPagar = new JLabel("Total a Pagar");
		lblTotalAPagar.setBounds(156, 155, 120, 18);
		frmSorveteria.getContentPane().add(lblTotalAPagar);
	}
	private double stringToDouble(String text) {
		text = text.replace(",", ".");
		return Double.parseDouble(text);
	}
	private FocusListener getPrecoFocusListner() {
		return new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				JTextField component = (JTextField)e.getComponent();
				String text = component.getText();
				text = text.replaceAll("[^\\d,]", "");
				text = text.replace(".", "");
				if(text.trim().isEmpty()) {
					component.setText("0");
				}else {
					component.setText(text);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				JTextField component = (JTextField)e.getComponent();
				component.setText("");
			}
		};
	}

	private FocusListener getQuantidadeFocusListner() {
		return new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				JTextField component = (JTextField)e.getComponent();
				String text = component.getText();
				try {
					Integer.parseInt(text);
				} catch (Exception e2) {
					component.setText("0");
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				JTextField component = (JTextField)e.getComponent();
				component.setText("");
			}
		};
	}
}