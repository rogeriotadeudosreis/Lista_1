package Lista_Exercicios_N2;

/*Faça um programa que imprima os números pares e ímpares de 1 até N, onde N deverá
ser informado pelo usuário.*/

import java.util.Scanner;

public class Exercicio_23_For {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		int i;
		int par = 0, impar = 0;

		System.out.printf("Digite um número:  ");
		numero = teclado.nextInt();
		System.out.println("");

		for (i = 1; i <= numero; i++) {

			if (i % 2 != 0) {
				System.out.printf("Número ímpar:..... %d\t\t", i);

			} else {
				System.out.printf("Número par:..... %d\n", i);
			}

		}

		teclado.close();
	}
}
