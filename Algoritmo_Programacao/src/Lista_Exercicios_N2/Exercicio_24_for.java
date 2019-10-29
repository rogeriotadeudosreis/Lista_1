package Lista_Exercicios_N2;

/*Fa�a um programa que leia um intervalo (num_inicial e num_final) e calcule o
somat�rio de todos os n�meros entre o num_inicial e num_final.*/

import java.util.Scanner;

public class Exercicio_24_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numInicial, numFinal, soma = 0, i;

		System.out.println("Digite um n�mero inicial:");
		numInicial = teclado.nextInt();
		System.out.println("Digite um n�mero final:");
		numFinal = teclado.nextInt();

		System.out.printf("Os n�meros do intervalo entre %d e %d s�o:\n\n", numInicial, numFinal);
		for (i = numInicial +1; i < numFinal; i++) {
			soma += i;

			System.out.printf("%d ", i);
			
		}
		System.out.println("\n");
		System.out.printf("A soma dos n�meros entre %d e %d = %d", numInicial, numFinal, soma);
		teclado.close();
	}
}
