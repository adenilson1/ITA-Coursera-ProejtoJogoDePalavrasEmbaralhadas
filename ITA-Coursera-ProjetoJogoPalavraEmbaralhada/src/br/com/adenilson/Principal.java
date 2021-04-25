package br.com.adenilson;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("JOGO DAS PALAVRAS EMBARALHADAS");

		Scanner scan = new Scanner(System.in);
		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanica();


		while (!mecanica.fimDoJogo()) {
			System.out.println(mecanica.tipoDoJogo());
			System.out.println("Adivinhe a palavra embaralhada: " + mecanica.palavraSecreta());
			System.out.println("Digite sua resposta: ");
			String resposta = scan.nextLine();

			if (mecanica.acertouPalavra(resposta)) {
				mecanica.pontuacaoDeAcertos();
				System.out.println("PARABÉNS, VOCÊ ACERTOU!!!\n");
			} else {
				mecanica.pontuacaoDeErros();
				System.out.println("UMA PENA, VOCÊ ERRO!!!\n");
			}

		}
		scan.close();
		System.out.println("\nFIM DO JOGO");
		System.out.println("VOCE ACERTOU: " + mecanica.getAcertos());
		System.out.println("VOCẼ ERROU: " + mecanica.getErros());

	}

}
