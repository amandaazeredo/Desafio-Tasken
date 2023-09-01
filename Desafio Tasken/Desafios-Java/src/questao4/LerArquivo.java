package questao4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o caminho do arquivo desejado:");
		String path = sc.nextLine();
		String line;

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {

			int linhaComMaisVogais = -1;
			int linhaComMaisConsoantes = -1;
			int maxVogais = -1;
			int maxConsoantes = -1;
			int linhaAtual = 1;

			line = br.readLine();
			
			String conteudoMaisVogais = "";
			String conteudoMaisConsoantes = "";

			while(line != null) {

				int numVogais = contaVogais(line);
				int numConsoantes = line.length()-numVogais;
				
				if(numVogais > maxVogais) {
					maxVogais = numVogais;
					linhaComMaisVogais = linhaAtual;
					conteudoMaisVogais = line;
				}
				if(numConsoantes > maxConsoantes) {
					maxConsoantes = numConsoantes;
					linhaComMaisConsoantes = linhaAtual;
					conteudoMaisConsoantes = line;
				}
				
				line = br.readLine();
				linhaAtual++;
			}
			
			System.out.println("Linha com mais vogais: " + linhaComMaisVogais + "): " + maxVogais + " vogais");
			System.out.println(conteudoMaisVogais);
			System.out.println();
			System.out.println("Linha com mais consoantes: "+ linhaComMaisConsoantes + "): " + maxConsoantes + " consoantes");
			System.out.println(conteudoMaisConsoantes);
			
		} catch(IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}

		sc.close();

	}			

	private static Integer contaVogais(String linha) {
		int contador = 0;
		char[] caracteres = linha.toLowerCase().toCharArray();

		for (int i = 0; i < caracteres.length; i++) {
			char c = caracteres[i];
			if ("aeiou".indexOf(c) != -1) {
				contador++;
			}
		}

		return contador;
	}
}


