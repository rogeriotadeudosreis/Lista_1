package lista_exercicios_N1;

/*Escreva um programa que leia um valor inteiro e diga se o número informado é par ou
ímpar.*/
import java.util.Scanner;

public class exercicio_24_par_ou_impar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.print("Usuário, informe um número:");
		num = entrada.nextInt();

		if (num % 2 == 0) {

			System.out.printf("O número informado é par.");
		} else {

			System.out.printf("O número informado é ímpar.");

		}
		entrada.close();
	}
}
