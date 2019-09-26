package lista_exercicios_N1;

/*Desenvolva um programa para calcular e imprimir o preço final de um carro. O valor do
preço inicial de fábrica é informado pelo usuário, porém o usuário ainda poderá acrescentar
novos recursos cujo os preços estão descritos. O valor total do carro deverá ser o preço
inicial de fábrica mais o valor de cada recurso adicionado.*/

import java.util.Scanner;

public class Exercicio_38_preco_veiculo {

	public static void main(String[] args) {

		double preco_inicial, preco_total;
		double recurso1 = 0;
		double recurso2 = 0;
		double recurso3 = 0;
		double recurso4 = 0;
		double ar_cond = 1750.00;
		double pint_met = 800.00;
		double vid_elet = 1200.00;
		double dir_hid = 2000.00;
		char opcao;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o preco inicial do veículo:");
		preco_inicial = entrada.nextDouble();

		System.out.println("Deseja acrescentar ar condicionado ao seu veículo? (S) Sim ou (N) Não");
		opcao = entrada.next().charAt(0);

		if (opcao == 'S') {
			recurso1 = ar_cond;
			System.out.println("Valor do recurso: R$ " + recurso1);

		} else {

		}
		System.out.println("Deseja acrescentar pintura metálica ao seu veículo? (S) Sim ou (N) Não");
		opcao = entrada.next().charAt(0);
		if (opcao == 'S') {
			recurso2 = pint_met;

			System.out.println("Valor do recurso: R$ " + recurso2);

		} else {

		}
		System.out.println("Deseja acrescentar vidro elétrico ao seu veículo? (S) Sim ou (N) Não");
		opcao = entrada.next().charAt(0);
		if (opcao == 'S') {
			recurso3 = vid_elet;

			System.out.println("Valor do recurso: R$ " + recurso3);

		} else {

		}
		System.out.println("Deseja acrescentar direção hidráulica ao seu veículo? (S) Sim ou (N) Não");
		opcao = entrada.next().charAt(0);
		if (opcao == 'S') {
			recurso4 = dir_hid;

			System.out.println("Valor do recurso: R$ " + recurso4);

		} else {

		}

		preco_total = preco_inicial + recurso1 + recurso2 + recurso3 + recurso4;

		System.out.println("Preço total do veículo: " + preco_total);

		entrada.close();
	}
}
