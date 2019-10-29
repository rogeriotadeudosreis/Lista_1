package Lista_Exercicios_N2;

/*Faça um programa que verifique se determinado número X é primo. Obs. Um número é
considerado primo se for divisível apenas por 1 e por ele mesmo.*/

import java.util.Scanner;

public class Exercicio_31_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int i, numero = 0, primo = 2, qtdeDivisores = 0;

		System.out.printf("Digite um número inteiro: ");
		numero = teclado.nextInt();
		System.out.println();
		System.out.printf("Os divisores do número %d são: ", numero);
		
		for (i = 1; i <= numero; i++) {

			if (numero % i == 0) {
				
				qtdeDivisores ++;
				
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n");
		System.out.printf("A quantidade de divisores é: %d\n", qtdeDivisores);
		if (qtdeDivisores == primo) {
			System.out.printf("-----O número %d É PRIMO!-----\n", numero);
		}else {
			System.out.printf("-----O número %d NÃO É PRIMO!-----\n", numero);
		}
		
		teclado.close();
	}
}





