package Lista_Exercicios_N2;

import java.util.Random;
import java.util.Scanner;

public class Exercxicio_54_N2_Matrizes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[][] A = new int[3][5];
		int[] SL = new int[3];

		for (int i = 0; i < 3; i++) {
			SL[i] = 0;
			for (int j = 0; j < 5; j++) {
				A[i][j] = sorteia(1, 50);

				SL[i] = SL[i] + A[i][j];
			}
		}

		System.out.println("Matriz A:");
		imprimeMatriz(A);

		System.out.println("\n\nVetor SL: ");
		imprimeVetor(SL);
	}

	public static void imprimeVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "   ");
		}
	}

	public static void imprimeMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "   ");
			}
			System.out.println();
		}
	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
