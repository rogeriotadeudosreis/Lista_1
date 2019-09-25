package lista_exercicios_N1;
/*Escreva um programa que receba quatro números e imprima a média ponderada,
sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.*/

import java.util.Scanner;

public class exercicio_12_media_ponderada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int nota1, nota2, nota3, nota4;
		double media_ponderada, peso;

		System.out.print("Informe a nota1 do aluno:");
		nota1 = entrada.nextInt();
		System.out.print("Informe a nota2 do aluno:");
		nota2 = entrada.nextInt();
		System.out.print("Informe a nota3 do aluno:");
		nota3 = entrada.nextInt();
		System.out.print("Informe a nota4 do aluno:");
		nota4 = entrada.nextInt();

		peso = 1 + 2 + 3 + 4;
		media_ponderada = ((nota1 * 1) + (nota2 * 2) + (nota3 * 3) + (nota4 * 4)) / peso;
		System.out.printf("A média ponderada desse aluno é:%.0f.", media_ponderada);
		entrada.close();

	}
}
