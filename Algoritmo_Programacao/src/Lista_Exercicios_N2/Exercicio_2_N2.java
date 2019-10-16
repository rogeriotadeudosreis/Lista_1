package Lista_Exercicios_N2;

/*Escreva um programa que receba a idade de várias pessoas (para teste utilize 10
pessoas). Calcule e imprima: a quantidade de pessoas com até 18 anos; quantidade de
pessoas entre 18 e 65 anos; quantidade de pessoas com mais de 65 anos.*/

import java.util.Scanner;

public class Exercicio_2_N2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int idade = 0;
		int quantPessoas_ate_18 = 0;
		int quantPessoas_entre_18_65 = 0;
		int quantPessoas_acima_65 = 0;
		int somaAte18 = 0;
		int somaEntre18e65 = 0;
		int somaAcima65 = 0;
		double mediaAte18 = 0;
		double mediaEntre18e65 = 0;
		double mediaAcima65 = 0;
		char resp = 'S';
		int cont = 0;

		do {
			do {
				System.out.printf("Digite a %da idade:", cont + 1);
				idade = entrada.nextInt();
				if (idade <= 0)
					System.out.println("Idade informada inválida !, digite novamente:");
			} while (idade <= 0);

			if (idade <= 18) {
				quantPessoas_ate_18++;
				somaAte18 += idade;
				mediaAte18 = somaAte18 / quantPessoas_ate_18;
			} else if (idade > 18 && idade <= 65) {
				quantPessoas_entre_18_65++;
				somaEntre18e65 += idade;
				mediaEntre18e65 = somaEntre18e65 / quantPessoas_entre_18_65;
			} else {
				quantPessoas_acima_65++;
				somaAcima65 += idade;
				mediaAcima65 = somaAcima65 / quantPessoas_acima_65;
			}
			System.out.printf("Deseja continuar ? S (Sim) ou N (Não)\n");
			resp = entrada.next().charAt(0);
			cont++;
		} while (resp == 'S' || resp == 's');

		System.out.printf("O número de pessoas com até 18 anos é: %d\n", quantPessoas_ate_18);
		System.out.printf("O número de pessoas entre 18 e 65 anos é: %d\n", quantPessoas_entre_18_65);
		System.out.printf("O número de pessoas com mais de 65 anos é: %d\n", quantPessoas_acima_65);
		System.out.printf("A soma das idades até 18 anos é: %d\n", somaAte18);
		System.out.printf("A soma das idades entre 18 e 65 é: %d\n", somaEntre18e65);
		System.out.printf("A soma das idades acima de 65 anos é: %d\n", somaAcima65);
		System.out.printf("A média das idades até 18 anos é: %.1f\n", mediaAte18);
		System.out.printf("A média das idades entre 18 e 65 anos é: %.1f\n", mediaEntre18e65);
		System.out.printf("A média das idade acima de 65 anos é:%.1f\n", mediaAcima65);

		entrada.close();
	}
}
