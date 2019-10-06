package lista_exercicios_N1;

import java.util.Scanner;

public class Exercicio_42_formula_equacao {

	public static void main(String[] args) {

		double A, B, C, X;
		double Y = 0;
		char codigo;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha o código da fórmula desejada:\n\n(1)\n(2)\n(3)\n(4)");
		codigo = entrada.next().charAt(0);
		System.out.println("Digite valores para A,B,C e X, nesta sequência:");
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		C = entrada.nextDouble();
		X = entrada.nextDouble();

		double form1 = (((A * (Math.pow(X, 2.0))) - (B * X)) + C) / ((B * X) - C);
		double form2 = (A * (Math.pow(X, 2.0)) + (B * X) + C);
		double form3 = (((A * X) + (C * Math.pow(X, 3.0))) / (4 * X));
		double form4 = (B * (Math.pow(X, 4.0))) - 1;

		if (A != 0 && B != 0 && C != 0 && X != 0) {
			if (codigo == '1') {
				Y = form1;
			} else if (codigo == '2') {
				Y = form2;
			} else if (codigo == '3') {
				Y = form3;
			} else {
				Y = form4;
			}
		} else {
			System.out.println("Valor inválido.");
		}

		System.out.printf("O cálculo da fórmula selecionada é: %.2f.", Y);

		entrada.close();
	}
}
