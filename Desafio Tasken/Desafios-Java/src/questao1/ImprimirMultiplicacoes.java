package questao1;

import java.util.Scanner;

public class ImprimirMultiplicacoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int num = sc.nextInt();

		try {

			if(num <= 0) {
				throw new ValorInvalido(num);

			}
		} catch(ValorInvalido e) {
			System.out.println("Ocorreu um erro");
			e.printStackTrace();
		}

		Calculo(num);

		sc.close();
	}

	private static void Calculo(int num) {


		while(num > 0) {

			for(int i = num; i > 0; i--) {
				System.out.print(i * i +" ");
			}
			num--;
			System.out.println();
		}
	}
}


