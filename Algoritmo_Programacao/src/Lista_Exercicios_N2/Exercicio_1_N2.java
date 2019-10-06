package Lista_Exercicios_N2;

/*Fa�a um programa que leia dois n�meros inteiros, o primeiro � o valor inicial de um
contador, e o segundo � o valor final do contador (testar se o valor inicial fornecido �
inferior ao valor final). Usando o comando While, escreva na tela uma contagem que
comece no primeiro n�mero lido, escreva os n�meros seguintes colocando sempre
apenas um n�mero em cada nova linha da tela, e terminando a contagem quando chegar
ao valor final indicado.*/

import java.util.Scanner;

public class Exercicio_1_N2 {

	public static void main(String[] args) {

		int numInicial, numFinal, contagem = 1;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero inicial:");
		numInicial = entrada.nextInt();
		System.out.println("Digite um n�mero final:");
		numFinal = entrada.nextInt();

		while (numFinal < numInicial) {
			System.out.println("N�mero final inv�lido!, digite novamente:");
			numFinal = entrada.nextInt();
		}
		while (numInicial <= numFinal) {

			contagem = numInicial++;

			System.out.printf("Contagem: %d\n", contagem);
		}

		entrada.close();
	}
}
