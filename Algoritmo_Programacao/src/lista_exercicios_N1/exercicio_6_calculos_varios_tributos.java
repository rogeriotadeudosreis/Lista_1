package lista_exercicios_N1;

/*Para o c�lculo de v�rios tributos, a base de c�lculo � o sal�rio m�nimo. Fa�a um programa
que leia o valor do sal�rio m�nimo e o valor do sal�rio de uma pessoa. Calcule e imprima
quantos sal�rios m�nimos a pessoa ganha.*/
import java.util.Scanner;

public class exercicio_6_calculos_varios_tributos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double sal_min, salario, quant_sal_min;
		String nome;

		System.out.print("Informe seu nome:");
		nome = entrada.nextLine();
		System.out.print(nome + ", informe seu sal�rio:");
		salario = entrada.nextDouble();
		System.out.print("Informe o valor do sal�rio m�nimo:");
		sal_min = entrada.nextDouble();
		quant_sal_min = salario / sal_min;

		System.out.printf(
				"Com base nessas informa��es, a quantidade de sal�rios m�nimos que %s recebe � %4.2f sal�rios m�nimos."
						+ "",
				nome, quant_sal_min);
		entrada.close();

	}

}
