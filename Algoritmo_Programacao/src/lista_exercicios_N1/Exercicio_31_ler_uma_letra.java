package lista_exercicios_N1;

import java.util.Scanner;

public class Exercicio_31_ler_uma_letra {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		char letra;

		System.out.println("Usuário, digite uma letra do alfabeto:");
		letra = entrada.next().charAt(0);

		if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' || letra == 'o'
				|| letra == 'O' || letra == 'u' || letra == 'U') {

			System.out.printf("A letra digitada é uma vogal.");
		} else {

			System.out.printf("A letra digitada é uma consoante.");
		}

		entrada.close();
	}
}
