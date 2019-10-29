package Lista_Exercicios_N2;

/*Fa�a um programa que verifique se determinado n�mero X � primo. Obs. Um n�mero �
considerado primo se for divis�vel apenas por 1 e por ele mesmo.*/

import java.util.Scanner;

public class Exercicio_31_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int i, numero = 0, primo = 2, qtdeDivisores = 0;

		System.out.printf("Digite um n�mero inteiro: ");
		numero = teclado.nextInt();
		System.out.println();
		System.out.printf("Os divisores do n�mero %d s�o: ", numero);
		
		for (i = 1; i <= numero; i++) {

			if (numero % i == 0) {
				
				qtdeDivisores ++;
				
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n");
		System.out.printf("A quantidade de divisores �: %d\n", qtdeDivisores);
		if (qtdeDivisores == primo) {
			System.out.printf("-----O n�mero %d � PRIMO!-----\n", numero);
		}else {
			System.out.printf("-----O n�mero %d N�O � PRIMO!-----\n", numero);
		}
		
		teclado.close();
	}
}





