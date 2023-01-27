package controle;

import java.util.*;

import modelo.*;


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
//	
//	public String[] getListaCanaisFavoritosPorId(int id) {
//		String[] listaCanaisFavoritos = {};
//		for(var usuario:listaUsuarioP) 
//			if(Integer.toString(usuario.getId()).equals(Integer.toString(id))) {
//				listaCanaisFavoritos = new String[usuario.getListaCanaisFavoritos().size()];
//				for(int i = 0; i<usuario.getListaCanaisFavoritos().size(); i++) {
//					listaCanaisFavoritos[i] = (""+canais.get(i).getNome());
//				}
//				return listaCanaisFavoritos;
//			}
//		return listaCanaisFavoritos;
//	}
	
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
	
//	public String[] getAllListaProgramas() {
//		int sizeArray = 0;
//		String[] listaProgramas = {};
//		for(int j =0; j<canais.size(); j++) {
//			sizeArray = sizeArray + canais.get(j).getListaProgramas().size();
//		}
//		listaProgramas = new String[sizeArray]; //tamanho 3
//		int index = 0;
//		for(int j =0; j<canais.size(); j++) {
//			for(int i = 0; i<canais.get(j).getListaProgramas().size(); i++) {
//				listaProgramas[index] = (""+canais.get(j).getListaProgramas().get(i).getNome());
//				index ++;
//			}
//		}
//		return listaProgramas;
//	}
//	
//	public String[] getNomeListaProgramas(int index) {
//		String[] listaProgramas = new String[canais.get(index).getListaProgramas().size()];
//		for(int i = 0; i<canais.get(index).getListaProgramas().size(); i++) {
//			listaProgramas[i] = (""+canais.get(index).getListaProgramas().get(i).getNome());
//		}
//		return listaProgramas;
//	}
//	
//	public String[] getListaProgramas(int index) {
//		String[] detalhesProgramas = new String[canais.get(index).getListaProgramas().size()];
//		for(int i = 0; i<canais.get(index).getListaProgramas().size(); i++) {
//			detalhesProgramas[i] = (""+canais.get(index).getListaProgramas().get(i));
//		}
//		return detalhesProgramas;
//	}
}
