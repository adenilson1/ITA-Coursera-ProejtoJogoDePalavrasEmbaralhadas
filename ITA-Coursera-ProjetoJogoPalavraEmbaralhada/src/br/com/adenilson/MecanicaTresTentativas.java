package br.com.adenilson;

public class MecanicaTresTentativas implements MecanicaDoJogo {
	private int acertos = 0;
	private int erros = 0;
	private int tentatvas = 3;
	private String palavraSecreta = "";
	private BancoDePalavras banco;
	private FabricaEmbaralhador tipo;
	
	public MecanicaTresTentativas() {
		banco = new BancoDePalavras();
		tipo = new FabricaEmbaralhador();
	}
	

	@Override
	public String tipoDoJogo() {
		return "JOGO DE TRÊS TENTATIVAS";
	}

	@Override
	public String palavraSecreta() {
		this.palavraSecreta = banco.palavraSecreta();
		return tipo.getEmbaralhadorDePalavra().embaralhadorPalavra(palavraSecreta);
	}

	@Override
	public boolean acertouPalavra(String palavra) {
		if(palavra.equals(this.palavraSecreta))
			return true;
		return false;
	}

	@Override
	public void pontuacaoDeAcertos() {
		this.acertos++;

	}

	@Override
	public void pontuacaoDeErros() {
		this.erros++;

	}

	@Override
	public int getAcertos() {
		return this.acertos;
	}

	@Override
	public int getErros() {
		return this.erros;
	}

	@Override
	public boolean fimDoJogo() {
		if(banco.existePalavra() && this.getErros() < tentatvas && this.getAcertos() < tentatvas)
			return false;
		return true;
	}

}
