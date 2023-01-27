package view;

import controle.*;

public class TelaIniciar {
	private static ControleDados dados = new ControleDados();
	
	public static void main(String[] args) {
		new TelaIniciar();
		new TelaLogin(dados);
	}
}
