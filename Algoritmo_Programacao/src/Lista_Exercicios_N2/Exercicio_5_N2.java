package Lista_Exercicios_N2;

/*Fa�a um programa que leia um n�mero indeterminado de n�meros, calcule e mostre a
soma dos n�meros digitados, a quantidade de n�meros digitados e a m�dia dos n�meros
digitados.*/

import java.util.Scanner;

public class Exercicio_5_N2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int quant = 0;
		int num = 0;
		double soma = 0;
		double media = 0;
		char resp = 'S';
		int cont = 0;

		 do{

			System.out.printf("Digite o %d.o n�mero:", cont + 1);
			num = entrada.nextInt();
			System.out.print("Continuar digitando n�mero ? S (Sim) ou N (N�o)");
			resp = entrada.next().charAt(0);

			soma = soma + num;
			quant++;
			cont++;

		}while (resp == 'S' || resp == 's');
		media = soma / quant;

		System.out.println("Fim da digita��o");
		System.out.printf("A soma dos n�meros �: %.1f\n", soma);
		System.out.printf("A quantidade de n�meros digitados foi: %d\n", quant);
		System.out.printf("A m�dia entre os n�meros digitados �: %.1f\n", media);
		entrada.close();
	}
}
