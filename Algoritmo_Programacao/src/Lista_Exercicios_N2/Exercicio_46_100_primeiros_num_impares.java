package Lista_Exercicios_N2;

import java.util.Random;

/*Escreva um programa que armazene os 100 primeiros números ímpares em um vetor, e
os 200 primeiros números ímpares em outro vetor. Imprima os dois vetores em seguida.*/

import java.util.Scanner;

public class Exercicio_46_100_primeiros_num_impares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int limitePar = 10, limiteImpar = 20;
		int i, par = 0, impar = 0;
		int[] vetorPar = new int[limitePar];
		int[] vetorImpar = new int[limiteImpar];

		for (i = 0; par < limitePar; i++) {

			if (i % 2 == 0) {
				vetorPar[par] = i;
				par++;

			}

		}

		for (i = 0; impar < limiteImpar; i++) {

			if (i % 2 != 0) {
				vetorImpar[impar] = i;
				impar++;
			}

		}
System.out.println();
		System.out.println("---Vetor par---");
		System.out.println();
		for (i = 0; i < par; i++) {
			System.out.printf(" Posição [%d] > %d\n", i, vetorPar[i]);
		}
		System.out.println();
		System.out.println("---Vetor impar---");
		System.out.println();
		for (i = 0; i < impar; i++) {
			System.out.printf(" Posição [%d] > %d\n", i, vetorImpar[i]);
		}
		teclado.close();
	}
}
