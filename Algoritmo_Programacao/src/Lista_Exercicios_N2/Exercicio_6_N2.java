package Lista_Exercicios_N2;

/*Escreva um programa que calcule o fatorial de um número inteiro N fornecido pelo
usuário. Cuidado com valores inválidos!*/

import java.util.Scanner;

public class Exercicio_6_N2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num = 0;
		int fatorial = 1;
		int cont;

		System.out.print("Digite o valor de um número:");
		num = entrada.nextInt();

		while (num <=0) {
		System.out.println("Valor inválido.\nDigite novamente:");
		num = entrada.nextInt();
		
		}
		cont = num;

		while (cont > 0) {

			fatorial = fatorial * cont;
			cont--;

		}

		System.out.printf("O fatorial do número %d digitado é: %d\n", num, fatorial);
	}
}
