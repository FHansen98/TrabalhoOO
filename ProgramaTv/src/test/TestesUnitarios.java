package test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import control.*;

import static org.junit.Assert.assertArrayEquals;

public class TestesUnitarios {

	
	@Test
	void testBuscarPrograma() {
		String programa1 = "BBB";
		String programa2 = "Ben 10";
		String programa3 = "Game of Thrones";
		String programa4 = "Harry Potter";
		String programa5 = "Rebelde";
		int[] prog1 = {0,2};
		int[] prog2 = {3,0};
		int[] prog3 = {1,2};
		int[] prog4 = {1,1};
		int[] prog5 = {-1,-2};
		
		ControleDados d = new ControleDados();
		ControleProgramas controleProgramas = new ControleProgramas(d);
		assertArrayEquals(prog1, controleProgramas.getBuscaPrograma(programa1));
		assertArrayEquals(prog2,controleProgramas.getBuscaPrograma(programa2));
		assertArrayEquals(prog3,controleProgramas.getBuscaPrograma(programa3));
		assertArrayEquals(prog4,controleProgramas.getBuscaPrograma(programa4));
		assertArrayEquals(prog5,controleProgramas.getBuscaPrograma(programa5));
	}
	@Test
	void testCadastrarCanal() {
		
		String[] dadosCanal1 = new String[3];
		String[] dadosCanal2 = new String[3];
		String[] dadosCanal3 = new String[3];
		int p=-1;
		dadosCanal1[0] =  Integer.toString(p);
		dadosCanal1[1] =  "Kids";
		dadosCanal1[2] =  "90";
		
		dadosCanal2[0] =  Integer.toString(p);
		dadosCanal2[1] =  "SBT";
		dadosCanal2[2] =  "12";
		
		dadosCanal3[0] =  Integer.toString(p);
		dadosCanal3[1] =  "Fox";
		dadosCanal3[2] =  "56";
		ControleDados d = new ControleDados();
		assertTrue(d.cadastrarCanal(dadosCanal1));
		assertTrue(d.cadastrarCanal(dadosCanal2));
		assertTrue(d.cadastrarCanal(dadosCanal3));
	}
	@Test
	void testCadastarPrograma(){
		String canal = "Nick";
		String NomePrograma = "RBD";
		String horarioPrograma = "21:00";
		String dataPrograma = "28/01/22";
		String descricaoPrograma = "lupita expulsa do cologio";
		ControleDados d = new ControleDados();
		ControleProgramas controleProgramas = new ControleProgramas(d);
		assertEquals(2,controleProgramas.cadastrarPrograma(canal,NomePrograma, horarioPrograma,dataPrograma,descricaoPrograma));
		
		
	}
	
}