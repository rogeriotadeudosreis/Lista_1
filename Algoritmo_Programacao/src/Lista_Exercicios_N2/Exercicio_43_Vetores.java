package Lista_Exercicios_N2;

/*Fa�a um programa que preencha um vetor com 10 n�meros inteiros. Calcule e mostre os
n�meros superiores a 50 e suas respectivas posi��es. O programa dever� mostrar uma
mensagem se n�o existir nenhum n�mero nessa condi��o*/

import java.util.Scanner;

public class Exercicio_43_Vetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int i, soma = 0;

		int[] vetor = new int[10];

		for (i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %do. n�mero inteiro:....................", i + 1);
			vetor[i] = teclado.nextInt();
		}
		System.out.println();
		System.out.printf(".....N�mero.....Posi��o .....\n");

		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] > 50) {

				soma += vetor[i];
				System.out.printf("       %d         [%d]\n", vetor[i], i);

			}
		}
		if (soma > 0) {

			System.out.println("A soma dos n�meros acima de 50 �: " + soma);
		} else {
			System.out.println("N�o h� n�meros acima de 50.");
		}

		teclado.close();
	}
}
