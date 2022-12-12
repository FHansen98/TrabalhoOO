import java.util.ArrayList;

public class UsuarioPremium extends Aplicativo{
	private ArrayList<Canal> listaCanaisFavoritos;
	private ArrayList<Programa> listaProgramasGravados;
	private String nome;
	private String email;
	private int id;
	private String senha;
	
	
	public UsuarioPremium(ArrayList<Canal> listaCanaisFavoritos, ArrayList<Programa> listaProgramasGravados,
			String nome, String email, int id, String senha, ArrayList<Programa> listaProgramaOnAir, ArrayList<Canal> listaCanal) {
		super();
		this.listaCanaisFavoritos = listaCanaisFavoritos;
		this.listaProgramasGravados = listaProgramasGravados;
		this.nome = nome;
		this.email = email;
		this.id = id;
		this.senha = senha;
		this.listaProgramaOnAir = listaProgramaOnAir;
		this.listaCanal = listaCanal;
	}

	@Override
	public String toString() {
		String strProg = "";
		for (var i:listaProgramasGravados) {
			strProg += i.getNome() + " ";
		}
		String strFavCanais = "";
		for (var i:listaCanaisFavoritos) {
			strFavCanais += i.getNome() + " ";
		}
		String strOnAir = "";
		for (var i:listaProgramaOnAir) {
			strOnAir += i.getNome() + " ";
		}
		String strCanais = "";
		for (var i:listaCanal) {
			strCanais += i.getNome() + " ";
		}
		String str = "UsuarioPremium " + nome + ", listaCanaisFavoritos= " + strFavCanais + ", listaProgramasGravados= " + strProg + 
				", email=" + email + ", id=" + id + ", senha=" + senha + ", listaProgramaOnAir= " + strOnAir + ", listaCanal= " + strCanais;
		return str;
	}

	public ArrayList<Canal> getListaCanaisFavoritos() {
		return listaCanaisFavoritos;
	}

	public void setListaCanaisFavoritos(ArrayList<Canal> listaCanaisFavoritos) {
		this.listaCanaisFavoritos = listaCanaisFavoritos;
	}

	public ArrayList<Programa> getListaProgramasGravados() {
		return listaProgramasGravados;
	}

	public void setListaProgramasGravados(ArrayList<Programa> listaProgramasGravados) {
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
