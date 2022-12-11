public class Canal {
	private String nome;
	private int numero;
	private boolean favorito;
	private boolean tvAberta;
	private Programa[] listaProgramas;
//	
	public void mudarData() {
		System.out.println("Canal: " + listaProgramas);
	}

	public Canal(String nome, int numero, boolean favorito, boolean tvAberta, Programa[] listaProgramas) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.favorito = favorito;
		this.tvAberta = tvAberta;
		this.listaProgramas = listaProgramas;
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
	
	public Programa[] getListaProgramas() {
		return listaProgramas;
	}
	
	public void setListaProgramas(Programa[] listaProgramas) {
		this.listaProgramas = listaProgramas;
	}

}
