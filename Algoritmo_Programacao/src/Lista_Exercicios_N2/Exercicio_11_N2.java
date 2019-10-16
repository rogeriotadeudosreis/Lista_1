package Lista_Exercicios_N2;

/*Escreva um programa que leia uma quantidade inteira N e, em seguida, leia N valores
double. Calcule e informe a média dos N valores lidos.*/

import java.util.Scanner;

public class Exercicio_11_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int contador = 0;
		double numdouble;
		double media = 0;
		double soma = 0;
		char resp = 'S';

		do {

			System.out.println("Digite um número flutuante:");
			numdouble = teclado.nextDouble();
			System.out.println("Deseja continuar ? Digite S, senão digite N ");
			resp = teclado.next().charAt(0);
			contador++;
			soma = soma + numdouble;

		} while (resp == 'S' || resp == 's');

		media = soma / contador;

		System.out.printf("A quantidade de números digitados é: %d\n", contador);
		System.out.printf("A média dos números digitados é: %.2f\n", media);

		teclado.close();
	}
}
