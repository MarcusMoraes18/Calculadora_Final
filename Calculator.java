import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel painel;
	private JTextField telinha;
	double primeiro;
	double segundo;
	double resultado;
	String operacion;
	String resposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 620);
		painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painel);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +zero.getText();
				telinha.setText(EnterNumber);
			}
		});
		zero.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton ponto = new JButton(".");
		ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +ponto.getText();
				telinha.setText(EnterNumber);	
			}
		});
		ponto.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiro = Double.parseDouble(telinha.getText());
				telinha.setText("");
				operacion = "/";
			}
			
		});
		div.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String resposta;
			segundo = Double.parseDouble(telinha.getText());
			if (operacion == "+")
			{
				resultado = primeiro + segundo;
				resposta = String.format("%.2f", resultado);
				telinha.setText(resposta);
			}
			else if (operacion == "-") {
				resultado = primeiro - segundo;
				resposta = String.format("%.2f", resultado);
				telinha.setText(resposta);
			}
			
			else if (operacion == "*") {
				resultado = primeiro * segundo;
				resposta = String.format("%.2f", resultado);
				telinha.setText(resposta);
			}
			
			else if (operacion == "/") {
				resultado = primeiro / segundo;
				resposta = String.format("%.2f", resultado);
				telinha.setText(resposta);
			}
			}
		});
	
		igual.setFont(new Font("Tahoma", Font.PLAIN, 48));
		
		JButton um = new JButton("1");
		um.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +um.getText();
				telinha.setText(EnterNumber);
			}
		});
		um.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton dois = new JButton("2");
		dois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +dois.getText();
				telinha.setText(EnterNumber);
			}
		});
		dois.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +tres.getText();
				telinha.setText(EnterNumber);
			}
		});
		tres.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton mult = new JButton("*");
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiro = Double.parseDouble(telinha.getText());
				telinha.setText("");
				operacion = "*";
			}
		});
		mult.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton soma = new JButton("+");
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiro = Double.parseDouble(telinha.getText());
				telinha.setText("");
				operacion = "+";
			}
		});
		soma.setFont(new Font("Tahoma", Font.PLAIN, 48));
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +seis.getText();
				telinha.setText(EnterNumber);
			}
		});
		seis.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +cinco.getText();
				telinha.setText(EnterNumber);
			}
		});
		cinco.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton quatro = new JButton("4");
		quatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +quatro.getText();
				telinha.setText(EnterNumber);
			}
		});
		quatro.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton sete = new JButton("7");
		sete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +sete.getText();
				telinha.setText(EnterNumber);
			}
		});
		sete.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton oito = new JButton("8");
		oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +oito.getText();
				telinha.setText(EnterNumber);
			}
		});
		oito.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton nove = new JButton("9");
		nove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = telinha.getText() +nove.getText();
				telinha.setText(EnterNumber);
			}
		});
		nove.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiro = Double.parseDouble(telinha.getText());
				telinha.setText("");
				operacion = "-";
			}
		});
		sub.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		telinha = new JTextField();
		telinha.setHorizontalAlignment(SwingConstants.RIGHT);
		telinha.setEditable(false);
		telinha.setFont(new Font("Tahoma", Font.PLAIN, 40));
		telinha.setColumns(10);
		
		JButton Limpar = new JButton("C");
		Limpar.setFont(new Font("Tahoma", Font.PLAIN, 43));
		Limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telinha.setText(null);
			}
		});
		
		JButton ApagaUm = new JButton("<-");
		ApagaUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String ApagaUm=null;
			
			if(telinha.getText().length() > 0 );
			StringBuilder strB = new StringBuilder(telinha.getText());
			strB.deleteCharAt(telinha.getText().length()-1);
			ApagaUm = strB.toString();
			telinha.setText(ApagaUm);
			}
		});
		ApagaUm.setFont(new Font("Tahoma", Font.PLAIN, 44));
		GroupLayout gl_painel = new GroupLayout(painel);
		gl_painel.setHorizontalGroup(
			gl_painel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painel.createSequentialGroup()
					.addGroup(gl_painel.createParallelGroup(Alignment.LEADING)
						.addComponent(telinha, 300, 300, 300)
						.addGroup(gl_painel.createSequentialGroup()
							.addGap(4)
							.addComponent(zero, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ponto, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(div, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(igual, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_painel.createSequentialGroup()
							.addGap(4)
							.addComponent(um, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dois, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tres, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(mult, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_painel.createSequentialGroup()
							.addGap(4)
							.addComponent(quatro, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(seis, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(soma, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_painel.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_painel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_painel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(ApagaUm, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(Limpar, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
								.addGroup(gl_painel.createSequentialGroup()
									.addComponent(sete, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(oito, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(nove, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(sub, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		gl_painel.setVerticalGroup(
			gl_painel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_painel.createSequentialGroup()
					.addComponent(telinha, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_painel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(ApagaUm, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(Limpar, GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_painel.createParallelGroup(Alignment.BASELINE)
						.addComponent(sub, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(nove, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(oito, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(sete, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painel.createParallelGroup(Alignment.BASELINE)
						.addComponent(soma, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(seis, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(quatro, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painel.createParallelGroup(Alignment.BASELINE)
						.addComponent(mult, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(tres, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(dois, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(um, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painel.createParallelGroup(Alignment.BASELINE)
						.addComponent(igual, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(div, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(ponto, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(zero, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		painel.setLayout(gl_painel);
	}
}
