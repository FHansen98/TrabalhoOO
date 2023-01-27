package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controle.*;

public class TelaCrud implements ActionListener, ListSelectionListener {
	
	private JFrame janela = new JFrame("CRUD");
	private JLabel tituloCanais = new JLabel("Canais");
	private JLabel tituloProgramas = new JLabel("Programas");
	private JButton sair = new JButton("Sair");
	private JButton addCanal = new JButton("Add");
	private JButton addPrograma = new JButton("Add");
	private JList<String> listaCanais;
	private JList<String> listaProgramas;
	private static ControleDados dados;
	
	public TelaCrud(ControleDados d) {
		dados=d;
//		(posição do eixo x, posição no eixo y, tamanho do bloco na posição x, tamanho do bloco no eixo y)
		tituloCanais.setFont(new Font("Arial", Font.BOLD, 20));
		tituloCanais.setBounds(40, 20, 150, 30);
		tituloProgramas.setFont(new Font("Arial", Font.BOLD, 20));
		tituloProgramas.setBounds(270, 10, 200, 50);
		sair.setBounds(150, 520, 200, 30);
		addCanal.setBounds(40, 450, 100, 30);
		addPrograma.setBounds(270, 450, 100, 30);
		listaCanais = new JList<String>(new ControleCanais(d).getListaCanais());
		listaCanais.setBounds(40, 65, 190, 370);
		listaCanais.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaCanais.setVisibleRowCount(10);
		listaCanais.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		listaProgramas = new JList<String>(new ControleProgramas(d).getAllListaProgramas());
		listaProgramas.setBounds(270, 65, 190, 370);
		listaProgramas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaProgramas.setVisibleRowCount(10);
		listaProgramas.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		janela.setLayout(null);
		janela.add(tituloCanais);
		janela.add(tituloProgramas);
		janela.add(sair);
		janela.add(addCanal);
		janela.add(addPrograma);
		janela.add(listaCanais);
		janela.add(listaProgramas);
//		 define o tamanho da janela 
		janela.setSize(500, 600);
		// fecha o programa quando o usuario fecha o programa
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		sair.addActionListener(this);
		addCanal.addActionListener(this);
		addPrograma.addActionListener(this);
		listaCanais.addListSelectionListener(this);
	}
	
//	public static void main(String[] args) {
//		new TelaCrud(d);
//	}
	

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == sair) {
			new TelaLogin(dados);
			janela.dispose();
		}
		if(src == addCanal) {
			new TelaCrudCanal(dados, -1);
			janela.dispose();
		}
		if(src == addPrograma) {
			new TelaCrudPrograma(dados, -1);
			janela.dispose();
		}
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == listaCanais) {
			new TelaCrudCanal(dados, listaCanais.getSelectedIndex());
			janela.dispose();
		}
	}

}

