package control;

import java.util.*;

import model.*;


public class ControleCanais {
	private List<Canal> canais;
	private List<UsuarioPremium> listaUsuarioP;
	
	
	public ControleCanais(ControleDados d) {
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
	
	public boolean cadastrarCanal(String[] dados) {
		if(Integer.parseInt(dados[0]) < 0) {
			Canal channel = new Canal(dados[1], Integer.parseInt(dados[2]), new ArrayList<>());
			canais.add(channel);
		}else {
			Canal channel = new Canal(dados[1], Integer.parseInt(dados[2]), canais.get(Integer.parseInt(dados[0])).getListaProgramas()); 
			canais.set(Integer.parseInt(dados[0]), channel);
		}
		return true;
	}
	public void excluirCanal(int posicao) {
		canais.remove(posicao);
	}
}
