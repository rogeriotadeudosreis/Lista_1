package Lista_Exercicios_N2;

/*Fa�a um programa que leia um n�mero entre 1 e 10 (deve ser validado) e exiba a
tabuada deste n�mero.*/

import java.util.Scanner;

public class Exercicio_25_for {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero, i;
		int tabuada = 0;

		do {
			System.out.println("Digite um n�mero de 1 a 10:");
			numero = teclado.nextInt();
			if (numero < 1 || numero > 10) {
				System.out.println("N�mero inv�lido para esta opera��o, digite novamente:");
				numero = teclado.nextInt();
			}
		} while (numero < 1 || numero > 10);

		System.out.printf("-------Tabuada do n�mero %d -------\n\n", numero);
		for (i = 0; i <= 10; i++) {

			tabuada = i * numero;
			System.out.printf("          %d X %d = %d\n", numero, i, tabuada);

		}

		teclado.close();
	}
}
