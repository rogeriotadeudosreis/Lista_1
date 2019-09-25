package lista_exercicios_N1;
/*Uma loja resolveu realizar uma promoção de seus produtos oferecendo um desconto
variável em % informado pelo vendedor. Escreva um programa que leia o valor original do
produto e o valor do desconto oferecido pelo vendedor e imprima o novo valor do produto.*/

import java.util.Scanner;

public class exercicio_7_promocao_produtos {

	public static void main(String[] argas) {

		Scanner entrada = new Scanner(System.in);

		String vendedor;
		double valor_prod, desc, valor_prod_com_desc;

		System.out.print("Nome do vendedor:");
		vendedor = entrada.nextLine();
		System.out.print(vendedor + ", informe o valor do produto:");
		valor_prod = entrada.nextDouble();
		System.out.print(vendedor + ", informe o desconto em %:");
		desc = entrada.nextDouble();

		valor_prod_com_desc = valor_prod - (valor_prod * (desc/100));

		System.out.printf("O valor do produto com desconto é:%4.2f\n", valor_prod_com_desc);
		entrada.close();

	}
}
