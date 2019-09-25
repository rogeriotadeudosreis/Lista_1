package lista_exercicios_N1;

/*Uma loja resolveu realizar uma promoção de seus produtos oferecendo um desconto
variável informado pelo vendedor. Escreva um programa que leia o valor original do
produto e o valor do desconto oferecido pelo vendedor e imprima o novo valor do
produto.*/
import java.util.Scanner;

public class Exercicio_9_promocao_de_produtos {

	public static void main(String[] argas) {
		Scanner entrada = new Scanner(System.in);
		String vendedor;
		double desconto, valor_orig_produto, novo_valor;

		System.out.print("Informe o nome do vendedor:");
		vendedor = entrada.nextLine();
		System.out.print(vendedor + ", informe o valor original do produto:");
		valor_orig_produto = entrada.nextDouble();
		System.out.print("Agora, informe o valor do desconto nesse produto:");
		desconto = entrada.nextDouble();

		novo_valor = valor_orig_produto - desconto;

		System.out.printf("O novo valor do produto com desconto é:%4.2f.", novo_valor);
		entrada.close();
	}
}
