package Lista_Exercicios_N2;

/*Escreva um programa que receba vários números inteiros informados pelo usuário
enquanto os mesmos forem positivos. Imprimir quantos números foram digitados.*/

import java.util.Scanner;

public class Exercicio_10_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		int soma = 0;
		int cont = 0;

		do {
			System.out.printf("Digite o %do número positivo:\n", cont + 1);
			numero = teclado.nextInt();

			while (numero <= 0) {
				System.out.println("Número inválido para esta operação!\nDigite novamente:");
				numero = teclado.nextInt();
			}
			
			soma = soma + numero;

			cont++;
		} while (numero > 0);
		System.out.printf("Quantidade de números digitados: %d\n", cont);
		System.out.printf("A soma dos números digitados é: %d\n", soma);

		teclado.close();
	}
}
