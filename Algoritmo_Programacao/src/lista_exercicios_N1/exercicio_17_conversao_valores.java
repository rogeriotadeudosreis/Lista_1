package lista_exercicios_N1;
/*17. Fa�a um programa que leia via teclado um valor, em d�lares, e a cota��o do d�lar; converta
e imprima o mesmo num valor em reais.*/

import java.util.Scanner;

public class exercicio_17_conversao_valores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double dolar, cotacao, valor_em_reais;

		System.out.print("Usu�rio, informe a cota��o do d�lar:");
		cotacao = entrada.nextDouble();
		System.out.print("Agora, informe o valor em dolar:");
		dolar = entrada.nextDouble();

		valor_em_reais = dolar * cotacao;
		System.out.printf("O valor convertido em reais �: R$ %4.2f.", valor_em_reais);
		entrada.close();

	}
}
