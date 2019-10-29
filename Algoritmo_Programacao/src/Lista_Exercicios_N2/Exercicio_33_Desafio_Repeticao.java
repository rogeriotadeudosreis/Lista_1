package Lista_Exercicios_N2;

import java.util.Scanner;

public class Exercicio_33_Desafio_Repeticao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int resp;
		int candidato;
		int cand1 = 0;
		int cand2 = 0;
		int cand3 = 0;
		int idade, sexo, candmaisvotado = 0;
		double somaidade1 = 0, somaidade2 = 0, somaidade3 = 0, mediaidade = 0;
		int qtdemulher1 = 0, qtdemulher2 = 0, qtdemulher3 = 0, qtdehomem1 = 0, qtdehomem2 = 0, qtdehomem3 = 0;

		do {

			do {
				System.out.printf("Digite o canditado preferido do %do(a) eleitor(a): 1,2 ou 3:...................",
						cont + 1);
				candidato = teclado.nextInt();
				if (candidato != 1 && candidato != 2 && candidato != 3) {
					System.out.printf("Candidato inválido ! digite novamente:\n");
				}

			} while (candidato != 1 && candidato != 2 && candidato != 3);

			System.out.printf("Digite a idade:...............................................................");
			idade = teclado.nextInt();
			System.out.printf("Digite o sexo do eleitor(a): 1-mulher ou 2-homem .............................");
			sexo = teclado.nextInt();
			System.out.printf("Continuar pesquisa ? 1-Sim 0-Não .............................................");
			resp = teclado.nextInt();

			if (candidato == 1) {
				cand1++;
				somaidade1 += idade;

				if (sexo == 1) {

					qtdemulher1++;

				} else {

					qtdehomem1++;

				}

			} else if (candidato == 2) {
				cand2++;
				somaidade2 += idade;

				if (sexo == 1) {

					qtdemulher2++;

				} else {
					qtdehomem2++;

				}
			} else {
				cand3++;
				somaidade3 += idade;

				if (sexo == 1) {

					qtdemulher3++;

				} else {
					qtdehomem3++;

				}
			}

			cont++;
		} while (resp == 1);

		System.out.println();
		System.out.println("------------------Fim da pesquisa.-------------------\n");

		if (cand1 > cand2 && cand1 > cand3) {
			candmaisvotado = cand1;
			mediaidade = somaidade1 / cand1;
			System.out.printf("O candidato 1 foi o mais votado com %d votos\n", candmaisvotado);
			System.out.printf("A média das idade dos eleitores desse candidato é: ...%.1f\n", mediaidade);

		} else if (cand2 > cand1 && cand2 > cand3) {
			candmaisvotado = cand2;
			mediaidade = somaidade2 / cand2;
			System.out.printf("O candidato 2 foi o mais votado com %d votos\n", candmaisvotado);
			System.out.printf("A média das idade dos eleitores desse candidato é: ...%.1f\n", mediaidade);

		} else {
			candmaisvotado = cand3;
			mediaidade = somaidade3 / cand3;
			System.out.printf("O candidato 3 foi o mais votado com %d votos\n", candmaisvotado);
			System.out.printf("A média das idade dos eleitores do candidato mais votado é:... %.1f\n", mediaidade);

		}
		if (qtdehomem1 > qtdehomem2 && qtdehomem1 > qtdehomem3) {
			System.out.printf("O candidato 1 é o preferido dos homens com %d voto(s)\n", qtdehomem1);

		} else if (qtdehomem2 > qtdehomem1 && qtdehomem2 > qtdehomem3) {
			System.out.printf("O candidato 2 é o preferido dos homens com %d voto(s)\n", qtdehomem2);

		} else if (qtdehomem3 > qtdehomem1 && qtdehomem3 > qtdehomem2) {
			System.out.printf("O candidato 3 é o preferido dos homens com %d voto(s)\n", qtdehomem3);

		} else {
			System.out.printf("Houve empate na preferência dos homens\n");
		}

		teclado.close();
	}
}
