package Lista_Exercicios_N2;

/*Fa�a um programa que leia um vetor de inteiros, de 10 posi��es. A seguir, encontre o
menor elemento (X) e o maior elemento (Y) do vetor. Imprima uma mensagem
mostrando: �O menor elemento do vetor �, X, �e sua posi��o dentro do vetor �: V[x].
J� o maior elemento � �, Y,� e est� na posi��o V[y]�. Assuma que os elementos
informados no vetor s�o todos diferentes entre si.*/

import java.util.Scanner;

public class Exercicio_44_Vetores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int i, menor = 0, maior = 0, posicaoMenor = 0, posicaoMaior = 0, soma = 0;
		int[] vetor = new int[10];

		for (i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o %do valor de [%d]:.....>", i + 1, vetor.length);
			vetor[i] = teclado.nextInt();
			soma += vetor[i];

			if (i == 0) {
				menor = vetor[i];
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
			if (vetor[i] > maior) {
				maior = vetor[i];
			}

		}
		System.out.println();
		for (i = 0; i < vetor.length; i++) {
			if (vetor[i] == menor) {

				System.out.printf("vetor[%d] = %d <---------- menor valor\n", i, menor);

			} else if (vetor[i] == maior) {

				System.out.printf("vetor[%d] = %d <---------- maior valor\n", i, maior);
			} else {
				System.out.printf("vetor[%d] = %d \n", i, vetor[i]);
			}
		}
		System.out.println();
		System.out.printf("A soma dos valores digitados �: %d", soma);
		teclado.close();
	}
}
