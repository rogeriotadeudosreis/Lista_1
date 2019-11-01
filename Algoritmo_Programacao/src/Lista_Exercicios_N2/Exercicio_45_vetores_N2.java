package Lista_Exercicios_N2;

/*Escreva um programa que receba quinze números inteiros e armazene em um vetor a
raiz quadrada de cada número. Caso o valor digitado seja menor do que zero, o número
-1 deve ser atribuído ao elemento do vetor. Após isso, imprima todos os valores
armazenados.*/

import java.util.Scanner;

public class Exercicio_45_vetores_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int i, n = 5;
		double[] vetor = new double[n];
		double[] vetorB = new double[n];

		for (i = 0; i < vetor.length; i++) {

			System.out.printf("Digite o %do valor inteiro de [%d]:...", i + 1, vetor.length);
			vetor[i] = teclado.nextDouble();
		}

		System.out.println();
		System.out.println("-------------------RESULTADO-----------------\n");
		for (i = 0; i < vetor.length; i++) {

			if (vetor[i] < 0) {

				vetorB[i] = -1;

				System.out.printf("A raiz quadrada de %.0f na posição [%d] é: .....%.0f\n", vetor[i], i, vetorB[i]);

			} else {
				vetorB[i] = Math.sqrt(vetor[i]);
				System.out.printf("A raiz quadrada de %.0f na posição [%d] é: .....%.0f\n", vetor[i], i, vetorB[i]);

			}

		}
		System.out.println();
		System.out.println("----------------FIM DO PROGRAMA--------------\n");
		teclado.close();
	}
}
