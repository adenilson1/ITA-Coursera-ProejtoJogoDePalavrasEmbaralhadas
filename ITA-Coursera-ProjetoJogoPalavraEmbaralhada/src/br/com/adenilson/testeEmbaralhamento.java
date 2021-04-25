package br.com.adenilson;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testeEmbaralhamento {
	
	private static EmbarlahdorAleatorio ap;
	private static EmbaralhadorInvertido ip;
	
	@Before
	public void inicializaEmbaralhador() {
		ap = new EmbarlahdorAleatorio();
		ip = new EmbaralhadorInvertido();
	}

	@Test
	public void testEmbaralhamentoInverso() {
		assertEquals("orraC",ip.embaralhadorPalavra("Carro"));
	}
	
	@Test
	public void testEmbaralhamentoAleatorio() {
		assertNotEquals("roaCr",ap.embaralhadorPalavra("Carro"));
	}

}
