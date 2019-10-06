package Lista_Exercicios_N2;

/*Escreva um programa que leia uma quantidade de números (para teste use 10)
calculando e imprimindo o maior, o menor e a média entre os números.*/

import java.util.Scanner;

public class Exercicio_3_N2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, maior = 0, menor = 0, cont = 0;
		double media = 0, soma = 0;

		while (cont <10) {

			System.out.printf("Usuário, digite o %d.o número:", cont + 1);
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

		System.out.printf("O maior número entre eles é: %d\n", maior);
		System.out.printf("O menor número entre eles é: %d\n", menor);
		System.out.printf("A média entre os números é: %.1f\n", media);
		entrada.close();
	}
}
