package Lista_Exercicios_N2;

import java.util.Scanner;
import java.util.Random;

public class Exercicio_50_vetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int par = 0, impar = 0, somaPar = 0, somaImpar = 0, quantpar = 0, quantimpar = 0;
		int i;
		int limiteVetor1 = 10, limiteVetor2 = 5;
		int[] vetor1 = new int[limiteVetor1];
		int[] vetor2 = new int[limiteVetor2];
		int[] vetorResultante1 = new int[limiteVetor1];
		int[] vetorResultante2 = new int[limiteVetor1];

		System.out.println();
		System.out.printf("Primeiro Vetor1[i] = ");
		for (i = 0; i < limiteVetor1; i++) {
			vetor1[i] = sorteia(1, 50);
			System.out.printf("%d  ", vetor1[i]);
		}
		System.out.println("\n");
		System.out.printf("Segundo Vetor2[i] = ");
		for (i = 0; i < limiteVetor2; i++) {
			vetor2[i] = sorteia(1, 50);
			System.out.printf("%d  ", vetor2[i]);
		}

		int j = 0;
		int k = 0;
		System.out.println("");

		for (i = 0; i < limiteVetor1; i++) {
			if (vetor1[i] % 2 == 0) {

				somaPar = 0;
				for (j = 0; j < limiteVetor2; j++) {

					par = vetor1[i] + vetor2[j];
					somaPar += par;

					vetorResultante1[quantpar] = somaPar;
					vetor1[i] = 0;
				}
				quantpar++;
				// System.out.println("");
				// System.out.printf(" %d ", somaPar);
			} else {

				somaImpar = 0;
				for (j = 0; j < limiteVetor2; j++) {
					impar = vetor1[i] + vetor2[j];
					somaImpar += impar;

					vetorResultante2[quantimpar] = somaImpar;
					vetor1[i] = 0;

				}
				quantimpar++;
			}
			// System.out.println("");
			// System.out.printf("%d ", somaImpar);

		}
		System.out.println("\n");
		System.out.printf("Quantidade de números pares = %d\n", quantpar);
		System.out.printf("Primeiro VetorResultante1[k] = ");
		for (k = 0; k < quantpar; k++) {

			System.out.printf("%d ", vetorResultante1[k]);
		}
		System.out.println("\n");
		System.out.printf("Quantidade de números impares = %d\n", quantimpar);
		System.out.printf("Segundo VetorResultante2[k] = ");
		for (k = 0; k < quantimpar; k++) {

			System.out.printf("%d ", vetorResultante2[k]);
		}
		teclado.close();
	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
