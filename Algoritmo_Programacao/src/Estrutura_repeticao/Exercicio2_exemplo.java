package Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio2_exemplo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int cont = 1, idade, pessoas;

		int quantPessoasMaiores = 0, quantPessoasMenores = 0;
		float media, soma = 0;

		System.out.println("Informe a quantidade de pessoas a serem entrevistadas:");
		pessoas = entrada.nextInt();

		while (cont <= pessoas) {
			System.out.printf("Digite a idade da %do pessoa:", cont);
			idade = entrada.nextInt();
		
			soma = soma + idade;
			cont++;

			if (idade >= 18) {
				quantPessoasMaiores++;
			} else {
				quantPessoasMenores++;
			}

		}
		media = soma / pessoas;

		System.out.printf("A média das idade é: %.1f\n", media);
		System.out.printf("A quantidade de pessoas maiores de idade é: %d\n", quantPessoasMaiores);
		System.out.printf("A quantidade de pessoas menores de idade é: %d\n", quantPessoasMenores);

		entrada.close();
	}
}
