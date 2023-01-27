package controle;

import java.text.SimpleDateFormat;
import java.util.*;
import modelo.*;


public class ControleDados {
	private Dados d = new Dados();
	
	
	public ControleDados() {
		d.cadastrosProntos();
	}
	
	public boolean cadastrarCanal(String[] dados) {
		Canal channel = new Canal(dados[1], Integer.parseInt(dados[2]), new ArrayList<>());
		d.cadastrarCanal(channel, Integer.parseInt(dados[0]), d);
		return true;
	}
	
	public void excluirCanal(int posicao) {
		d.getCanais().remove(posicao);
	}
	
	public List<Canal> getCanais() {
		return this.d.getCanais();
	}
	public List<Programa> getProgramas() {
		return this.d.getProgramas();
	}
	public List<Programa> getProgramasOnAir() {
		return this.d.getProgramasOnAir();
	}
	public List<UsuarioPremium> getListaUsuarioP() {
		return this.d.getListaUsuarioP();
	}
	public List<UsuarioMaster> getListaUsuarioM() {
		return this.d.getListaUsuarioM();
	}
	@Override
	public String toString() {
		return "ControleDados [d=" + d + "]";
	}
	
}