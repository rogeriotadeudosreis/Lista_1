package lista_exercicios_N1;
/*17. Faça um programa que leia via teclado um valor, em dólares, e a cotação do dólar; converta
e imprima o mesmo num valor em reais.*/

import java.util.Scanner;

public class exercicio_17_conversao_valores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double dolar, cotacao, valor_em_reais;

		System.out.print("Usuário, informe a cotação do dólar:");
		cotacao = entrada.nextDouble();
		System.out.print("Agora, informe o valor em dolar:");
		dolar = entrada.nextDouble();

		valor_em_reais = dolar * cotacao;
		System.out.printf("O valor convertido em reais é: R$ %4.2f.", valor_em_reais);
		entrada.close();

	}
}
