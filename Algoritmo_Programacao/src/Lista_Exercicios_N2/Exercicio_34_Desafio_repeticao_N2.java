package Lista_Exercicios_N2;

import java.util.Scanner;

public class Exercicio_34_Desafio_repeticao_N2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int cont = 0;
		int matricula, numCarros, i;
		double valorCarro, resp;
		double salarioFixo = 1500.00, salarioTotal = 0;
		double comissaoTotal = 0, comissao1 = 100.00, comissao2 = 200.00, percBonificacao = 0.01, bonificacao = 0,
				valorTotalCarros = 0;

		do {
			System.out.println();
			System.out.printf("Informe a matr�cula do %do(a) vendedor(a):..........", cont + 1);
			matricula = teclado.nextInt();
			System.out.printf("Informe o n�mero de carros vendidos: ..............");
			numCarros = teclado.nextInt();

			for (i = 1; i <= numCarros; i++) {
				System.out.printf("Informe o valor do %do carro: ......................", i);
				valorCarro = teclado.nextDouble();
				valorTotalCarros += valorCarro;
			}

			if (numCarros <= 10 && valorTotalCarros < 50.000) {
				comissaoTotal = numCarros * comissao1;
				salarioTotal = salarioFixo + comissaoTotal;
			}
			else if (numCarros <= 10 && valorTotalCarros > 50.000) {
				comissaoTotal = numCarros * comissao1;
				bonificacao = valorTotalCarros * percBonificacao;
				salarioTotal = salarioFixo + comissaoTotal + bonificacao;

			}
			else if (numCarros > 10 && valorTotalCarros < 50.000) {
				comissaoTotal = numCarros * comissao2;
				salarioTotal = salarioFixo + comissaoTotal;
			}
			else if (numCarros > 10 && valorTotalCarros > 50.000) {
				comissaoTotal = numCarros * comissao2;
				bonificacao = valorTotalCarros * percBonificacao;
				salarioTotal = salarioFixo + comissaoTotal + bonificacao;

			}

			System.out.println();
			System.out.printf("Valor do salario fixo:..................................%.2f\n", salarioFixo);
			System.out.printf("Valor total dos carros vendidos: .......................%.2f\n", valorTotalCarros);
			System.out.printf("Valor da comiss�o total: ...............................%.2f\n", comissaoTotal);
			System.out.printf("Valor da bonifica��o: %.2f\n", bonificacao);
			System.out.printf("Sal�rio total do(a) vendedor(a) sob matr�cula %d : R$ %.2f\n", matricula, salarioTotal);
			System.out.println();
			System.out.printf("Calcular vendas do pr�ximo vendedor? 1-Sim 2-N�o.........");
			resp = teclado.nextInt();
			cont++;
		} while (resp == 1);

		teclado.close();
	}
}
