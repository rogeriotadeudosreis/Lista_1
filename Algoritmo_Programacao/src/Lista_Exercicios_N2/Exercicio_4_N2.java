package Lista_Exercicios_N2;

/*Escreva um programa que leia o nome e a idade de v�rios usu�rios, e imprima a
seguinte mensagem �O usu�rio *nome* tem *anos* anos de vida�. O programa dever�
continuar executando enquanto o usu�rio informar que deseja continuar.*/

import java.util.Scanner;

public class Exercicio_4_N2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nome;
		int idade = 0;
		char resp = 'S';
		int cont = 0;

		do {

			System.out.printf("Informe o nome do %d.o usu�rio:\n", cont + 1);
			nome = entrada.nextLine();
			System.out.printf("Informe a idade de %s:\n", nome);
			idade = entrada.nextInt();
			System.out.printf("O usu�rio %s tem %d anos de vida.\n", nome, idade);
			System.out.printf("Deseja continuar ? S (Sim) ou N (N�o)\n");
			resp = entrada.next().charAt(0);

			cont++;
			entrada.nextLine();

		} while (resp == 'S' || resp == 's');
		System.out.printf("Fim do programa.");
		entrada.close();
	}
}
