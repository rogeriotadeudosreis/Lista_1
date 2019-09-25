package lista_exercicios_N1;

import java.util.Scanner;

public class Exercicio_28_calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char operação;
		double num1, num2, resultado;
		System.out.println("Digite o primerio número:");
		num1 = entrada.nextDouble();
		System.out.println("Digite o segundo número:");
		num2 = entrada.nextDouble();
		System.out.println("Digite a opção de operação:");
		operação = entrada.next().charAt(0);

		switch (operação) {

		case '1':

			resultado = num1 + num2;
			System.out.printf("Resultado da operação:%4.0f\n", resultado);
			break;
		case '2':
			resultado = num1 - num2;
			System.out.printf("Resultado da operação:%4.0f\n", resultado);
			break;
		case '3':
			resultado = num1 * num2;
			System.out.printf("Resultado da operação:%4.0f\n", resultado);
			break;
		case '4':
			if (num2 > 0) {
				resultado = num1 / num2;
				System.out.printf("Resultado da operação:%4.0f\nFim da operação.", resultado);
			} else {
				System.out.println("Divisão impossível.\nFim da operação.");
			}

			break;

		default:
			System.out.println("Opção inválida\nFim da operação.");

		}

		entrada.close();
	}
}
