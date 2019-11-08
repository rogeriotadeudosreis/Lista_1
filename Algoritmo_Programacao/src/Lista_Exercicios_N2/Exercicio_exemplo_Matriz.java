package Lista_Exercicios_N2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_exemplo_Matriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int maxlinha = 3, maxcoluna = 3;
		int[][] matriz = new int[maxlinha][maxcoluna];

		for (int i = 0; i < maxlinha; i++) {

			for (int j = 0; j < maxcoluna; j++) {
				//System.out.printf("Informe a matriz: ");
				matriz[i][j] = sorteia(1,50);
				while (matriz[i][j] < 0) {
				//	System.out.println("Informe apenas números positivos!");
				//	System.out.printf("Informe a matriz", matriz[i][j]);
				//	matriz[i][j] = teclado.nextInt();
				}
			}
		}
		int maior = matriz[0][0];
		int menor = matriz[0][0];
		int linhamaior = 0, colunamaior = 0;
		int linhamenor = 0, colunamenor = 0;
		
		for (int i = 0; i < maxlinha; i++) {
			for (int j = 0; j < maxcoluna; j++) {

				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linhamaior = i;
					colunamaior = j;
				}
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					linhamenor = i;
					colunamenor = j;
				}
				

			}
		}
		System.out.printf("\nO maior elemento da matriz é o: %d na posição[%d][%d]", maior, linhamaior, colunamaior);
		System.out.println();
		System.out.printf("\nO menor elemento da matriz é o: %d na posição[%d][%d]", menor, linhamenor, colunamenor);
		System.out.println();
		System.out.println("\nImpressão da matriz em formato matricial");
		System.out.println();
		for (int i = 0; i < maxlinha; i++) {

			for (int j = 0; j < maxcoluna; j++) {
				System.out.printf("%d \t", matriz[i][j]);

			}
			System.out.println();
		}

		teclado.close();
	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
