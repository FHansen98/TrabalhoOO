package controle;

import java.text.SimpleDateFormat;
import java.util.*;
import modelo.*;


public class ControleUsuario {
	public List<UsuarioPremium> listaUsuarioP;
	public List<UsuarioMaster> listaUsuarioM;
	
	public ControleUsuario(ControleDados d) {
		listaUsuarioP = d.getListaUsuarioP();
		listaUsuarioM = d.getListaUsuarioM();
		
	}
	
	public int login(String email, String senha){
		for(var usuario:listaUsuarioP) 
			if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha))
				return usuario.getId();
		return -1;
	}
	public int loginMaster(String email, String senha){
		for(var usuario:listaUsuarioM) 
			if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha))
				return usuario.getId();
		return -1;
	}
//	public String[] getListaCanaisFavoritos(int id) {
//		String[] programasFavoritos = {};
//		for(var usuario:listaUsuarioP) {
//			if(usuario.getId() == id) {
//				programasFavoritos = new String[usuario.getListaCanaisFavoritos().size()];
//				for(int i = 0; i<usuario.getListaCanaisFavoritos().size(); i++) {
//					programasFavoritos[i] = (""+usuario.getListaCanaisFavoritos().get(i).getNome());
//				}
//				return programasFavoritos;
//			}
//		}
//		return programasFavoritos;
//	}
	
}