package Lista_Exercicios_N2;

/*Faça um programa que utilizando a estrutura Do-While, leia para um número
indeterminado de pessoas: leia a idade de cada pessoa, sendo que a leitura da idade 0
(zero) indica o fim dos dados e não deve ser considerada: calcule e escreva o número de
pessoas; calcule e escreva a idade média do grupo; calcule e escreva a menor idade e a
maior idade.*/

import java.util.Scanner;

public class Exercicio_14_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int idade;
		int cont = 1;
		int contpessoas = 0;
		int idademenor = 2;
		int idademaior = 4;
		double media = 0;
		double somaidade = 0;

		do {

			System.out.printf("Digite a idade da %da pessoa:", cont++);
			idade = teclado.nextInt();

			if (idade == 0) {
				System.out.println("Fim dos dados.");
			} 
			else {

				if (contpessoas == 0) {
					idademenor = idade;
					idademaior = idade;
				}
				contpessoas++;
				somaidade += idade;

				if (idade < idademenor) {
					idademenor = idade;
				}

				if (idade > idademaior) {
					idademaior = idade;
				}
			}
		} while (idade > 0);

		media = somaidade / contpessoas;

		System.out.printf("O número de pessoas informadas foi: %d\n", contpessoas);
		System.out.printf("A média das idades informadas é: %.1f\n", media);
		System.out.printf("A menor idade digitada foi: %d\n", idademenor);
		System.out.printf("A maior idade digitado foi: %d\n", idademaior);
		teclado.close();
	}
}
