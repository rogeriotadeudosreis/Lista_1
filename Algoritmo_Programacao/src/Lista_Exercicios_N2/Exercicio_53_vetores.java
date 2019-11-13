package Lista_Exercicios_N2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_53_vetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int tamanho = 5;
		int[] vetorA = new int[tamanho];
		int[] vetorB = new int[tamanho];
		int[] soma = new int[tamanho];
		int[] interseccao = new int[tamanho];
		int[] diferenca = new int[tamanho];
		int[] intercalacao = new int[tamanho + tamanho];

		System.out.printf("\nValores do vetor A:............... ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sorteia(1, 10);
			System.out.printf("%d ", vetorA[i]);
		}
		System.out.printf("\nValores do vetor B:............... ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sorteia(1, 10);
			System.out.printf("%d ", vetorB[i]);
		}
		System.out.printf("\nSoma dos vetores A e B:........... ");
		for (int i = 0; i < soma.length; i++) {
			soma[i] = vetorA[i] + vetorB[i];
			System.out.printf("%d ", soma[i]);
		}

		int cont = 0, contDiferenca = 0;
		int encontrou, existe;
		for (int i = 0; i < vetorA.length; i++) {
			encontrou = 0;
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {
					encontrou = 1;
					existe = 0;
					for (int k = 0; k < cont; k++) {
						if (vetorB[j] == interseccao[k]) {
							existe = 1;
						}
					}
					if (existe == 0) {
						interseccao[cont] = vetorA[i];
						cont++;
					}
				}
			}
			if (encontrou == 0) {
				existe = 0;
				for (int k = 0; k < contDiferenca; k++) {
					if (vetorA[i] == diferenca[k]) {
						existe = 1;
					}
				}
				if (existe == 0) {
					diferenca[contDiferenca] = vetorA[i];
					contDiferenca++;
				}
			}
		}

		int j = 0;
		int m = 0;

		for (int i = 0; i < intercalacao.length; i++) {
			if (i % 2 == 0) {
				intercalacao[i] = vetorA[j];
				j++;

			} else {
				intercalacao[i] = vetorB[m];
				m++;
			}

		}

		System.out.printf("\nNúmero das intersecções:.......... %d", cont);
		System.out.printf("\nInterseccao dos vetores A e B:.... ");
		for (int k = 0; k < cont; k++) {

			System.out.printf("%d ", interseccao[k]);

		}
		System.out.printf("\nNúmero das diferenças:............ %d", contDiferenca);
		System.out.printf("\nDiferença dos vetores A e B:...... ");
		for (int l = 0; l < contDiferenca; l++) {

			System.out.printf("%d ", diferenca[l]);

		}

		System.out.printf("\nIntercalação dos vetores A e B:... ");
		for (int i = 0; i < intercalacao.length; i++) {

			System.out.printf("%d ", intercalacao[i]);

		}

		teclado.close();
	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
