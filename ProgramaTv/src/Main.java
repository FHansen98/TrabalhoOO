import java.util.ArrayList;

public class Main {
	
	public static void main (String[] args) {
		
		Programa filme =  new Programa("Harry Potter", "11/12/2022", "22:00", true, "magicos e contra viloes", "Filme", 12, false, false);
		Programa novela =  new Programa("Avenida Brasil", "11/12/2022", "21:00", true, "Carminha x Nina", "Novela", 14, false, false);
		Programa sport =  new Programa("sport TV", "11/12/2022", "20:00", false, "central do apito comentarios copa", "sport", 10, false, false);
		Programa globonews =  new Programa("Globo News", "11/12/2022", "21:00", false, "noticias de hoje", "jornal", 10, false, false);
		Canal globo = new Canal("Globo", 10, true, true, new ArrayList<>());
		Canal telecine = new Canal("Telecine", 223, true, true, new ArrayList<>());
		UsuarioPremium premium1 = new UsuarioPremium(new ArrayList<>(), new ArrayList<>(), "Felipe", "aaaaa@gmail.com", 120241124, "12345", new ArrayList<>(), new ArrayList<>());
		Visitante visitante = new Visitante(true, new ArrayList<>(), new ArrayList<>());

	
		globo.getListaProgramas().add(filme);
		globo.getListaProgramas().add(novela);
		telecine.getListaProgramas().add(sport);
		telecine.getListaProgramas().add(globonews);
		premium1.getListaProgramasGravados().add(novela);
		premium1.getListaCanaisFavoritos().add(telecine);
		premium1.getListaProgramaOnAir().add(globonews);
		premium1.getListaProgramaOnAir().add(novela);
		premium1.getListaCanal().add(telecine);
		premium1.getListaCanal().add(globo);
		visitante.getListaCanal().add(globo);
		visitante.getListaCanal().add(telecine);
		visitante.getListaProgramaOnAir().add(globonews);
		visitante.getListaProgramaOnAir().add(novela);
		
		
		System.out.println(globo);
		System.out.println(telecine);
		System.out.println(premium1);
		System.out.println(visitante);

		
	}
}