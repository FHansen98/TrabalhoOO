import java.util.ArrayList;

public abstract class Aplicativo {
	protected ArrayList<Programa> listaProgramaOnAir;
	protected ArrayList<Canal> listaCanal;
	
	public ArrayList<Programa> getListaProgramaOnAir() {
		return listaProgramaOnAir;
	}
	public void setListaProgramaOnAir(ArrayList<Programa> listaProgramaOnAir) {
		this.listaProgramaOnAir = listaProgramaOnAir;
	}
	public ArrayList<Canal> getListaCanal() {
		return listaCanal;
	}
	public void setListaCanal(ArrayList<Canal> listaCanal) {
		this.listaCanal = listaCanal;
	}

	
}