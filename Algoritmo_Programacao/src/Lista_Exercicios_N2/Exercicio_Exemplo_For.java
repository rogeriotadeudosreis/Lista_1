package Lista_Exercicios_N2;

import java.util.Scanner;

public class Exercicio_Exemplo_For {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n, c;

		System.out.println("Digite um número para a Tabuada:");
		n = teclado.nextInt();

		for (c = 1; c <= 10; c++) {

			System.out.println(n + " X " + c + " = " + n * c);

		}

	}
}
