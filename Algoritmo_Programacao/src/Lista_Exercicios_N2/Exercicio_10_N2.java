package Lista_Exercicios_N2;

/*Escreva um programa que receba v�rios n�meros inteiros informados pelo usu�rio
enquanto os mesmos forem positivos. Imprimir quantos n�meros foram digitados.*/

import java.util.Scanner;

public class Exercicio_10_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = 0;
		int soma = 0;
		int cont = 0;

		do {
			System.out.printf("Digite o %do n�mero positivo:\n", cont + 1);
			numero = teclado.nextInt();

			while (numero <= 0) {
				System.out.println("N�mero inv�lido para esta opera��o!\nDigite novamente:");
				numero = teclado.nextInt();
			}
			
			soma = soma + numero;

			cont++;
		} while (numero > 0);
		System.out.printf("Quantidade de n�meros digitados: %d\n", cont);
		System.out.printf("A soma dos n�meros digitados �: %d\n", soma);

		teclado.close();
	}
}
