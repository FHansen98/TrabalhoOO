package modelo;
import java.util.ArrayList;
import java.util.List;

public class Dados {
	
	private List<Canal> canais = new ArrayList<Canal>();
	private List<Programa> programas = new ArrayList<Programa>();
	private List<UsuarioPremium> listaUsuarioP = new ArrayList<UsuarioPremium>();
	private List<UsuarioMaster> listaUsuarioM = new ArrayList<UsuarioMaster>();
	private List<Programa> programasOnAir = new ArrayList<Programa>();
	private UsuarioMaster master;
	
	
	public void cadastrosProntos () {
		
		Programa filme =  new Programa("Harry Potter", "11/12/2022", "22:00", "Bruxos e contra viloes");
		Programa novela =  new Programa("Avenida Brasil", "11/12/2022", "21:00", "Carminha x Nina");
		Programa bbb =  new Programa("BBB", "11/12/2022", "22:00", "reality");
		Programa got =  new Programa("Game of Thrones", "11/12/2022", "23:00", "dragoes e Casas");
		Programa filme2 =  new Programa("Senhor dos Aneis", "11/12/2022", "20:00", "filme ficçao cientifica");
		Programa globonews =  new Programa("Globo News", "11/12/2022", "21:00", "noticias de hoje");
		Canal globo = new Canal("Globo", 10, new ArrayList<>());
		Canal telecine = new Canal("Telecine", 223, new ArrayList<>());
		UsuarioPremium premium1 = new UsuarioPremium(new ArrayList<>(), "Jose", "a", 0005, "1", new ArrayList<>(), new ArrayList<>());
		UsuarioPremium premium2 = new UsuarioPremium(new ArrayList<>(), "Athur", "bbbb@gmail.com", 0002, "12345", new ArrayList<>(), new ArrayList<>());
		UsuarioPremium premium3 = new UsuarioPremium(new ArrayList<>(), "Professora", "cccc@gmail.com", 0003, "12345", new ArrayList<>(), new ArrayList<>());
		UsuarioPremium premium4 = new  UsuarioPremium(new ArrayList<>(), "Felipe", "aaaaa@gmail.com", 4, "12345", new ArrayList<>(), new ArrayList<>());
		UsuarioMaster master = new UsuarioMaster(true, new ArrayList<>(), new ArrayList<>(), "b", 5, "2", new ArrayList<>(), new ArrayList<>());
		canais.add(globo);
		canais.add(telecine);
		programas.add(filme);
		programas.add(novela);
		programas.add(filme2);
		programas.add(globonews);
		listaUsuarioP.add(premium1);
		listaUsuarioP.add(premium2);
		listaUsuarioP.add(premium3);
		listaUsuarioP.add(premium4);
		listaUsuarioM.add(master);
		programasOnAir.add(globonews);
		programasOnAir.add(filme2);
	
		globo.getListaProgramas().add(globonews);
		globo.getListaProgramas().add(novela);
		globo.getListaProgramas().add(bbb);
		telecine.getListaProgramas().add(filme2);
		telecine.getListaProgramas().add(filme);
		telecine.getListaProgramas().add(got);
		premium1.getListaCanaisFavoritos().add(telecine);
		premium1.getListaProgramaOnAir().add(globonews);
		premium1.getListaProgramaOnAir().add(novela);
		premium1.getListaCanal().add(globo);
		premium1.getListaCanal().add(telecine);
		master.getListaCanal().add(globo);
		master.getListaCanal().add(telecine);
		master.getListaProgramaOnAir().add(globonews);
		master.getListaProgramaOnAir().add(novela);
		
		
//		System.out.println(globo);
//		System.out.println(telecine);
//		System.out.println(premium1);
		System.out.println("Rodou o Codigo");
		this.master = master;
	
	}
	
	public void cadastrarCanal(Canal canal, int posicao, Dados d) {
		if(posicao < 0) {
//			System.out.println("entrou");
			this.canais.add(canal);
			this.master.getListaCanal().add(canal);
//			System.out.println(this.master);
//			System.out.println(this.canais);
		}else {
			this.canais.set(posicao, canal);
			this.master.getListaCanal().set(posicao,canal);
//			System.out.println(this.master);
//			System.out.println(this.canais);
		}
	}

	public List<Canal> getCanais() {
		return canais;
	}

	public void setCanais(List<Canal> canais) {
		this.canais = canais;
	}

	public List<Programa> getProgramas() {
		return programas;
	}

	public void setProgramas(List<Programa> programas) {
		this.programas = programas;
	}

	public List<UsuarioPremium> getListaUsuarioP() {
		return listaUsuarioP;
	}

	public void setListaUsuarioP(List<UsuarioPremium> listaUsuarioP) {
		this.listaUsuarioP = listaUsuarioP;
	}
	
	public List<UsuarioMaster> getListaUsuarioM() {
		return listaUsuarioM;
	}

	public void setListaUsuarioM(List<UsuarioMaster> listaUsuarioM) {
		this.listaUsuarioM = listaUsuarioM;
	}

	public List<Programa> getProgramasOnAir() {
		return programasOnAir;
	}

	public void setProgramaOnAir(List<Programa> programasOnAir) {
		this.programasOnAir = programasOnAir;
	}
	
}