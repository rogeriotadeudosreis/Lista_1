package Lista_Exercicios_N2;

/*Escreva um programa que calcule o fatorial de um n�mero inteiro N fornecido pelo
usu�rio. Cuidado com valores inv�lidos!*/

import java.util.Scanner;

public class Exercicio_6_N2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num = 0;
		int fatorial = 1;
		int cont;

		System.out.print("Digite o valor de um n�mero:");
		num = entrada.nextInt();

		while (num <=0) {
		System.out.println("Valor inv�lido.\nDigite novamente:");
		num = entrada.nextInt();
		
		}
		cont = num;

		while (cont > 0) {

			fatorial = fatorial * cont;
			cont--;

		}

		System.out.printf("O fatorial do n�mero %d digitado �: %d\n", num, fatorial);
	}
}
