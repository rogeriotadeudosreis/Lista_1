package Lista_Exercicios_N2;

/*Uma empresa de pesquisa resolveu entrevistar os torcedores do estado de Goiás para
saber qual a maior torcida. Faça um programa que calcule a quantidade de torcedores de
cada time que torce: G – Goiás, V – Vila Nova, ou O - outros. O programa deve
encerrar quando for digitado F - fim. Escrever ao final o total de torcedores
entrevistados, a quantidade de torcedores do Goiás, a quantidade do Vila Nova, a
quantidade total de torcedores de Outros times*/

import java.util.Scanner;

public class Exercicio_7_N2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int quanttorcGoias = 0;
		int quanttorcVilaNova = 0;
		int quanttorcOutros = 0;
		char resp = 'F';
		String time = " ";
		int soma = 0;

		do {

			System.out.print("Digite a inicial de seu time:\n\nG (Goiás)\nV (Vila Nova)\nO (Outro)");
			time = entrada.nextLine();

			if (time.equalsIgnoreCase("G")) {
				quanttorcGoias = quanttorcGoias + 1;
			} else if (time.equalsIgnoreCase("V")) {
				quanttorcVilaNova = quanttorcVilaNova + 1;
			} else {
				quanttorcOutros = quanttorcOutros + 1;
			}
			System.out.print("Deseja continuar ? S (Sim) ou F (Fim)");
			resp = entrada.next().charAt(0);
			entrada.nextLine();

		} while (resp != 'F' && resp != 'f');

		soma = quanttorcGoias + quanttorcVilaNova + quanttorcOutros;

		System.out.printf("O total de torcedores entrevistado foi: %d\n", soma);
		System.out.printf("O total de torcedores do time Goias é: %d\n", quanttorcGoias);
		System.out.printf("O total de torcedores do time Vila Nova é: %d\n", quanttorcVilaNova);
		System.out.printf("O total de torcedores de outros times é: %d\n", quanttorcOutros);

		entrada.close();
	}
}
