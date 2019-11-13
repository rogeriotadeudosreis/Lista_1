package Lista_Exercicios_N2;

import java.util.Random;

public class Exercicio_59_N2 {

	public static void main(String[] args) {
		int[][] matrizA = new int[3][3];
		int[][] matrizB = new int[3][3];

		System.out.println("Matriz A");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				matrizA[i][j] = sorteia(10, 20);

				System.out.print(matrizA[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Matriz B");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				matrizB[i][j] = sorteia(10, 20);

				System.out.print(matrizB[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				for (int m = 0; m < matrizB.length; m++) {
					for (int n = 0; n < matrizB.length; n++) {
						if (matrizA[i][j] == matrizB[m][n]) {
							System.out.printf(
									"Encontrado o valor %d na Matriz A [%d][%d]"
											+ " e também na Matriz B [%d][%d]\n",
									matrizA[m][n], i, j, m, n);
						}

					}

				}

			}

		}

	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
