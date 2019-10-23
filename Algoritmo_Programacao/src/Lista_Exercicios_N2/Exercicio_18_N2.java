package Lista_Exercicios_N2;

/*Faça um programa que leia uma senha (número inteiro). Em seguida, pergunte ao
usuário a senha informada, caso a senha esteja errada imprima “Senha incorreta, tente
novamente” e leia novamente a senha. Caso o usuário digite a senha correta, imprima
“Senha correta! Bem-vindo ao sistema”.*/

import java.util.Scanner;

public class Exercicio_18_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int senha, senhainformada;

		System.out.println("Digite sua senha:");
		senha = teclado.nextInt();

		do {

			System.out.printf("Confirme sua senha:");
			senhainformada = teclado.nextInt();

			if (senha != senhainformada) {

				System.out.println("Senha Incorreta, tente novamente:");
			}

		} while (senha != senhainformada);

		System.out.println("Senha correta! Bem-vindo ao sistema.");

		teclado.close();
	}
}
