package Lista_Exercicios_N2;

import java.util.Scanner;

public class Exercicio_52_vetor_Onibus {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String resp = "";
		int i, cont = 0, contjanela = 0, contcorredor = 0;
		int janela = 10, corredor = 10;
		int[] vetorJanela = new int[janela];
		int[] vetorCorredor = new int[corredor];
		char poltrona;

		System.out.print("Poltronas no corredor >....");
		for (i = 0; i < corredor; i++) {

			System.out.printf("%d[%d]  ", vetorCorredor[i], i + 1);

		}

		System.out.println();
		System.out.print("Poltronas na janela >......");
		for (i = 0; i < janela; i++) {

			System.out.printf("%d[%d]  ", vetorJanela[i], i + 1);

		}
		System.out.println();
		do {
			for (i = 0; i < vetorCorredor.length; i++) {

				System.out.printf("Escolha sua %da. poltrona (J) Janela (C) Corredor: > ", i + 1);
				poltrona = teclado.next().charAt(0);

				if (poltrona == 'J' || poltrona == 'j') {
					vetorJanela[i] = 1;
					contjanela++;

					if (contjanela >= 10) {
						System.out.printf("Poltronas na janela esgotadas\n!");
						System.out.printf("Escolha uma das do corredor:\n");

					}

				} else if (poltrona == 'C' || poltrona == 'c') {
					vetorCorredor[i] = 1;
					contcorredor++;

					if (contcorredor >= 10) {
						System.out.printf("Poltronas no corredor esgotadas!\n");
						System.out.printf("Escolha uma das janelas:\n");
						poltrona = teclado.next().charAt(0);
					}

				}

				System.out.println("Continuar comprando ? (S) Sim (N) Não: ");
				resp = teclado.next();

			}

			cont++;
		} while (cont < 2 || resp == "S" || resp == "s");
		
		if (resp != "S") {

			System.out.println("Parar de comprar.");
		}

		System.out.print("Poltronas do corredor >....");
		for (i = 0; i < corredor; i++) {

			System.out.printf("%d[%d]  ", vetorCorredor[i], i + 1);

		}
		System.out.println();
		System.out.print("Poltronas da janela >......");

		for (i = 0; i < janela; i++) {
			System.out.printf("%d[%d]  ", vetorJanela[i], i + 1);

		}
		System.out.printf("\nVenda esgotada! Ônibus lotado!");

		teclado.close();

	}
}
