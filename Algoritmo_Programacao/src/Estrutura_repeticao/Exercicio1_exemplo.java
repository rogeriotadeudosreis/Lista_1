package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio1_exemplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, c;
		System.out.println("Digite um número: ");
		n = teclado.nextInt();
		c = 1;

		while (c <= 10) {
			System.out.printf("\n %d x %d = %d", n, c, n * c);
			c++;
		}
		teclado.close();

	}
}
