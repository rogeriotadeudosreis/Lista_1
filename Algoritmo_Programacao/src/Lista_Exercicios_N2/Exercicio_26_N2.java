package Lista_Exercicios_N2;
/*Faça um programa que receba duas notas de cada um dos 5 alunos de uma turma,
calcule e imprima a média aritmética de cada aluno e imprima uma mensagem*/

import java.util.Scanner;

public class Exercicio_26_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double nota1, nota2;
		int i;
		double soma = 0, media = 0;

		for (i = 0; i < 5; i++) {

			System.out.printf("Digite a nota 1 do %do. aluno: ", i + 1);
			nota1 = teclado.nextDouble();
			System.out.printf("Digite a nota 2 do %do. aluno: ", i + 1);
			nota2 = teclado.nextDouble();

			soma = nota1 + nota2;
			media = soma / 2;
			System.out.printf("A média aritmética do %do. aluno é: %.1f\n", i + 1, media);
			System.out.println("");
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Fim do programa.");
		teclado.close();
	}
}
