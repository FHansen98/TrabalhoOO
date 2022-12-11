
public abstract class Aplicativo {
	private Programa[] listaProgramaOnAir;
	private Canal[] listaCanal;
//	public Aplicativo(Programa[] listaProgramaOnAir, Canal[] listaCanal) {
//		super();
//		this.listaProgramaOnAir = listaProgramaOnAir;
//		this.listaCanal = listaCanal;
//	}
	public Programa[] getListaProgramaOnAir() {
		return listaProgramaOnAir;
	}
	public void setListaProgramaOnAir(Programa[] listaProgramaOnAir) {
		this.listaProgramaOnAir = listaProgramaOnAir;
	}
	public Canal[] getListaCanal() {
		return listaCanal;
	}
	public void setListaCanal(Canal[] listaCanal) {
		this.listaCanal = listaCanal;
	}
	
}