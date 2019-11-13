package Lista_Exercicios_N2;

import java.util.Random;

public class Exercicio_55_N2 {

	public static void main(String[] args) {
		int[][] matrizA = new int[4][4];
		int[][] matrizB = new int[4][4];
		int[][] matriz_soma = new int[4][4];

		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrizA[i][j] = sorteia(10, 50);

			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrizB[i][j] = sorteia(10, 50);

			}

		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz_soma[i][j] = matrizA[i][j] + matrizB[i][j];

			}

		}

		System.out.println("\nMatriz soma");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz_soma[i][j]);
				System.out.print("  ");

			}
			System.out.println();

		}

		System.out.println("\nMatriz A");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrizA[i][j]);
				System.out.print("  ");

			}
			System.out.println();

		}

		System.out.println("\nMatriz B");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrizB[i][j]);
				System.out.print("  ");

			}
			System.out.println();

		}

	}
	 public static int sorteia(int limiteInferior, int limiteSuperior) {
	        Random rd = new Random();
	        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	    }

}
