package br.com.adenilson;

public class EmbaralhadorInvertido implements Embaralhador {

	@Override
	public String embaralhadorPalavra(String palavra) {
		StringBuilder palavraInvertida = new StringBuilder(palavra);
		return palavraInvertida.reverse().toString();
	}

}
