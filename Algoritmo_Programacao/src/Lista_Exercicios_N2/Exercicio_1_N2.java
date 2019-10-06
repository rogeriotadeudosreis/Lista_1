package Lista_Exercicios_N2;

/*Faça um programa que leia dois números inteiros, o primeiro é o valor inicial de um
contador, e o segundo é o valor final do contador (testar se o valor inicial fornecido é
inferior ao valor final). Usando o comando While, escreva na tela uma contagem que
comece no primeiro número lido, escreva os números seguintes colocando sempre
apenas um número em cada nova linha da tela, e terminando a contagem quando chegar
ao valor final indicado.*/

import java.util.Scanner;

public class Exercicio_1_N2 {

	public static void main(String[] args) {

		int numInicial, numFinal, contagem = 1;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inicial:");
		numInicial = entrada.nextInt();
		System.out.println("Digite um número final:");
		numFinal = entrada.nextInt();

		while (numFinal < numInicial) {
			System.out.println("Número final inválido!, digite novamente:");
			numFinal = entrada.nextInt();
		}
		while (numInicial <= numFinal) {

			contagem = numInicial++;

			System.out.printf("Contagem: %d\n", contagem);
		}

		entrada.close();
	}
}
