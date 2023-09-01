package questao3;

import java.util.Scanner;

public class LerDigitos {

	public static void main(String[] args) {
		Scanner lerDigito = new Scanner(System.in);

		int[] digitos = new int[100]; 

		int numTotal =0;

		System.out.println("Entre com dígitos positivos e inteiros (0 interromperá o input, 100 é o limite");

		for(int i=0; i<digitos.length;i++) {
			int numAtual = lerDigito.nextInt();

				try {
					if(numAtual == 0){
						break;
					}else if(numAtual <0) {
						throw new DigitoInvalido(numAtual);
					} 
				}catch (DigitoInvalido e) {
					System.out.println("Ocorreu um erro");
					e.printStackTrace();
				}
				
			numTotal++;
			digitos[numTotal] = numAtual;
		}

		 System.out.println("Relatório:");
	        for (int i = 1; i <= numTotal; i++) {
	            System.out.println(digitos[i]);
	        }

	        numerosLidos(numTotal);
	        maiorNumero(digitos, numTotal);
	        mediaNumero(digitos, numTotal);
	        menorNumero(digitos, numTotal);
	        menorImpar(digitos, numTotal);
	        ocorrenciaNumeros(digitos, numTotal);



		lerDigito.close();
	}

	private static void numerosLidos(int numTotal) {
        System.out.println("a) Quantidade de números lidos: " + numTotal);
    }

	private static void maiorNumero(int[] digitos, int numTotal) {
        int maior = Integer.MIN_VALUE;
        for (int i = 1; i <= numTotal; i++) {
            if (digitos[i] > maior) {
                maior = digitos[i];
            }
        }
        if (numTotal > 0) {
            System.out.println("b) Maior número lido: " + maior);
        } else {
            System.out.println("b) Nenhum número lido");
        }
    }

	private static void mediaNumero(int[] digitos, int numTotal) {
        int soma = 0;
        for (int i = 1; i <= numTotal; i++) {
            soma += digitos[i];
        }
        double media = (double) soma / numTotal;
        if (numTotal > 0) {
            System.out.println("c) A média dos números lidos: " + media);
        } else {
            System.out.println("c) Nenhum número lido");
        }
    }

	private static void menorNumero(int[] digitos, int numTotal) {
        int menor = Integer.MAX_VALUE;
        for (int i = 1; i <= numTotal; i++) {
            if (digitos[i] < menor) {
                menor = digitos[i];
            }
        }
        if (numTotal > 0) {
        System.out.println("d) Menor número lido: " + menor);
        }else {
            System.out.println("d) Nenhum número lido");
        }
    }

	private static void menorImpar(int[] digitos, int numTotal) {
        int menorImpar = Integer.MAX_VALUE;
        for (int i = 1; i <= numTotal; i++) {
            if (digitos[i] % 2 != 0 && digitos[i] < menorImpar) {
                menorImpar = digitos[i];
            }
        }
        if (menorImpar != Integer.MAX_VALUE) {
            System.out.println("e) Menor número ímpar lido: " + menorImpar);
        } else {
            System.out.println("e) Nenhum número ímpar lido");
        }
    }


	private static void ocorrenciaNumeros(int[] digitos, int numTotal) {
        int[] ocorrencias = new int[101];
        for (int i = 1; i <= numTotal; i++) {
            ocorrencias[digitos[i]]++;
        }
        for (int i = 0; i < ocorrencias.length; i++) {
            if (ocorrencias[i] > 0) {
                System.out.println("O número " + i + " ocorreu " + ocorrencias[i] + " vezes.");
            }
        }
    }
}
