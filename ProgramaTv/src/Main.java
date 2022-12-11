public class Main {
	
	public static void main (String[] args) {
		String[] valores = new String[2];
		valores[0] = "Jornal";
		valores[1] = "Novela";
		
		Canal canal = new Canal("Globo", 10, true, true, valores);
		System.out.println("Canal: " + canal.getNome() + " tem programação: " + canal.getListaProgramas()[0] + ' '+ canal.getListaProgramas()[1]);
	}
}