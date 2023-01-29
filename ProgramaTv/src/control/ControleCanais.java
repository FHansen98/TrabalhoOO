package control;

import java.util.*;

import model.*;


public class ControleCanais {
	private List<Canal> canais;
	private List<UsuarioPremium> listaUsuarioP;
	private static ControleDados dados;
	
	
	public ControleCanais(ControleDados d) {
		dados = d;
		canais = d.getCanais();
		listaUsuarioP = d.getListaUsuarioP();
		
	}
	public String[] getListaCanaisFavoritos(int id) {
		String[] canaisFavoritos = {};
		for(var usuario:listaUsuarioP) {
			if(usuario.getId() == id) {
				canaisFavoritos = new String[usuario.getListaCanaisFavoritos().size()];
				for(int i = 0; i<usuario.getListaCanaisFavoritos().size(); i++) {
					canaisFavoritos[i] = (""+usuario.getListaCanaisFavoritos().get(i).getNome());
				}
				return canaisFavoritos;
			}
		}
		return canaisFavoritos;
	}

	
	public String[] getListaCanais() {
		String[] listaCanais = new String[canais.size()];
		for(int i = 0; i<canais.size(); i++) {
			listaCanais[i] = (""+canais.get(i).getNome());
		}
		return listaCanais;
	}
	public String[] getNumeroListaCanais() {
		String[] listaCanais = new String[canais.size()];
		for(int i = 0; i<canais.size(); i++) {
			listaCanais[i] = (""+canais.get(i).getNumero());
		}
		return listaCanais;
	}
}
