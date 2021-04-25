package br.com.adenilson;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmbarlahdorAleatorio implements Embaralhador {

	@Override
	public String embaralhadorPalavra(String palavra) {
		List<Character> letras = palavra.chars().boxed().map(c -> (char) c.intValue()).collect(Collectors.toList());
		Collections.shuffle(letras);
		StringBuilder letrasMisturadas = new StringBuilder(palavra.length());
		letras.forEach(letrasMisturadas::append);
		return letrasMisturadas.toString();
	}

}
