package Lista_Exercicios_N2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_53_vetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int tamanho = 10;

		int[] vetorA = new int[tamanho];
		int[] vetorB = new int[tamanho];
		int[] soma = new int[tamanho];
		int[] interseccao = new int[tamanho + tamanho];
		int[] diferenca = new int[tamanho];
		int[] intercalacao = new int[tamanho];

		System.out.printf("\nValores do vetor A:.......... ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sorteia(1, 50);
			System.out.printf("%d ", vetorA[i]);
		}
		System.out.printf("\nValores do vetor B:.......... ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sorteia(1, 50);
			System.out.printf("%d ", vetorB[i]);
		}
		System.out.printf("\nSoma dos vetores A e B:.... ");
		for (int i = 0; i < soma.length; i++) {
			soma[i] = vetorA[i] + vetorB[i];
			System.out.printf("%d ", soma[i]);
		}
		for (int i = 0; i < vetorA[i]; i++) {
			for (int j = 0; j < vetorB[j]; j++) {
				
				
			}
		}
		
		
		
		
		
		
		
		

		teclado.close();
	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
