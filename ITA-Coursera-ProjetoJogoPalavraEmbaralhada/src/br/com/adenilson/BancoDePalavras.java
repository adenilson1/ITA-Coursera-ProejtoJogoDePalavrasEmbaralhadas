package br.com.adenilson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {
	private List<String> banco = new ArrayList<String>();

	public BancoDePalavras() {
		Scanner scan = null;

		try {
			scan = new Scanner(new FileReader("arquivos/palavrasMagicas"));
			while (scan.hasNextLine()) {
				this.banco.add(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}

	public String palavraSecreta() {
		int i;
		String ps = "";
		Random aleatorio = new Random();
		if (!this.banco.isEmpty()) {
			i = aleatorio.nextInt(this.banco.size());
			ps = this.banco.get(i);
			this.banco.remove(i);
			return ps;

		} else {

			return null;

		}

	}

	public boolean existePalavra() {
		return !this.banco.isEmpty();
	}

}
