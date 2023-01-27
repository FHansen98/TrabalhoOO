package controle;

import java.util.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import modelo.*;
import view.*;

public class ControleProgramas {
	private List<Programa> programas;
	private List<Canal> canais;
	private List<UsuarioPremium> listaUsuarioP;
	
	public ControleProgramas(ControleDados d) {
		//this.d=d;
		programas = d.getProgramasOnAir();
		canais = d.getCanais();
		listaUsuarioP = d.getListaUsuarioP();
	}
	
	public String[] getNomeListaProgramasOnAir() {
		String[] programasOnAir = new String[programas.size()];
		for(int i = 0; i<programas.size(); i++) {
			programasOnAir[i] = (""+programas.get(i).getNome());
		}
		return programasOnAir;
	}
	public String[] getListaProgramasOnAir() {
		String[] detalhesprogramasOnAir = new String[programas.size()];
		for(int i = 0; i<programas.size(); i++) {
			detalhesprogramasOnAir[i] = (""+programas.get(i));
		}
		return detalhesprogramasOnAir;
	}
//	tava no controle canais
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
	
	public int[] getBuscaPrograma(String programa) {
//		// recebe o nome do programa a ser buscado
//		// retorna a descrição desse programa 
		int sizeArray = 0;
		int[] tam = new int[3]; // flag de posição
		for(int j =0; j<canais.size(); j++) {
			sizeArray = sizeArray + canais.get(j).getListaProgramas().size();
		}
		for(int j =0; j<canais.size(); j++) {
			for(int i = 0; i<canais.get(j).getListaProgramas().size(); i++) {
				if(programa.equals(canais.get(j).getListaProgramas().get(i).getNome())) {
					tam[0]=j;
					tam[1]=i;	
					return tam;
				}
			}
		}
		tam[0]=-1;
		tam[1]=-2;
		return tam;
	}
	public String[] getNomeListaProgramasFavoritos(int id, int index) {
		String canalFavorito;
		String[] programasFavoritos = {};
		for(var usuario:listaUsuarioP) {
			if(usuario.getId() == id) {
				canalFavorito = usuario.getListaCanaisFavoritos().get(index).getNome();
				for(var canal:usuario.getListaCanaisFavoritos()) {
					programasFavoritos = new String[canal.getListaProgramas().size()];
					if(canal.getNome().equals(canalFavorito)){
						for(int x = 0; x<canal.getListaProgramas().size(); x++) {
							programasFavoritos[x] = (""+canal.getListaProgramas().get(x).getNome());
						}
						return programasFavoritos;
					}
				}
			}
		}
		return programasFavoritos;
	}
}