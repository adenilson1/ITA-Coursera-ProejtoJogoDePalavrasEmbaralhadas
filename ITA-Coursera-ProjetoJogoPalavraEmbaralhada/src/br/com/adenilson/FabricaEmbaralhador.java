package br.com.adenilson;

import java.util.Random;

public class FabricaEmbaralhador {

	public Embaralhador getEmbaralhadorDePalavra() {
		int i;
		Random aleatorio = new Random();
		i = aleatorio.nextInt(2) + 1;
		
		if(i == 1)
			return new EmbaralhadorInvertido();
		return new EmbarlahdorAleatorio();
	}

}
