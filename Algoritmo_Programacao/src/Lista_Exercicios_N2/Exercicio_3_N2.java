package Lista_Exercicios_N2;

/*Escreva um programa que leia uma quantidade de n�meros (para teste use 10)
calculando e imprimindo o maior, o menor e a m�dia entre os n�meros.*/

import java.util.Scanner;

public class Exercicio_3_N2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, maior = 0, menor = 0, cont = 0;
		double media = 0, soma = 0;

		while (cont <10) {

			System.out.printf("Usu�rio, digite o %d.o n�mero:", cont + 1);
			numero = entrada.nextInt();

			if (cont==0) {
				maior = numero;
				menor = numero;
			}
			
			if (numero > maior) {
				maior = numero;

			}
			else if (numero < menor) {
				menor = numero;

			}
			soma += numero;
			cont++;
		}

		media = soma / 10;

		System.out.printf("O maior n�mero entre eles �: %d\n", maior);
		System.out.printf("O menor n�mero entre eles �: %d\n", menor);
		System.out.printf("A m�dia entre os n�meros �: %.1f\n", media);
		entrada.close();
	}
}
