package Lista_Exercicios_N2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_51_vetores_operacoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i;
		int limite1 = 5;
		int limite2 = 5;
		int limite3 = 5;
		int limite4 = 5;
		double[] vetor1 = new double[limite1];
		double[] vetor2 = new double[limite2];
		String[] vetorOp = new String[limite3];

		vetorOp[0] = "+";
		vetorOp[1] = "-";
		vetorOp[2] = "*";
		vetorOp[3] = "+";
		vetorOp[4] = "*";

		double[] vetorResul = new double[limite4];

		System.out.printf("\nValores do vetor1[i] = ");
		for (i = 0; i < vetor1.length; i++) {
			vetor1[i] = sorteia(1, 50);
			System.out.printf("[%.1f]  ", vetor1[i]);
		}
		System.out.printf("\n\nCódigos das operações: ");
		for (i = 0; i < vetorOp.length; i++) {
			System.out.printf("[%s]     ", vetorOp[i]);
		}

		System.out.printf("\n\nValores do vetor2[i] = ");
		for (i = 0; i < vetor2.length; i++) {
			vetor2[i] = sorteia(1, 50);
			System.out.printf("[%.1f]  ", vetor2[i]);

		}
		System.out.println();
		for (i = 0; i < vetorResul.length; i++) {

			switch (vetorOp[i]) {
			case "+":
				vetorResul[i] = vetor1[i] + vetor2[i];
				break;
			case "-":
				vetorResul[i] = vetor1[i] - vetor2[i];
				break;
			case "*":
				vetorResul[i] = vetor1[i] * vetor2[i];
				break;

			}

		}
		System.out.printf("\nResultado            = ");
		for (i = 0; i < vetorResul.length; i++) {
			System.out.printf("[%.1f]  ", vetorResul[i]);
		}
		teclado.close();

	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
