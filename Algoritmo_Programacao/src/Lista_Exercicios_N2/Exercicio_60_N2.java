package Lista_Exercicios_N2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_60_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int linha = 5;
		int coluna = 4;
		double[][] matrizNotas = new double[linha][coluna];
		double[] vetorBimestre = new double[4];
		double[] vetorMedia = new double[5];
		String[] legendaNota = { "N1", "N2", "N3", "N4" };
		String[] legendaAluno = { "Aluno 1", "Aluno 2", "Aluno 3", "Aluno 4", "Aluno 5" };

		double somaLinha = 0;
		double somaColuna = 0;

		System.out.printf("\n\t>");
		for (int i = 0; i < legendaNota.length; i++) {

			System.out.printf(" %s     ", legendaNota[i]);
		}

		System.out.println();

		for (int i = 0; i < linha; i++) {

			System.out.printf("%s > ", legendaAluno[i]);
			for (int j = 0; j < coluna; j++) {

				matrizNotas[i][j] = sorteia(10, 20);
				vetorMedia[i] += matrizNotas[i][j] / coluna;
				vetorBimestre[j] += matrizNotas[i][j] / linha;
				System.out.printf("%.1f\t", matrizNotas[i][j]);
			}
			System.out.printf("| %.2f", vetorMedia[i]);

			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < vetorBimestre.length; i++) {
			System.out.printf("\t%.2f", vetorBimestre[i]);
		}
	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
