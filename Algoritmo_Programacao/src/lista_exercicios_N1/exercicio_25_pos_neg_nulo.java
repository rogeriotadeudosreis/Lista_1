package lista_exercicios_N1;

/*Crie um programa que leia um valor inteiro e diga se ele � positivo, negativo ou nulo.*/
import java.util.Scanner;

public class exercicio_25_pos_neg_nulo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.print("Usu�rio, informe um n�mero:");
		num = entrada.nextInt();

		if (num > 0) {
			System.out.printf("O n�mero informado � positivo.");
		}
		else if (num < 0) {
			System.out.printf("O n�mero informado � negativo.");
		} else {
			System.out.printf("O n�mero informado � nulo.");
		}

		entrada.close();
	}
}
