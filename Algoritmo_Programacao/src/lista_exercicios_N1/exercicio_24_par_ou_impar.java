package lista_exercicios_N1;

/*Escreva um programa que leia um valor inteiro e diga se o n�mero informado � par ou
�mpar.*/
import java.util.Scanner;

public class exercicio_24_par_ou_impar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.print("Usu�rio, informe um n�mero:");
		num = entrada.nextInt();

		if (num % 2 == 0) {

			System.out.printf("O n�mero informado � par.");
		} else {

			System.out.printf("O n�mero informado � �mpar.");

		}
		entrada.close();
	}
}
