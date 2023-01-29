package view;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;

import control.*;
import model.Programa;


public class TelaProgramas implements ActionListener, ListSelectionListener {
	private ControleDados dados;
	private ControleProgramas controleP;
	private JFrame janela = new JFrame("Canais de TV");
	private JLabel titulo = new JLabel("Lista de Programas");
	private JLabel onAir = new JLabel("Programas On Air");
	private JLabel programaData;
	private JLabel buscalabel = new JLabel("Buscar Programa"); // titulo
	private JButton voltar = new JButton("Voltar");
	private JButton menu = new JButton("Menu");
	private JButton busca = new JButton("Buscar"); // botão
	private JTextField buscaprograma;
	private JList<String> listaProgramas;
	private int p;
	private String page;
	private int id;
	private JCheckBox nome, data;
	private ArrayList<Programa> listaProgramaData = new ArrayList<>();
	
	public TelaProgramas(int id, ControleDados d, int posicao, String pagina) {
		dados = d;
		controleP = new ControleProgramas(dados);
		this.id = id;
		this.p = posicao;
		this.page = pagina;
		
		data = new JCheckBox("Data");
		nome = new JCheckBox("Nome");
		JLabel descricao = new JLabel(d.getCanais().get(p).toString());
		buscaprograma = new JTextField(null);
		
		if(page == "canais") {
			listaProgramas = new JList<String>(new ControleProgramas(d).getNomeListaProgramas(p));
			janela.add(voltar);
			janela.add(descricao);
		}else if(page == "favoritos"){
			listaProgramas = new JList<String>(new ControleProgramas(d).getNomeListaProgramasFavoritos(id, p));
			janela.add(voltar);
		}else if(page == "onAir"){
			listaProgramas = new JList<String>(new ControleProgramas(d).getNomeListaProgramasOnAir());
			janela.add(onAir);
			janela.add(menu);
			janela.add(busca);
			janela.add(buscalabel);
			janela.add(buscaprograma);
			janela.add(data);
			janela.add(nome);
		}else{
			programaData = new JLabel("Programas: " + page);
			listaProgramaData = controleP.getBuscaDatasPrograma(pagina);
			String[] listaCanaisData = new String[listaProgramaData.size()];
			for(int i = 0; i<listaProgramaData.size(); i++) {
				listaCanaisData[i] = (""+listaProgramaData.get(i).getNome());
			}
			listaProgramas = new JList<String>(listaCanaisData);
			janela.add(voltar);
			janela.add(programaData);
			programaData.setFont(new Font("Arial", Font.BOLD, 17));
			programaData.setBounds(260, 50, 250, 70);
			page = "programasData";
		}
		descricao.setBounds(260, 20, 220, 120);
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(145, 10, 250, 30);
		onAir.setFont(new Font("Arial", Font.BOLD, 17));
		onAir.setBounds(275, 50, 250, 70);
		voltar.setBounds(300, 220, 120, 30);
		menu.setBounds(300, 290, 120, 25);
		busca.setBounds(310, 240, 100, 20);
		buscalabel.setBounds(275, 150, 150, 20);
		
		data.setBounds(290 , 210 , 75 , 20);
		nome.setBounds(370 , 210 , 75 , 20);
		ButtonGroup group = new ButtonGroup();
		group.add(data);
		group.add(nome);

		buscaprograma.setBounds(275 , 175 , 180 , 30);
		
		//(posição do eixo x, posição no eixo y, tamanho do bloco na posição x, tamanho do bloco no eixo y)
		listaProgramas.setBounds(50, 65, 200, 250);
		listaProgramas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaProgramas.setVisibleRowCount(10);
		listaProgramas.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(listaProgramas);
		// define o tamanho da janela 
		janela.setSize(500, 400);
		// fecha o programa quando o usuario fecha o programa
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		busca.addActionListener( this );
		voltar.addActionListener(this);
		menu.addActionListener(this);
		listaProgramas.addListSelectionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		String valorbuscaprograma = buscaprograma.getText();
		if(src == voltar) {
			if(page == "programasData") {
				new TelaProgramas(id, dados, 0, "onAir");
				janela.dispose();
			}else {
				new TelaCanais(id, dados, page);
				janela.dispose();
			}
		}
		if(src == menu) {
			new TelaMenu(id, dados);
			janela.dispose();
		}
		if(src == busca) {
			if(nome.isSelected()) {
				int[] tam = new int[3];
				tam = controleP.getBuscaPrograma(valorbuscaprograma);
				if(tam[0]>=0) {
					new TelaDetalhes(id, dados, controleP.getListaProgramas(tam[0]), tam[1]);
					janela.dispose();
				}
				else  {
					JOptionPane.showMessageDialog(null,  "Programa não encontrado!",
							null, JOptionPane.ERROR_MESSAGE);
				}
			}else if(data.isSelected()) {
				ArrayList<Programa> listaProgramaData = new ArrayList<>();
				listaProgramaData = controleP.getBuscaDatasPrograma(valorbuscaprograma);
				if(listaProgramaData.size()>0) {
					new TelaProgramas(id, dados, 0, valorbuscaprograma);
					janela.dispose();
				}
				else  {
					JOptionPane.showMessageDialog(null,  "Programas não encontrados nesta data!",
							null, JOptionPane.ERROR_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(null,  "Todos os dados sao obrigatorios!",
						null, JOptionPane.ERROR_MESSAGE);	
			}
		}
	}
	
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		ControleProgramas controleP = new ControleProgramas(dados);
		if(e.getValueIsAdjusting() && src == listaProgramas) {
			if(page == "canais") {
				new TelaDetalhes(id, dados, controleP.getListaProgramas(p), listaProgramas.getSelectedIndex());
				janela.dispose();				
			}else if(page == "onAir") {
				new TelaDetalhes(id, dados, controleP.getListaProgramasOnAir(), listaProgramas.getSelectedIndex());
				janela.dispose();	
			}else if(page == "favoritos") {
				new TelaDetalhes(id, dados, controleP.getListaProgramasFavoritos(id, p), listaProgramas.getSelectedIndex());
				janela.dispose();
			}else {
				String[] listaCanaisData = new String[listaProgramaData.size()];
				for(int i = 0; i<listaProgramaData.size(); i++) {
					listaCanaisData[i] = (""+listaProgramaData.get(i));
				}
				new TelaDetalhes(id, dados, listaCanaisData, listaProgramas.getSelectedIndex());
				janela.dispose();	
			}
			
		}

	}
	
	
}