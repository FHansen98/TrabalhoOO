package controle;

import java.util.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import modelo.*;
import view.*;

public class ControleProgramas {
	private List<Programa> programas;
	
	private List<Canal> canais;
	
	public ControleProgramas(ControleDados d) {
		//this.d=d;

		programas = d.getProgramasOnAir();
		
		
		canais = d.getCanais();
	}
	
	public String[] getNomeListaProgramasOnAir() {
		String[] programasOnAir = new String[programas.size()];
		for(int i = 0; i<programas.size(); i++) {
			programasOnAir[i] = ("  "+programas.get(i).getNome());
		}
		return programasOnAir;
	}
	public String[] getListaProgramasOnAir() {
		String[] detalhesprogramasOnAir = new String[programas.size()];
		for(int i = 0; i<programas.size(); i++) {
			detalhesprogramasOnAir[i] = ("  "+programas.get(i));
		}
		return detalhesprogramasOnAir;
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
	
	
}