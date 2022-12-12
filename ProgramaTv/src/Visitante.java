import java.util.ArrayList;

public class Visitante extends Aplicativo {
	private boolean anuncio;

	public Visitante(boolean anuncio, ArrayList<Programa> listaProgramaOnAir, ArrayList<Canal> listaCanal) {
		super();
		this.anuncio = anuncio;
		this.listaProgramaOnAir = listaProgramaOnAir;
		this.listaCanal = listaCanal;
	}

	@Override
	public String toString() {
		String strOnAir = "";
		for (var i:listaProgramaOnAir) {
			strOnAir += i.getNome() + " ";
		}
		String strCanais = "";
		for (var i:listaCanal) {
			strCanais += i.getNome() + " ";
		}
		return "Visitante anuncio=" + anuncio  + ", listaProgramaOnAir= " + strOnAir + ", listaCanal= " + strCanais;
	}

	public boolean isAnuncio() {
		return anuncio;
	}

	public void setAnuncio(boolean anuncio) {
		this.anuncio = anuncio;
	}
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
