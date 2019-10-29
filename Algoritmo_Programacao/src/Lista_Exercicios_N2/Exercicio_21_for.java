package Lista_Exercicios_N2;

/*Faça um programa que leia o seu nome e o imprima 100 vezes.*/

import java.util.Scanner;

public class Exercicio_21_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i;
		String nome = "Rogério";

		for (i = 0; i < 100; i++) {

			System.out.printf("%d - %s\n", i, nome);
		}

		teclado.close();
	}
}
