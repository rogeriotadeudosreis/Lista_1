package lista_exercicios_N1;

/*Crie um programa que leia um valor inteiro e diga se ele é positivo, negativo ou nulo.*/
import java.util.Scanner;

public class exercicio_25_pos_neg_nulo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.print("Usuário, informe um número:");
		num = entrada.nextInt();

		if (num > 0) {
			System.out.printf("O número informado é positivo.");
		}
		else if (num < 0) {
			System.out.printf("O número informado é negativo.");
		} else {
			System.out.printf("O número informado é nulo.");
		}

		entrada.close();
	}
}
