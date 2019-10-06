package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio3_exemplo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cont = 1, filhos = 0;
		int pessoascomate2filhos = 0, pessoascommaisde2filhos = 0;
		double media, soma = 0;

		while (cont <= 5) {

			System.out.printf("Informe a quantidade de filhos: ?");
			filhos = entrada.nextInt();
			while (filhos < 0) {
				System.out.printf("Quantidade de filhos informado inválida.\n");
				System.out.printf("Informe a quantidade de filhos: ?");
				filhos = entrada.nextInt();
			}
			soma = soma + filhos;
			if (filhos <= 2) {
				pessoascomate2filhos++;
			} else {
				pessoascommaisde2filhos++;
			}

			cont++;
		}

		media = soma / 5;

		System.out.println("Quantidade de pessoas com até 2 filhos: " + pessoascomate2filhos);
		System.out.println("Quantidade de pessoas com mais de 2 filhos: " + pessoascommaisde2filhos);
		System.out.println("Quantidade de filhos: " + soma);
		System.out.println("Média de filhos por pessoa: " + media);

		entrada.close();
	}
}
