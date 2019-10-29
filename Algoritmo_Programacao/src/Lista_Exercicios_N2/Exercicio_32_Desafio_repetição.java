package Lista_Exercicios_N2;

import java.util.Scanner;

public class Exercicio_32_Desafio_repetição {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int cont = 0;
		int nasc, codReg, sexo, resp;
		int anoVigente = 2019;
		double qtderegSP = 0, qtderegOutros = 0;
		double qtdeMenos25 = 0;
		double qtdeMulher = 0;
		int idade = 0;
		double percMenor25 = 0;
		double percMulher = 0;
		double percRegOutros = 0;

		do {
			System.out.printf("Informe a data de nascimento do %do(a) motorista:..................", cont + 1);
			nasc = teclado.nextInt();
			System.out.printf("Informe o sexo: 1-mulher 2-homem...................................");
			sexo = teclado.nextInt();

			do {
				System.out.printf("Informe o código de registro: 1-SP 0-outros....................");
				codReg = teclado.nextInt();
				if (codReg != 1 && codReg != 0) {
					System.out.printf("Código inválido, digite uma das opções válidas:.......");
				}
			} while (codReg != 1 && codReg != 0);

			System.out.printf("Continuar informando ?: 1-sim 0-não\n");
			resp = teclado.nextInt();

			idade = anoVigente - nasc;

			if (idade < 25) {
				qtdeMenos25++;
			}

			if (sexo == 1) {
				qtdeMulher++;
			}
			if (codReg == 0) {
				qtderegOutros++;
			}

			cont++;
		} while (resp == 1);

		percMenor25 = (qtdeMenos25 / cont) * 100;
		percMulher = (qtdeMulher / cont) * 100;
		percRegOutros = (qtderegOutros / cont) * 100;

		System.out.println();
		System.out.printf("Quantidade de motoristas menores de 25 anos: %.1f\n", qtdeMenos25);
		System.out.printf("Quantidade de mulheres: %.1f\n", qtdeMulher);
		System.out.printf("Quantidade de registros fora de SP: %.1f\n", qtderegOutros);
		System.out.println();
		System.out.printf("Percentagem de motoristas menores de 25 anos: %.0f %%\n", percMenor25);
		System.out.printf("Percentagem de motoristas mulheres: %.0f %%\n", percMulher);
		System.out.printf("Percentagem de registros fora de SP: %.1f\n", percRegOutros);

		System.out.printf("Quantidade : %d\n", cont);

		teclado.close();
	}
}
