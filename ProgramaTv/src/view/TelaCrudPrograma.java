package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


import controle.*;

public class TelaCrudPrograma implements ActionListener {
	private ControleDados d = new ControleDados();
	private JFrame janela = new JFrame("Programação televisão");
	private JLabel titulo = new JLabel("Adicionar Programa");
	private JTextField nome , numero;
	private JLabel  nomeLabel , numeroLabel;
	private JButton salvar = new JButton("Salvar");
	private JButton excluir = new JButton("Excluir");
	private JButton add = new JButton("Add");
	private JButton menu = new JButton("Menu");
	private int p;
	
	public TelaCrudPrograma (ControleDados d, int posicao) {
		this.p=posicao;
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(130, 10, 270, 30);
		janela.setLayout(null);
		janela.setSize(500, 400);
		// fecha o programa quando o usuario fecha o programa
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		if(posicao == -1) {
			nome = new JTextField(null);
			numero = new JTextField(null);
			add.setBounds(150, 160, 200, 30);
			janela.add(add);
		}else {
			nome = new JTextField("canal");//new ControleCanais(d).getListaCanais().get(posicao)
			numero = new JTextField("numero");
			salvar.setBounds(170, 160, 90, 30);
			janela.add(salvar);
			excluir.setBounds(260, 160, 90, 30);
			janela.add(excluir);
		}
		menu.setBounds(150, 200, 200, 30);
		janela.add(menu);
		
		nomeLabel = new JLabel(" Nome :");
		numeroLabel = new JLabel(" Número : ");
		
		janela.add(titulo);
		janela.add(nomeLabel);
		janela.add(nome);
		janela.add(numeroLabel);
		janela.add(numero);
		nomeLabel.setBounds(100 , 70 , 90 , 30);
		nome.setBounds(170 , 70 , 200 , 30);
		
		numeroLabel.setBounds(100 , 110 , 90 , 30);
		numero.setBounds(170 , 110 , 200 , 30);
		
		add.addActionListener(this);
		menu.addActionListener(this);
		salvar.addActionListener(this);
		excluir.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == menu) {
			new TelaCrud(d);
			janela.dispose();
		}
	}
}
