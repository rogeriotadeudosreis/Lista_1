package lista_exercicios_N1;

/*Desenvolva um programa para calcular e imprimir o pre�o final de um carro. O valor do
pre�o inicial de f�brica � informado pelo usu�rio, por�m o usu�rio ainda poder� acrescentar
novos recursos cujo os pre�os est�o descritos. O valor total do carro dever� ser o pre�o
inicial de f�brica mais o valor de cada recurso adicionado.*/

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
		System.out.println("Digite o preco inicial do ve�culo:");
		preco_inicial = entrada.nextDouble();

		System.out.println("Deseja acrescentar ar condicionado ao seu ve�culo? (S) Sim ou (N) N�o");
		opcao = entrada.next().charAt(0);

		if (opcao == 'S') {
			recurso1 = ar_cond;
			System.out.println("Valor do recurso: R$ " + recurso1);

		} else {

		}
		System.out.println("Deseja acrescentar pintura met�lica ao seu ve�culo? (S) Sim ou (N) N�o");
		opcao = entrada.next().charAt(0);
		if (opcao == 'S') {
			recurso2 = pint_met;

			System.out.println("Valor do recurso: R$ " + recurso2);

		} else {

		}
		System.out.println("Deseja acrescentar vidro el�trico ao seu ve�culo? (S) Sim ou (N) N�o");
		opcao = entrada.next().charAt(0);
		if (opcao == 'S') {
			recurso3 = vid_elet;

			System.out.println("Valor do recurso: R$ " + recurso3);

		} else {

		}
		System.out.println("Deseja acrescentar dire��o hidr�ulica ao seu ve�culo? (S) Sim ou (N) N�o");
		opcao = entrada.next().charAt(0);
		if (opcao == 'S') {
			recurso4 = dir_hid;

			System.out.println("Valor do recurso: R$ " + recurso4);

		} else {

		}

		preco_total = preco_inicial + recurso1 + recurso2 + recurso3 + recurso4;

		System.out.println("Pre�o total do ve�culo: " + preco_total);

		entrada.close();
	}
}
