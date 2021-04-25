package br.com.adenilson;

public interface MecanicaDoJogo {

	public String tipoDoJogo();

	public String palavraSecreta();

	public boolean acertouPalavra(String palavra);

	public void pontuacaoDeAcertos();

	public void pontuacaoDeErros();

	public int getAcertos();

	public int getErros();

	public boolean fimDoJogo();

}
