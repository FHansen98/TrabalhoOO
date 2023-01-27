package controle;

import java.util.*;

import modelo.*;


public class ControleCanais {
	private List<Canal> canais;
	
	
	public ControleCanais(ControleDados d) {
		canais = d.getCanais();
		
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
	
	public String[] getAllListaProgramas() {
		int sizeArray = 0;
		String[] listaProgramas = {};
		for(int j =0; j<canais.size(); j++) {
			sizeArray = sizeArray + canais.get(j).getListaProgramas().size();
		}
		listaProgramas = new String[sizeArray]; //tamanho 3
		int index = 0;
		for(int j =0; j<canais.size(); j++) {
			for(int i = 0; i<canais.get(j).getListaProgramas().size(); i++) {
				listaProgramas[index] = (""+canais.get(j).getListaProgramas().get(i).getNome());
				index ++;
			}
		}
		return listaProgramas;
	}
	
	public String[] getNomeListaProgramas(int index) {
		String[] listaProgramas = new String[canais.get(index).getListaProgramas().size()];
		for(int i = 0; i<canais.get(index).getListaProgramas().size(); i++) {
			listaProgramas[i] = (""+canais.get(index).getListaProgramas().get(i).getNome());
		}
		return listaProgramas;
	}
	
	public String[] getListaProgramas(int index) {
		String[] detalhesProgramas = new String[canais.get(index).getListaProgramas().size()];
		for(int i = 0; i<canais.get(index).getListaProgramas().size(); i++) {
			detalhesProgramas[i] = (""+canais.get(index).getListaProgramas().get(i));
		}
		return detalhesProgramas;
	}
}
