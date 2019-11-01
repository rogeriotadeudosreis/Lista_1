package Lista_Exercicios_N2;

import java.util.Random;

public class Exercicio_48_Feito_em_classe_pelo_prof {
	public static void main(String[] args) {

		int[] num = new int[10];
		int[] divis = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = sorteia(1, 50);
		}

		System.out.println("Vetor Num:");
		imprimeVetor(num);

		for (int i = 0; i < divis.length; i++) {
			divis[i] = sorteia(1, 10);
		}

		System.out.println("\n\nVetor Divis: ");
		imprimeVetor(divis);

		System.out.println("\n");

		for (int i = 0; i < num.length; i++) {
			System.out.println("Numero: " + num[i]);
			int j = 0;
			for (j = 0; j < divis.length; j++) {
				if (num[i] % divis[j] == 0) {
					System.out.println("Divisivel por " + divis[j] + ", que está na posição " + j);
				}

			}
		}
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

}
