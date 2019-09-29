package lista_exercicios_N1;

/*Um comerciante calcula o valor da venda, tendo em vista a tabela a seguir. Escreva um
programa que leia o valor da compra e imprima o valor da venda do produto.*/

import java.util.Scanner;

public class Exercicio_36_comerciante {

	public static void main(String[] args) {
		double valor_compra, valor_venda;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de compra:");
		valor_compra = entrada.nextDouble();
		
		if (valor_compra <10) {
			valor_venda = valor_compra + (valor_compra * 0.70);
			System.out.println("O valor de venda desse produto é:"+ valor_venda);
		}else if (valor_compra >=10 && valor_compra <30) {
			valor_venda = valor_compra + (valor_compra * 0.50);
			System.out.println("O valor de venda desse produto é:"+ valor_venda);
		}else if (valor_compra >=30 && valor_compra <50) {
			valor_venda = valor_compra + (valor_compra * 0.40);
			System.out.println("O valor de venda desse produto é:"+ valor_venda);
		}else  {
			valor_venda = valor_compra + (valor_compra * 0.30);
			System.out.println("O valor de venda desse produto é:"+ valor_venda);
		}
		
		entrada.close();
	}
}
