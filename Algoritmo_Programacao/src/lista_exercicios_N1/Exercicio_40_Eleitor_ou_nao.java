package lista_exercicios_N1;

import java.util.Scanner;

public class Exercicio_40_Eleitor_ou_nao {

	public static void main(String[] args) {

		int idade;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor, digite sua idade:");
		idade = entrada.nextInt();

		if (idade < 16) {
			System.out.println("Não-Eleitor.");
		} else if (idade >= 18 && idade <= 65) {
			System.out.println("Eleitor-Obrigatório.");
		} else {
			System.out.println("Eleitor-Facultativo.");
		}

		entrada.close();
	}
}
