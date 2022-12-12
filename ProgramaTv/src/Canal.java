import java.util.ArrayList;

public class Canal {
	private String nome;
	private int numero;
	private boolean favorito;
	private boolean tvAberta;
	private ArrayList<Programa> listaProgramas = new ArrayList<>();

	public Canal(String nome, int numero, boolean favorito, boolean tvAberta, ArrayList<Programa> listaProgramas) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.favorito = favorito;
		this.tvAberta = tvAberta;
		this.listaProgramas = listaProgramas;
	}
		
	@Override
	public String toString() {
		String str = "Canal " + nome + ", numero=" + numero + ", favorito=" + favorito + ", tvAberta=" + tvAberta + ", listaProgramas= ";
		for (var i:listaProgramas) {
			str += i.getNome() + ' ';
		}
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
	
	public boolean isFavorito() {
		return favorito;
	}
	
	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}
	
	public boolean isTvAberta() {
		return tvAberta;
	}
	
	public void setTvAberta(boolean tvAberta) {
		this.tvAberta = tvAberta;
	}
	
	public ArrayList<Programa> getListaProgramas() {
		return listaProgramas;
	}
	
	public void setListaProgramas(ArrayList<Programa> listaProgramas) {
		this.listaProgramas = listaProgramas;
	}

}
