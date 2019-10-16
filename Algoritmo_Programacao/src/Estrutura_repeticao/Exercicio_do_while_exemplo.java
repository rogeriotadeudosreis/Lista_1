package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio_do_while_exemplo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nome = "";
		String nomeMaiorIdade = "";
		String nomeMenorIdade = "";
		int idade = 0;
		int quantPessoas = 0;
		double soma = 0;
		double media = 0;
		int maior = 1;
		int menor = 999;

		do {

			System.out.print("Digite seu nome:");
			nome = entrada.nextLine();
			System.out.printf("%s, Digite uma idade:", nome);
			idade = entrada.nextInt();
			entrada.nextLine();

			if (idade == 0) {
				System.out.println("Fim da coleta de idade.");
				System.out.println();
			} else if (idade < 0) {
				System.out.println("Idade inválida");
			} else {

				soma += idade;
				quantPessoas++;

				if (idade > maior) {
					maior = idade;
					nomeMaiorIdade = nome;
				}
				if (idade < menor) {
					menor = idade;
					nomeMenorIdade = nome;
				}

			}
		} while (idade != 0);

		media = soma / quantPessoas;

		System.out.println(".............Resumo das estatística...............");
		System.out.println();
		System.out.printf("A quantidade de pessoas é: %d\n", quantPessoas);
		System.out.printf("A média das idades é: %.1f\n", media);
		System.out.printf("%s tem a menor idade é: %d\n", nomeMenorIdade, menor);
		System.out.printf("%s tem a maior idade é: %d\n", nomeMaiorIdade, maior);

		entrada.close();
	}

}
