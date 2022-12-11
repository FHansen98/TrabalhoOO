
public class Visitante extends Aplicativo {
	private boolean anuncio;

	public Visitante(boolean anuncio) {
		super();
		this.anuncio = anuncio;
	}

	public boolean isAnuncio() {
		return anuncio;
	}

	public void setAnuncio(boolean anuncio) {
		this.anuncio = anuncio;
	}
}
