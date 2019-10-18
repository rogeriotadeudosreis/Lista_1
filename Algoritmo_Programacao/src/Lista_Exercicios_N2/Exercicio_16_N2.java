package Lista_Exercicios_N2;

/*Escreva um programa que receba vários números inteiros, calcule e mostre: a) a soma
dos números digitados; b) a quantidade de números digitados; c) a média dos números
digitados; d) o maior número digitado; e) o menor número digitado; f) a média dos
números pares; g) a percentagem dos números ímpares entre todos os números
digitados. Finalize a entrada de dados com a digitação do número 0.*/

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
				System.out.printf("Digite um número positivo:");
				num = teclado.nextInt();
				System.out.println();
				if (num < 0) {
					System.out.println("Número inválido");
				}

			} while (num < 0);

			if (num == 0) {
				System.out.println("Fim da digitação.\n");
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

		System.out.printf("A quantidade de números digitados foi: %d\n", quantnum);
		System.out.printf("A soma geral dos números digitados foi: %.0f\n", somageral);
		System.out.printf("A média geral dos números digitados foi: %.1f\n", medianum);
		System.out.printf("O maior número digitado foi: %d\n", maiornum);
		System.out.printf("O menor número digitado foi: %d\n", menornum);
		System.out.printf("A quantidade de números pares digitada foi: %d\n", quantpar);
		System.out.printf("A média dos números pares é: %.1f\n", mediapares);
		System.out.printf("O percentagem dos números ímpares é: %.1f%%\n", perc);
		teclado.close();
	}

}
