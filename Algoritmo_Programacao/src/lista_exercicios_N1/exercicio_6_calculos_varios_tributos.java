package lista_exercicios_N1;

/*Para o cálculo de vários tributos, a base de cálculo é o salário mínimo. Faça um programa
que leia o valor do salário mínimo e o valor do salário de uma pessoa. Calcule e imprima
quantos salários mínimos a pessoa ganha.*/
import java.util.Scanner;

public class exercicio_6_calculos_varios_tributos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double sal_min, salario, quant_sal_min;
		String nome;

		System.out.print("Informe seu nome:");
		nome = entrada.nextLine();
		System.out.print(nome + ", informe seu salário:");
		salario = entrada.nextDouble();
		System.out.print("Informe o valor do salário mínimo:");
		sal_min = entrada.nextDouble();
		quant_sal_min = salario / sal_min;

		System.out.printf(
				"Com base nessas informações, a quantidade de salários mínimos que %s recebe é %4.2f salários mínimos."
						+ "",
				nome, quant_sal_min);
		entrada.close();

	}

}
