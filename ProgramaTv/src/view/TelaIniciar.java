package view;

import control.*;

public class TelaIniciar {
	private static ControleDados dados = new ControleDados();
	
	public static void main(String[] args) {
		new TelaIniciar();
		new TelaLogin(dados);
	}
}
