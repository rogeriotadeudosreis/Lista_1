package Lista_Exercicios_N2;

/*Fa�a um programa que imprima os n�meros pares e �mpares de 1 at� N, onde N dever�
ser informado pelo usu�rio.*/

import java.util.Scanner;

public class Exercicio_23_For {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		int i;
		int par = 0, impar = 0;

		System.out.printf("Digite um n�mero:  ");
		numero = teclado.nextInt();
		System.out.println("");

		for (i = 1; i <= numero; i++) {

			if (i % 2 != 0) {
				System.out.printf("N�mero �mpar:..... %d\t\t", i);

			} else {
				System.out.printf("N�mero par:..... %d\n", i);
			}

		}

		teclado.close();
	}
}
