package control;

import java.util.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.*;
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
	public ArrayList<Programa> getAllInfosListaProgramas() {
		int sizeArray = 0;
		ArrayList<Programa> listaProgramas = new ArrayList<>();
		for(int j =0; j<canais.size(); j++) {
			sizeArray = sizeArray + canais.get(j).getListaProgramas().size();
		}
//		listaProgramas = new String[sizeArray]; //tamanho 3
		int index = 0;
		for(int j =0; j<canais.size(); j++) {
			for(int i = 0; i<canais.get(j).getListaProgramas().size(); i++) {
				listaProgramas.add(canais.get(j).getListaProgramas().get(i));
				index ++;
			}
		}
		return listaProgramas;
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
		System.out.println(listaProgramas);
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
		int[] tam = new int[2]; // flag de posição
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
	public int cadastrarPrograma(String canal,String nome,String horario,String data, String descricao) {
		int sizeArray = 0;
		int aux=5;
		Programa novoPrograma = new Programa(nome, horario, data, descricao);
		for(int j =0; j<canais.size(); j++) {
			sizeArray = sizeArray + canais.get(j).getListaProgramas().size();
		}
		for(int k =0; k<canais.size(); k++) {
			if(canal.equals(canais.get(k).getNome())){
				aux=1;
			}
		}
		if(aux==1) {
			for(int j =0; j<canais.size(); j++) {
				if(canal.equals(canais.get(j).getNome())){	
					for(int i = 0; i<canais.get(j).getListaProgramas().size(); i++) {
						if(nome.equals(canais.get(j).getListaProgramas().get(i).getNome())) {
							return 1; // nome igual
						}
					}
					canais.get(j).getListaProgramas().add(novoPrograma);
					return 2;// achou e adicionou
				}
			}
			return 4; // achou canal e nao foi possivel add programa
		}
		else {
			return 3; // nao achou canal
		}
	}
	public void excluirPrograma(String nome) {
		for(int j =0; j<canais.size(); j++) {
			List<Programa> listaProgramas = new ArrayList<>(canais.get(j).getListaProgramas());
			int index = 0;
			for(var programa:listaProgramas) {
				if(programa.getNome().equals(nome)) {
					canais.get(j).getListaProgramas().remove(index);
				}
			index++;
			}
		}
	}
}