package Lista_Exercicios_N2;

/*Fa�a um programa que calcule se um n�mero lido pelo usu�rio � perfeito. Um n�mero
X � perfeito se a soma dos seus divisores, exceto ele mesmo, � igual a X. Por exemplo,
6 � perfeito visto que 1+2+3 = 6.*/

import java.util.Scanner;

public class Exercicio_30_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int i, soma = 0, divisores = 0, numero;

		System.out.printf("Digite um n�mero inteiro: ");
		numero = teclado.nextInt();
		System.out.println("--------------------------");
		System.out.print("Seus divisores s�o: ");
		for (i = 1; i < numero; i++) {

			if (numero % i == 0) {

				soma += i;
				
				System.out.printf("%d ", i);
				
			}
		}
		System.out.println("\n");
		
		if (soma == numero) {
			
			System.out.printf("A soma de seus divisores �: %d , portanto o n�mero %d � PERFEITO.\n", soma, numero);
		} else {
			System.out.printf("A soma de seus divisores �: %d , portanto o n�mero %d N�O � PERFEITO.\n", soma, numero);
		}
		teclado.close();
	}
}
