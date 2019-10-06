package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio_4_exemplo {

	public static void main(String[] args) {

		double fx = 0, x = 4;
		int cont = 0;

		while (cont < 10) {

			fx = 2 * (x * x) + (3 * x) - 5;
			x++;
			System.out.printf("A saída de f(x) para os dez valores são: %.2f\n", fx);
			cont++;
		}

	}
}
