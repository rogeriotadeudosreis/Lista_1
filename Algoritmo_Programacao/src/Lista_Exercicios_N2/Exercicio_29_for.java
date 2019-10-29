package Lista_Exercicios_N2;

/*Altere o exercício 23, onde o sistema deverá gerar a tabuada completa de 1 até 10.*/

import java.util.Scanner;

public class Exercicio_29_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero, i, tabuada = 0;
		
		for (numero = 1; numero <=10; numero++) {
			
			System.out.println("");
			System.out.printf("---- Tabuada do %d -----\n\n", numero);
			
			for (i = 1; i <=10; i++) {
				
				tabuada = numero * i;
				System.out.printf("     %d X %d = %d\n",  numero, i, tabuada);
				
			}
		}

		teclado.close();
	}
}
