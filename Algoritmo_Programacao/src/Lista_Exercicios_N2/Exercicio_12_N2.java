package Lista_Exercicios_N2;

/*Faça um programa que leia dois números inteiros positivos (n1 e n2). Repita a leitura
até que n1 seja menor que n2, quando n2 for maior que n1, imprima os números entre
n1 e n2.*/

import java.util.Scanner;

public class Exercicio_12_N2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n1;
		int n2;
		int cont = 0;

		do {
			System.out.println("Digite n1 positivo:");
			n1 = teclado.nextInt();
			System.out.println("Digite n2 positivo:");
			n2 = teclado.nextInt();

			if (n1 < n2) {
				System.out.println("Saindo...");
			} else {
				cont = n2;
				while (cont <= n1) {
					System.out.println(cont);
					cont++;
				}
			}

		} while (n1 >= n2);

		teclado.close();
	}

}
