package Lista_Exercicios_N2;

/*Fa�a um programa que leia um n�mero e imprima todos os n�meros de 0 at� o n�mero
digitado.*/

import java.util.Scanner;

public class Exercicio_22_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero;
		int i;

		System.out.println("Digite um n�mero inteiro:");
		numero = teclado.nextInt();

		for (i = 0; i <= numero; i++) {
			System.out.printf("%d ", i);
		}

		teclado.close();
	}
}
