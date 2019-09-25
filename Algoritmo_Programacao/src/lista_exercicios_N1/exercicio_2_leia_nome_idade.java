package lista_exercicios_N1;

/*Escreva um programa que leia o nome e a idade de uma pessoa e imprima: “O usuário
*Nome* informou que tem *idade* anos”.*/
import java.util.Scanner;

public class exercicio_2_leia_nome_idade {

	public static void main(String[] argas) {
		Scanner entrada = new Scanner(System.in);

		String nome;
		int idade;

		System.out.print("Informe seu nome:");
		nome = entrada.nextLine();
		System.out.print(nome + ", informe sua idade:");
		idade = entrada.nextInt();
		System.out.printf("O usuário %s informou que tem %d anos.", nome, idade);
		entrada.close();
	}
}
