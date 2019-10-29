package Lista_Exercicios_N2;

/*Faça um programa que leia um intervalo (num_inicial e num_final) e calcule o
somatório de todos os números entre o num_inicial e num_final.*/

import java.util.Scanner;

public class Exercicio_24_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numInicial, numFinal, soma = 0, i;

		System.out.println("Digite um número inicial:");
		numInicial = teclado.nextInt();
		System.out.println("Digite um número final:");
		numFinal = teclado.nextInt();

		System.out.printf("Os números do intervalo entre %d e %d são:\n\n", numInicial, numFinal);
		for (i = numInicial +1; i < numFinal; i++) {
			soma += i;

			System.out.printf("%d ", i);
			
		}
		System.out.println("\n");
		System.out.printf("A soma dos números entre %d e %d = %d", numInicial, numFinal, soma);
		teclado.close();
	}
}
