package Lista_Exercicios_N2;

/*Escreva um programa que receba v�rios n�meros inteiros, calcule e mostre: a) a soma
dos n�meros digitados; b) a quantidade de n�meros digitados; c) a m�dia dos n�meros
digitados; d) o maior n�mero digitado; e) o menor n�mero digitado; f) a m�dia dos
n�meros pares; g) a percentagem dos n�meros �mpares entre todos os n�meros
digitados. Finalize a entrada de dados com a digita��o do n�mero 0.*/

import java.util.Scanner;

public class Exercicio_16_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num;
		int maiornum = 0;
		int menornum = 0;
		int quantnum = 0;
		int quantpar = 0;
		double quantimpar = 0;
		double somageral = 0;
		double somapar = 0;
		double medianum = 0;
		double mediapares = 0;
		double perc = 0;

		do {

			do {
				System.out.printf("Digite um n�mero positivo:");
				num = teclado.nextInt();
				System.out.println();
				if (num < 0) {
					System.out.println("N�mero inv�lido");
				}

			} while (num < 0);

			if (num == 0) {
				System.out.println("Fim da digita��o.\n");
			} else {
				if (quantnum == 0) {

					maiornum = num;
					menornum = num;
				}
				if (num < menornum) {
					menornum = num;
				} else if (num > maiornum) {
					maiornum = num;
				}

				

				if (num % 2 == 0) {

					quantpar++;
					somapar += num;
				} else {
					quantimpar++;
				}
				quantnum++;
				somageral = somageral + num;
			}

		} while (num != 0);

		medianum = somageral / quantnum;
		mediapares = somapar / quantpar;
		perc = (quantimpar / quantnum) * 100;

		System.out.printf("A quantidade de n�meros digitados foi: %d\n", quantnum);
		System.out.printf("A soma geral dos n�meros digitados foi: %.0f\n", somageral);
		System.out.printf("A m�dia geral dos n�meros digitados foi: %.1f\n", medianum);
		System.out.printf("O maior n�mero digitado foi: %d\n", maiornum);
		System.out.printf("O menor n�mero digitado foi: %d\n", menornum);
		System.out.printf("A quantidade de n�meros pares digitada foi: %d\n", quantpar);
		System.out.printf("A m�dia dos n�meros pares �: %.1f\n", mediapares);
		System.out.printf("O percentagem dos n�meros �mpares �: %.1f%%\n", perc);
		teclado.close();
	}

}
