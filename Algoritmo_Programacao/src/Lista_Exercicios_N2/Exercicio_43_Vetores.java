package Lista_Exercicios_N2;

/*Faça um programa que preencha um vetor com 10 números inteiros. Calcule e mostre os
números superiores a 50 e suas respectivas posições. O programa deverá mostrar uma
mensagem se não existir nenhum número nessa condição*/

import java.util.Scanner;

public class Exercicio_43_Vetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int i, soma = 0;

		int[] vetor = new int[10];

		for (i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %do. número inteiro:....................", i + 1);
			vetor[i] = teclado.nextInt();
		}
		System.out.println();
		System.out.printf(".....Número.....Posição .....\n");

		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] > 50) {

				soma += vetor[i];
				System.out.printf("       %d         [%d]\n", vetor[i], i);

			}
		}
		if (soma > 0) {

			System.out.println("A soma dos números acima de 50 é: " + soma);
		} else {
			System.out.println("Não há números acima de 50.");
		}

		teclado.close();
	}
}
