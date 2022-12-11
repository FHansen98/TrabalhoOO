
public class UsuarioPremium extends Aplicativo{
	private Canal[] listaCanaisFavoritos;
	private Programa[] listaProgramasGravados;
	private String nome;
	private String email;
	private int id;
	private String senha;
	public UsuarioPremium(Canal[] listaCanaisFavoritos, Programa[] listaProgramasGravados, String nome, String email,
			int id, String senha) {
		super();
		this.listaCanaisFavoritos = listaCanaisFavoritos;
		this.listaProgramasGravados = listaProgramasGravados;
		this.nome = nome;
		this.email = email;
		this.id = id;
		this.senha = senha;
	}
	public Canal[] getListaCanaisFavoritos() {
		return listaCanaisFavoritos;
	}
	public void setListaCanaisFavoritos(Canal[] listaCanaisFavoritos) {
		this.listaCanaisFavoritos = listaCanaisFavoritos;
	}
	public Programa[] getListaProgramasGravados() {
		return listaProgramasGravados;
	}
	public void setListaProgramasGravados(Programa[] listaProgramasGravados) {
		this.listaProgramasGravados = listaProgramasGravados;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
