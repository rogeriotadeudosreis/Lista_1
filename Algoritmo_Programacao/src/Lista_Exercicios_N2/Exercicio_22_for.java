package Lista_Exercicios_N2;

/*Faça um programa que leia um número e imprima todos os números de 0 até o número
digitado.*/

import java.util.Scanner;

public class Exercicio_22_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero;
		int i;

		System.out.println("Digite um número inteiro:");
		numero = teclado.nextInt();

		for (i = 0; i <= numero; i++) {
			System.out.printf("%d ", i);
		}

		teclado.close();
	}
}
