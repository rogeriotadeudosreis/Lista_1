package Lista_Exercicios_N2;

/*Leia um n�mero indeterminado de n�meros e conte a quantidade de n�meros pares e
n�meros �mpares. Caso o usu�rio digite um n�mero inv�lido (negativo) deve-se exibir
uma mensagem e repetir a leitura. O sistema dever� ser encerrado quando for digitado o
n�mero 0 (zero).*/

import java.util.Scanner;

public class Exercicio_15_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero;
		int quantpares = 0;
		int quantimpares = 0;
		
		do {
			do {
				System.out.println("Digite um n�mero positivo:");
				numero = teclado.nextInt();
				if (numero < 0) {
					System.out.println("N�mero inv�lido !");
				}
			} while (numero < 0);

			if (numero == 0) {
				System.out.println("Fim da digita��o.");
			} else {
				if (numero % 2 == 0) {
					quantpares++;
				} else {
					quantimpares++;
				}

			}

		} while (numero != 0);

		System.out.printf("Quantidade de n�meros pares: %d\n", quantpares);
		System.out.printf("Quantidade de n�meros �mpares: %d\n", quantimpares);
		teclado.close();
	}
}
