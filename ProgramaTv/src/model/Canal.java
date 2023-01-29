package model;
import java.util.ArrayList;

public class Canal {
	private String nome;
	private int numero;
	private ArrayList<Programa> listaProgramas = new ArrayList<>();

	public Canal(String nome, int numero, ArrayList<Programa> listaProgramas) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.listaProgramas = listaProgramas;
	}
		
	@Override
	public String toString() {
		String str = "Canal: " + nome + " - Número: " + numero;
		return str;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
		
	public ArrayList<Programa> getListaProgramas() {
		return listaProgramas;
	}
	
	public void setListaProgramas(ArrayList<Programa> listaProgramas) {
		this.listaProgramas = listaProgramas;
	}

}
