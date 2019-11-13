package Lista_Exercicios_N2;

import java.util.Random;

public class Exercicio_58_N2 {

	public static void main(String[] args) {
		int[][] matrizM = new int[8][8];
		int[] diag_Principal = new int[matrizM.length];
		int[] diag_Secundaria = new int[matrizM.length];

		System.out.println("Matriz M");
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM.length; j++) {
				matrizM[i][j] = sorteia(10, 50);
				System.out.print(matrizM[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}

		System.out.println("\nVetor DIAGONAL PRINICIPAL");

		for (int i = 0; i < matrizM.length; i++) {

			for (int j = 0; j < matrizM.length; j++) {

				if (i == j) {
					diag_Principal[i] = matrizM[i][j];

					System.out.printf("%d" ,diag_Principal[i]);
					System.out.printf("\t");
				}

			}

		}
		System.out.println();
		System.out.println("");

		int maior = 0;
		for (int i = 0; i < diag_Principal.length; i++) {
			if (diag_Principal[i] > maior) {
				maior = diag_Principal[i];
			}

		}

		System.out.printf("\nO maior valor da Matriz M na diagonal principal é : %d\n", maior);

		System.out.println("\nVetor DIAGONAL SECUNDARIA");
		int soma = 0;
		for (int i = matrizM.length - 1; i >= 0; i--) {

			for (int j = matrizM.length - 1; j >= 0; j--) {
				if (i + j == matrizM.length - 1) {

					diag_Secundaria[i] = matrizM[i][j];

					System.out.print(matrizM[i][j]);
					System.out.printf("\t");
				}

			}
			soma = soma + diag_Secundaria[i];
		}
		System.out.println();
		System.out.println("");
		System.out.println();
		System.out.printf("\nO valor da soma dos valores da diagonal secundaria é: %d\n", soma);

	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}

}
