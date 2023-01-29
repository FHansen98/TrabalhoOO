package control;

import java.text.SimpleDateFormat;
import java.util.*;

import model.*;


public class ControleDados {
	private Dados d = new Dados();
	
	
	public ControleDados() {
		d.cadastrosProntos();
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