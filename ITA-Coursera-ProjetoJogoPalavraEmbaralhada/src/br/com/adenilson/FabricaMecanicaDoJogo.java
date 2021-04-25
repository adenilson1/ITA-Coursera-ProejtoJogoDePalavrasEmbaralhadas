package br.com.adenilson;

import java.util.Random;

public class FabricaMecanicaDoJogo {
	public static MecanicaDoJogo getMecanica() {
		int i;
		Random aleatorio = new Random();
		i = aleatorio.nextInt(2) + 1;
		
		if(i == 1)
			return new MecanicaDuasTentativas();
		return new MecanicaTresTentativas();
	}

}
