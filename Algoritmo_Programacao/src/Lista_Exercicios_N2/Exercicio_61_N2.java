package Lista_Exercicios_N2;

import java.util.Random;

public class Exercicio_61_N2 {

	public static void main(String[] args) {

		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		int[][] matriz_resultante = new int[2][5];

		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = sorteia(10, 50);
			vetor2[i] = sorteia(10, 50);
		}
		System.out.println("Vetor 1");
		imprimeVetor(vetor1);
		System.out.println();
		System.out.println("Vetor 2");
		imprimeVetor(vetor2);
		System.out.println();

		int p = 0;
		int im = 0;
		int x = 0;
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 5; j++) {
				x++;
				if (x % 2 == 1) {
					matriz_resultante[i][j] = vetor1[p];
					p++;
				} else {
					matriz_resultante[i][j] = vetor2[im];
					im++;
				}

			}

		}

		System.out.println();
		System.out.println("Matriz resultante");
		imprimeMatriz(matriz_resultante);
		System.out.println();

	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
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
}