package Lista_Exercicios_N2;

import java.util.Scanner;

public class Exercicio_vetor_exemplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[] aluno = new String[3];
		double[] notas = new double[3];
		double soma = 0;
		double mediaTurma = 0;
		int i;
		int cont = 0;
		double maiorNota = 0;

		for (i = 0; i < notas.length; i++) {
			System.out.printf("Digite o nome do %d.o aluno:", i + 1);
			aluno[i] = teclado.nextLine();
			System.out.printf("Digite a nota do %s.o aluno:", aluno);
			notas[i] = teclado.nextDouble();
			teclado.nextLine();
			

			soma += notas[i];
			
		}
		System.out.println("-----------------------------------------------------------");
		mediaTurma = soma / notas.length;

		for (i = 0; i < notas.length; i++) {
			System.out.printf("A nota do aluno %s digitada foi %.2f.\n", aluno, notas[i]);
			if (notas[i] > mediaTurma) {
				cont++;
				maiorNota = notas[i];
			}
			
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("A quantidade de notas digitadas foram: " + notas.length);
		System.out.printf("A média da turma é: %.2f\n", mediaTurma);
		System.out.printf("Existe(m) %d aluno(s) com a nota acima da média da turma.\n", cont);
		System.out.printf("A maior nota digitada foi %.1f do aluno %s.\n", maiorNota, aluno);
		teclado.close();
	}
}
