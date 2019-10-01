package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio2_exemplo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int cont = 1, soma = 0, idade, quantpessoas;
		float media;

		System.out.println("Informe a quantidade de pessoas:");
		quantpessoas = entrada.nextInt();

		while (cont <= quantpessoas) {
			System.out.println("Digite a idade da pessoa " + cont);
			idade = entrada.nextInt();

			soma = soma + idade;
			cont++;

		}
		media = soma / quantpessoas;
		
		System.out.printf("A média das idade é: %.2f", media);

		entrada.close();
	}
}
