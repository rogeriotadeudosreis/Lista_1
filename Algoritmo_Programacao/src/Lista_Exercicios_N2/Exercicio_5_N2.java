package Lista_Exercicios_N2;

/*Faça um programa que leia um número indeterminado de números, calcule e mostre a
soma dos números digitados, a quantidade de números digitados e a média dos números
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

			System.out.printf("Digite o %d.o número:", cont + 1);
			num = entrada.nextInt();
			System.out.print("Continuar digitando número ? S (Sim) ou N (Não)");
			resp = entrada.next().charAt(0);

			soma = soma + num;
			quant++;
			cont++;

		}while (resp == 'S' || resp == 's');
		media = soma / quant;

		System.out.println("Fim da digitação");
		System.out.printf("A soma dos números é: %.1f\n", soma);
		System.out.printf("A quantidade de números digitados foi: %d\n", quant);
		System.out.printf("A média entre os números digitados é: %.1f\n", media);
		entrada.close();
	}
}
