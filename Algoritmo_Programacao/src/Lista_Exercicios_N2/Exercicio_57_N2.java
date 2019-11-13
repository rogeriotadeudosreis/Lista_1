package Lista_Exercicios_N2;

import java.util.Random;

public class Exercicio_57_N2 {

	public static void main(String[] args) {
		int[][] matrizM = new int[5][5];
		int[] SL = new int[5];
		int[] SC = new int[5];

		System.out.println("\nMATRIZ M");
		for (int i = 0; i < matrizM.length; i++) {

			for (int j = 0; j < matrizM[0].length; j++) {

				matrizM[i][j] = sorteia(10, 50);
				System.out.print(matrizM[i][j]);
				System.out.print("  ");
			}
			System.out.println();
		}

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[0].length; j++) {
				SL[i] = SL[i] + matrizM[i][j];
			}
		}

		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM.length; j++) {
				SC[j] = SC[j] + matrizM[i][j];
			}
		}

		System.out.println("\nVetor SL");
		for (int i = 0; i < SL.length; i++) {
			System.out.print(SL[i]);
			System.out.print("  ");
		}
		System.out.println();

		System.out.println("\nVetor SC");
		for (int j = 0; j < SC.length; j++) {
			System.out.print(SC[j]);
			System.out.print("  ");
		}
		System.out.println();

	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
