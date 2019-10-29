package Lista_Exercicios_N2;

/*Faça um programa que calcule se um número lido pelo usuário é perfeito. Um número
X é perfeito se a soma dos seus divisores, exceto ele mesmo, é igual a X. Por exemplo,
6 é perfeito visto que 1+2+3 = 6.*/

import java.util.Scanner;

public class Exercicio_30_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int i, soma = 0, divisores = 0, numero;

		System.out.printf("Digite um número inteiro: ");
		numero = teclado.nextInt();
		System.out.println("--------------------------");
		System.out.print("Seus divisores são: ");
		for (i = 1; i < numero; i++) {

			if (numero % i == 0) {

				soma += i;
				
				System.out.printf("%d ", i);
				
			}
		}
		System.out.println("\n");
		
		if (soma == numero) {
			
			System.out.printf("A soma de seus divisores é: %d , portanto o número %d é PERFEITO.\n", soma, numero);
		} else {
			System.out.printf("A soma de seus divisores é: %d , portanto o número %d NÃO é PERFEITO.\n", soma, numero);
		}
		teclado.close();
	}
}
