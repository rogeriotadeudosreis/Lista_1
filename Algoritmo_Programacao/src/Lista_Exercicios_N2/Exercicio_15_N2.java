package Lista_Exercicios_N2;

/*Leia um número indeterminado de números e conte a quantidade de números pares e
números ímpares. Caso o usuário digite um número inválido (negativo) deve-se exibir
uma mensagem e repetir a leitura. O sistema deverá ser encerrado quando for digitado o
número 0 (zero).*/

import java.util.Scanner;

public class Exercicio_15_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero;
		int quantpares = 0;
		int quantimpares = 0;
		
		do {
			do {
				System.out.println("Digite um número positivo:");
				numero = teclado.nextInt();
				if (numero < 0) {
					System.out.println("Número inválido !");
				}
			} while (numero < 0);

			if (numero == 0) {
				System.out.println("Fim da digitação.");
			} else {
				if (numero % 2 == 0) {
					quantpares++;
				} else {
					quantimpares++;
				}

			}

		} while (numero != 0);

		System.out.printf("Quantidade de números pares: %d\n", quantpares);
		System.out.printf("Quantidade de números ímpares: %d\n", quantimpares);
		teclado.close();
	}
}
