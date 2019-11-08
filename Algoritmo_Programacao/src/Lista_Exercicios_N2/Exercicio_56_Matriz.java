package Lista_Exercicios_N2;

/*56. Escreva um programa que leia uma matriz de inteiros A 3x5. Gere e imprima o vetor SL
de tamanho 3, onde cada elemento desse vetor é a soma dos elementos de uma linha da matriz A.*/

import java.util.Scanner;
import java.util.Random;

public class Exercicio_56_Matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double mediavetor = 0;
		int linha = 3, coluna = 5, somavetor = 0, elementos = 0;
		int[][] A = new int[linha][coluna];
		int[] SL = new int[3];
		int[] SC = new int[5];

		System.out.printf("\nOs valores do vetor SL são:\n");
		for (int i = 0; i < linha; i++) {

			for (int j = 0; j < coluna; j++) {

				A[i][j] = sorteia(1, 5);

				SL[i] = SL[i] + A[i][j];
				SC[j] = SC[j] + A[i][j];
				somavetor += A[i][j];

			}

			System.out.printf("%d  ", SL[i]);

		}
		elementos = (linha * coluna);
		System.out.printf("\nA quantidade de elementos do vetor A é: %d", elementos);
		mediavetor = somavetor / (linha * coluna);
		System.out.printf("\nA soma dos valores do vetor A é: %d", somavetor);
		System.out.printf("\nA média dos valores do vetor A é: %.1f", mediavetor);
		System.out.println();
		System.out.printf("\nOs valores do vetor SC são:\n");
		System.out.println();

		for (int j = 0; j < coluna; j++) {
			System.out.printf("%d  ", SC[j]);
		}

		System.out.println("\n\nImpressão da matriz em formato matricial\n");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {

				System.out.printf("%d \t", A[i][j]);

			}
			System.out.println();

		}

		teclado.close();
	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
