package lista_exercicios_N1;

import java.util.Scanner;

public class Exercicio_28_calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char opera��o;
		double num1, num2, resultado;
		System.out.println("Digite o primerio n�mero:");
		num1 = entrada.nextDouble();
		System.out.println("Digite o segundo n�mero:");
		num2 = entrada.nextDouble();
		System.out.println("Digite a op��o de opera��o:");
		opera��o = entrada.next().charAt(0);

		switch (opera��o) {

		case '1':

			resultado = num1 + num2;
			System.out.printf("Resultado da opera��o:%4.0f\n", resultado);
			break;
		case '2':
			resultado = num1 - num2;
			System.out.printf("Resultado da opera��o:%4.0f\n", resultado);
			break;
		case '3':
			resultado = num1 * num2;
			System.out.printf("Resultado da opera��o:%4.0f\n", resultado);
			break;
		case '4':
			if (num2 > 0) {
				resultado = num1 / num2;
				System.out.printf("Resultado da opera��o:%4.0f\nFim da opera��o.", resultado);
			} else {
				System.out.println("Divis�o imposs�vel.\nFim da opera��o.");
			}

			break;

		default:
			System.out.println("Op��o inv�lida\nFim da opera��o.");

		}

		entrada.close();
	}
}
