package Lista_Exercicios_N2;

/*Escreva um programa que receba dois números x e y e calcule xy. Obs. Não utilize
nenhuma biblioteca matemática, apenas a estrutura de repetição.*/

import java.util.Scanner;

public class Exercicio_27_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int x, y, i;
		int aux = 0;

		System.out.println("Digite um número x:");
		x = teclado.nextInt();
		System.out.println("Digite um número y:");
		y = teclado.nextInt();
		aux = x;

		for (i = 1; i < y; i++) {

			System.out.printf(" x(%d) elevado a y(%d) na posição (%d) = %d\n", aux, i, i, x);
			x = x * aux;
		}
		System.out.println("----------------------------------------");
		System.out.printf(" x(%d) elevado a y(%d) = %d\n", aux, y, x);
		teclado.close();
	}
}
