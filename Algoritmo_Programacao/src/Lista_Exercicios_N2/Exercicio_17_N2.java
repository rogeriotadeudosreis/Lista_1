package Lista_Exercicios_N2;

/*Faça um programa que Leia o Nome e duas notas de uma pessoa e ao final, o programa
deve calcular a média aritmética entre as duas notas. O programa deve ser capaz de
validar se a nota informada é válida (0.0 ≤ nota ≥ 10), caso contrário o sistema deve
informar ao usuário o erro e pedir para ler novamente. Usar um laço Do-While na
leitura das notas, e gerar uma saída conforme o exemplo de tela de saída abaixo:*/

import java.util.Scanner;

public class Exercicio_17_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int cont = 0;
		String aluno = "";
		double notaA, notaB;
		double soma = 0, media = 0;
		char resp = 'S';

		while (resp == 'S' || resp == 's') {

			System.out.printf("Entre com o nome do %d aluno:", cont +1);
			aluno = teclado.nextLine();
			
			
			do {
				System.out.printf("Entre com a nota A do %s:", aluno);
				notaA = teclado.nextDouble();
				if (notaA < 0 || notaA > 10) {
					System.out.printf("ERRO: Nota inválida! Digite novamente a nota:\n");
				}
			} while (notaA < 0 || notaA > 10);

			do {
				System.out.printf("Entre com a nota B do %s:", aluno);
				notaB = teclado.nextDouble();
				if (notaB < 0 || notaB > 10) {
					System.out.printf("ERRO: Nota inválida! Digite novamente a nota:\n");
				}
			} while (notaB < 0 || notaB > 10);

			soma = notaA + notaB;
			media = soma / 2;
			
			System.out.println("--------------------------------------------------");
			System.out.printf("O aluno %s tem média: %.2f\n", aluno, media);
			System.out.println("--------------------------------------------------");
			System.out.print("Deseja continuar: (Sim/Não)");
			resp = teclado.next().charAt(0);
			teclado.nextLine();
			cont++;
		}
		System.out.println("Fim do programa. ");
		teclado.close();
	}
}
